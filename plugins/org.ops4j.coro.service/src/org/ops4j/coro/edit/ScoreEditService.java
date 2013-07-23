package org.ops4j.coro.edit;

import java.util.List;

import org.eclipse.emf.common.util.EList;
import org.ops4j.coro.model.score.Measure;
import org.ops4j.coro.model.score.Note;
import org.ops4j.coro.model.score.NoteType;
import org.ops4j.coro.model.score.ScoreFactory;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class ScoreEditService {
    
    private static Logger log = LoggerFactory.getLogger(ScoreEditService.class);
    
    private NoteTypeProducer noteTypeProducer = new NoteTypeProducer();

    public void overwriteNote(Note currentNote, Note newNote) {
        assert newNote.getMeasure() == null;
        assert currentNote.getMeasure() != null;
        

        Measure currentMeasure = currentNote.getMeasure();
        List<Note> notes = currentMeasure.getNotes();
        int currentIndex = notes.indexOf(currentNote);
        int currentDuration = currentNote.getDuration();
        int newDuration = newNote.getDuration();
        int start = getRelativeStart(currentNote);
        if (newDuration == currentDuration) {
            replacePitch(currentNote, newNote);
        }
        else if (newDuration < currentDuration) {
            reduceDuration(start, currentNote, newDuration);
            insertBefore(currentNote, newNote);
        }
        else {
            int end = start + newDuration;
            Note tail = null;
            if (end > currentMeasure.getDuration()) {
                newDuration = currentMeasure.getDuration() - start;
                end = currentMeasure.getDuration();
                tail = splitNote(newNote, newDuration);
            }
            
            int index = currentIndex;
            int pos = start;
            while (true) {
                Note note = notes.get(index);
                if (pos + note.getDuration() <= end) {
                    pos += note.getDuration();
                    index++;
                }
                else {
                    break;
                }
            }
            int remainingDuration = end - pos;
            if (remainingDuration > 0) {
                Note lastNote = notes.get(index);
                splitNote(lastNote, remainingDuration);
                index++;
            }
            for (int i = currentIndex; i < index; i++) {
                notes.remove(currentIndex);
            }
            notes.add(currentIndex, newNote);
            
            if (tail != null) {
                Measure nextMeasure = getNextMeasure(currentMeasure);
                overwriteNote(nextMeasure.getNotes().get(0), tail);
            }
        }
    }

    private void replacePitch(Note currentNote, Note newNote) {
        currentNote.setPitch(newNote.getPitch());
    }

    private void insertBefore(Note currentNote, Note newNote) {
        EList<Note> notes = currentNote.getMeasure().getNotes();
        int index = notes.indexOf(currentNote);
        notes.add(index, newNote);        
    }

    private int getRelativeStart(Note currentNote) {
        int start = 0;
        for (Note note : currentNote.getMeasure().getNotes()) {
            if (note == currentNote) {
                break;
            }
            start += note.getDuration();
        }
        return start;
    }

    private Note splitNote(Note currentNote, int newDuration) {
        int remainingDuration = currentNote.getDuration() - newDuration;
        assert remainingDuration > 0;

        currentNote.setDuration(newDuration);
        Note tail = ScoreFactory.eINSTANCE.createNote();
        tail.setPitch(currentNote.getPitch());
        tail.setRest(currentNote.getRest());
        tail.setType(currentNote.getType());
        tail.setDuration(remainingDuration);
        return tail;
    }

    private Note reduceDuration(int offset, Note currentNote, int delta) {
        int remainingDuration = currentNote.getDuration() - delta;
        assert remainingDuration > 0;

        currentNote.setDuration(remainingDuration);
        List<NoteType> noteTypes = noteTypeProducer.getNoteTypes(offset, remainingDuration);
        currentNote.setType(noteTypes.get(0));
        if (noteTypes.size() > 1) {
            log.warn("TODO split note into multiple heads");
        }
        return currentNote;
    }

    private Measure getNextMeasure(Measure currentMeasure) {
        List<Measure> measures = currentMeasure.getPart().getMeasures();
        int index = measures.indexOf(currentMeasure);
        if (index < measures.size()) {
            return measures.get(index);
        }
        return null;
    }
}

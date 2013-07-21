package org.ops4j.coro.edit;

import org.ops4j.coro.model.score.Measure;
import org.ops4j.coro.model.score.Note;
import org.ops4j.coro.model.score.NoteType;
import org.ops4j.coro.model.score.Part;
import org.ops4j.coro.model.score.Pitch;
import org.ops4j.coro.model.score.Rest;
import org.ops4j.coro.model.score.Score;
import org.ops4j.coro.model.score.ScoreFactory;
import org.ops4j.coro.model.score.Step;
import org.ops4j.coro.model.score.Time;


public class ScoreTestFactory {

    public static int DIVISIONS_PER_QUARTER = 24;

    private ScoreFactory factory = ScoreFactory.eINSTANCE;
    
    public Measure createWholeRestMeasure() {
        Part part = createSinglePart();
        Measure measure = appendCommonTimeMeasure(part);
        setWholeRest(measure);
        return measure;
    }
    
    public Part createSinglePart() {
        Score score = factory.createScore();
        Part part = factory.createPart();
        score.getParts().add(part);
        return part;
    }
    
    public Measure appendCommonTimeMeasure(Part part) {
        Measure measure = factory.createMeasure();
        measure.setDivisions(DIVISIONS_PER_QUARTER);
        Time time = factory.createTime();
        time.setNumerator(4);
        time.setDenominator(4);
        measure.setTime(time);        
        part.getMeasures().add(measure);
        return measure;
    }
    
    public Note setWholeRest(Measure measure) {
        Note note = factory.createNote();
        note.setDuration(4 * DIVISIONS_PER_QUARTER);
        note.setType(NoteType.WHOLE);
        Rest rest = factory.createRest();
        note.setRest(rest);
        measure.getNotes().add(note);
        return note;
    }
    
    public Note createQuarterNote(Step step) {
        Note quarter = factory.createNote();
        quarter.setDuration(DIVISIONS_PER_QUARTER);
        quarter.setType(NoteType.QUARTER);
        Pitch pitch = factory.createPitch();
        pitch.setStep(step);
        quarter.setPitch(pitch);
        return quarter;       
    }

    public Note createHalfNote(Step step) {
        Note half = factory.createNote();
        half.setDuration(2 * DIVISIONS_PER_QUARTER);
        half.setType(NoteType.HALF);
        Pitch pitch = factory.createPitch();
        pitch.setStep(step);
        pitch.setOctave(4);
        half.setPitch(pitch);
        return half;        
    }
}

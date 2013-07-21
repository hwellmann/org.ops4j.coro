package org.ops4j.coro.edit;

import java.util.ArrayList;
import java.util.List;

import org.ops4j.coro.model.score.NoteType;
import org.ops4j.coro.model.score.ScoreFactory;
import org.ops4j.coro.model.score.Time;

public class NoteTypeProducer {

    private Time time;

    private int divisionsPerN32;
    private int divisionsPerN16;
    private int divisionsPerEighth;
    private int divisionsPerQuarter;
    private int divisionsPerHalf;
    private int divisionsPerWhole;

    private int divisionsPerMeasure;

    public NoteTypeProducer() {
        this.time = ScoreFactory.eINSTANCE.createTime();
        time.setNumerator(4);
        time.setDenominator(4);
        this.divisionsPerQuarter = 24;
        computeDivisions();
    }

    public NoteTypeProducer(Time time, int divisionsPerQuarter) {
        this.time = time;
        this.divisionsPerQuarter = divisionsPerQuarter;
        computeDivisions();
    }

    private void computeDivisions() {
        divisionsPerMeasure = 4 * divisionsPerQuarter * time.getNumerator() / time.getDenominator();
        divisionsPerHalf = 2 * divisionsPerQuarter;
        divisionsPerWhole = 2 * divisionsPerHalf;
        divisionsPerEighth = divisionsPerQuarter / 2;
        divisionsPerN16 = divisionsPerEighth / 2;
        divisionsPerN32 = divisionsPerN16 / 2;        
    }

    public Time getTime() {
        return time;
    }

    public int getDivisionsPerQuarter() {
        return divisionsPerQuarter;
    }

    public int getDivisionsPerMeasure() {
        return divisionsPerMeasure;
    }

    public List<NoteType> getNoteTypes(int offset, int duration) {
        List<NoteType> noteTypes = new ArrayList<>();
        appendNoteTypesForOffset(noteTypes, offset, duration);
        return noteTypes;
    }
    
    private void appendNoteTypesForOffset(List<NoteType> noteTypes, int offset, int duration) {
        int remainder = offset + duration - divisionsPerMeasure; 
        if (remainder > 0) {
            appendNoteTypesForOffset(noteTypes, offset, duration-remainder);
            appendNoteTypes(noteTypes, remainder);
            return;
        }
        
        if (offset % divisionsPerMeasure == 0) {
            appendNoteTypes(noteTypes, duration);
            return;
        }
        
        if (duration >= divisionsPerWhole && offset % divisionsPerWhole == 0) {
            appendNoteTypes(noteTypes, divisionsPerWhole);
            appendNoteTypesForOffset(noteTypes, offset + divisionsPerWhole, duration - divisionsPerWhole);
        }
        else if (duration >= divisionsPerHalf && offset % divisionsPerHalf == 0) {
            appendNoteTypes(noteTypes, divisionsPerHalf);
            appendNoteTypesForOffset(noteTypes, offset + divisionsPerHalf, duration - divisionsPerHalf);
        }
        else if (duration >= divisionsPerQuarter && offset % divisionsPerQuarter == 0) {
            appendNoteTypes(noteTypes, divisionsPerQuarter);
            appendNoteTypesForOffset(noteTypes, offset + divisionsPerQuarter, duration - divisionsPerQuarter);
        }
        else if (duration >= divisionsPerEighth && offset % divisionsPerEighth == 0) {
            appendNoteTypes(noteTypes, divisionsPerEighth);
            appendNoteTypesForOffset(noteTypes, offset + divisionsPerEighth, duration - divisionsPerEighth);
        }
        else if (duration >= divisionsPerN16 && offset % divisionsPerN16 == 0) {
            appendNoteTypes(noteTypes, divisionsPerN16);
            appendNoteTypesForOffset(noteTypes, offset + divisionsPerN16, duration - divisionsPerN16);
        }
        else if (duration >= divisionsPerN32 && offset % divisionsPerN32 == 0) {
            appendNoteTypes(noteTypes, divisionsPerN32);
            appendNoteTypesForOffset(noteTypes, offset + divisionsPerN32, duration - divisionsPerN32);
        }
    }
    
    private void appendNoteTypes(List<NoteType> noteTypes, int duration) {
        if (duration == 0) {
            return;
        }
        if (duration >= divisionsPerWhole) {
            noteTypes.add(NoteType.WHOLE);
            appendNoteTypes(noteTypes, duration - divisionsPerWhole);
        }
        else if (duration >= divisionsPerHalf) {
            noteTypes.add(NoteType.HALF);
            appendNoteTypes(noteTypes, duration - divisionsPerHalf);
        }
        else if (duration >= divisionsPerQuarter) {
            noteTypes.add(NoteType.QUARTER);
            appendNoteTypes(noteTypes, duration - divisionsPerQuarter);
        }
        else if (duration >= divisionsPerEighth) {
            noteTypes.add(NoteType.EIGHTH);
            appendNoteTypes(noteTypes, duration - divisionsPerEighth);
        }
        else if (duration >= divisionsPerN16) {
            noteTypes.add(NoteType.N16TH);
            appendNoteTypes(noteTypes, duration - divisionsPerN16);
        }
        else if (duration >= divisionsPerN32) {
            noteTypes.add(NoteType.N32ND);
            appendNoteTypes(noteTypes, duration - divisionsPerN32);
        }        
    }
}

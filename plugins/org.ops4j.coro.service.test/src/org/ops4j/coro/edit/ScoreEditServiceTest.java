package org.ops4j.coro.edit;

import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.CoreMatchers.notNullValue;
import static org.hamcrest.CoreMatchers.sameInstance;
import static org.junit.Assert.assertThat;
import static org.ops4j.coro.edit.ScoreTestFactory.DIVISIONS_PER_QUARTER;

import org.junit.Before;
import org.junit.Test;
import org.ops4j.coro.model.score.Measure;
import org.ops4j.coro.model.score.Note;
import org.ops4j.coro.model.score.Part;
import org.ops4j.coro.model.score.Step;


public class ScoreEditServiceTest {
    
    
    private ScoreEditService editService = new ScoreEditService();
    private ScoreTestFactory testFactory = new ScoreTestFactory();

    private Measure measure;
    
    @Before
    public void before() {
        measure = testFactory.createWholeRestMeasure();
    }
    
    @Test
    public void overwriteWholeRestWithHalfNote() {
        
        Note halfNote = testFactory.createHalfNote(Step.A);
                
        Note firstNote = measure.getNotes().get(0);
        editService.overwriteNote(firstNote, halfNote);
        
        Part part = measure.getPart();
        assertThat(part.getMeasures().size(), is(1));
        assertThat(part.getMeasures().get(0), is(measure));
        assertThat(measure.getNotes().size(), is(2));
        assertThat(measure.getNotes().get(0), is(sameInstance(halfNote)));
        assertThat(halfNote.getMeasure(), is(measure));
        
        Note halfRest = measure.getNotes().get(1);
        assertThat(halfRest.getDuration(), is(2 * DIVISIONS_PER_QUARTER));
        assertThat(halfRest, is(sameInstance(firstNote)));        
        assertThat(halfRest.getMeasure(), is(measure));
    }

    @Test
    public void overwriteWholeRestWithQuarterNote() {
        
        Note quarterNote = testFactory.createQuarterNote(Step.A);
                
        Note firstNote = measure.getNotes().get(0);
        editService.overwriteNote(firstNote, quarterNote);
        
        Part part = measure.getPart();
        assertThat(part.getMeasures().size(), is(1));
        assertThat(part.getMeasures().get(0), is(measure));
        assertThat(measure.getNotes().size(), is(2));
        assertThat(measure.getNotes().get(0), is(sameInstance(quarterNote)));
        assertThat(quarterNote.getMeasure(), is(measure));
        
        Note halfRest = measure.getNotes().get(1);
        assertThat(halfRest.getDuration(), is(3 * DIVISIONS_PER_QUARTER));
        assertThat(halfRest, is(sameInstance(firstNote)));        
        assertThat(halfRest.getMeasure(), is(measure));
    }

    @Test
    public void overwriteHalfRestWithHalfNote() {
        
        Note halfNoteA = testFactory.createHalfNote(Step.A);
        Note halfNoteG = testFactory.createHalfNote(Step.G);
        
        Note firstNote = measure.getNotes().get(0);
        editService.overwriteNote(firstNote, halfNoteA);
        
        assertThat(measure.getNotes().size(), is(2));
        assertThat(measure.getNotes().get(0), is(sameInstance(halfNoteA)));
        
        Note halfRest = measure.getNotes().get(1);
        assertThat(halfRest.getDuration(), is(2 * DIVISIONS_PER_QUARTER));
        editService.overwriteNote(halfRest, halfNoteG);
        assertThat(measure.getNotes().size(), is(2));
        Note secondNote = measure.getNotes().get(1);
        
        assertThat(secondNote.getDuration(), is(2 * DIVISIONS_PER_QUARTER));
        assertThat(secondNote.getPitch().getStep(), is(Step.G));        
    }

    @Test
    public void overwriteHalfRestWithQuarterNote() {
        
        Note halfNoteA = testFactory.createHalfNote(Step.A);
        Note quarterNoteG = testFactory.createQuarterNote(Step.G);
        
        Note firstNote = measure.getNotes().get(0);
        editService.overwriteNote(firstNote, halfNoteA);
        
        assertThat(measure.getNotes().size(), is(2));
        assertThat(measure.getNotes().get(0), is(sameInstance(halfNoteA)));
        
        Note halfRest = measure.getNotes().get(1);
        assertThat(halfRest.getDuration(), is(2 * DIVISIONS_PER_QUARTER));
        editService.overwriteNote(halfRest, quarterNoteG);
        assertThat(measure.getNotes().size(), is(3));
        Note secondNote = measure.getNotes().get(1);
        Note thirdNote = measure.getNotes().get(2);
        
        assertThat(secondNote.getDuration(), is(DIVISIONS_PER_QUARTER));
        assertThat(secondNote.getPitch().getStep(), is(Step.G));        

        assertThat(thirdNote.getDuration(), is(DIVISIONS_PER_QUARTER));
        assertThat(thirdNote.getRest(), is(notNullValue()));        
    }

}

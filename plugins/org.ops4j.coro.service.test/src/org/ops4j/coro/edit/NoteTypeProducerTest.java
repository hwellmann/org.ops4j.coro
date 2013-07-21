package org.ops4j.coro.edit;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;

import java.util.List;

import org.junit.Before;
import org.junit.Test;
import org.ops4j.coro.model.score.NoteType;

public class NoteTypeProducerTest {     
    
    private NoteTypeProducer producer;

    @Before
    public void before() {
        producer = new NoteTypeProducer();
    }

    @Test
    public void verifySetup() {
        assertThat(producer.getDivisionsPerQuarter(), is(24));
        assertThat(producer.getDivisionsPerMeasure(), is(96));
    }

    @Test
    public void wholeAtStart() {
        List<NoteType> noteTypes = producer.getNoteTypes(0, 96);
        assertThat(noteTypes.size(), is(1));
        assertThat(noteTypes.get(0), is(NoteType.WHOLE));
    }

    @Test
    public void halfAtStart() {
        List<NoteType> noteTypes = producer.getNoteTypes(0, 48);
        assertThat(noteTypes.size(), is(1));
        assertThat(noteTypes.get(0), is(NoteType.HALF));
    }

    @Test
    public void quarterAtStart() {
        List<NoteType> noteTypes = producer.getNoteTypes(0, 24);
        assertThat(noteTypes.size(), is(1));
        assertThat(noteTypes.get(0), is(NoteType.QUARTER));
    }

    @Test
    public void eighthAtStart() {
        List<NoteType> noteTypes = producer.getNoteTypes(0, 12);
        assertThat(noteTypes.size(), is(1));
        assertThat(noteTypes.get(0), is(NoteType.EIGHTH));
    }

    @Test
    public void n16thAtStart() {
        List<NoteType> noteTypes = producer.getNoteTypes(0, 6);
        assertThat(noteTypes.size(), is(1));
        assertThat(noteTypes.get(0), is(NoteType.N16TH));
    }

    @Test
    public void n32ndAtStart() {
        List<NoteType> noteTypes = producer.getNoteTypes(0, 3);
        assertThat(noteTypes.size(), is(1));
        assertThat(noteTypes.get(0), is(NoteType.N32ND));
    }
    
    @Test
    public void wholeAtHalf() {
        List<NoteType> noteTypes = producer.getNoteTypes(48, 96);
        assertThat(noteTypes.size(), is(2));
        assertThat(noteTypes.get(0), is(NoteType.HALF));
        assertThat(noteTypes.get(1), is(NoteType.HALF));        
    }

    @Test
    public void wholeAtQuarter() {
        List<NoteType> noteTypes = producer.getNoteTypes(24, 96);
        assertThat(noteTypes.size(), is(3));
        assertThat(noteTypes.get(0), is(NoteType.QUARTER));
        assertThat(noteTypes.get(1), is(NoteType.HALF));        
        assertThat(noteTypes.get(2), is(NoteType.QUARTER));
    }

    @Test
    public void wholeAtThreeQuarters() {
        List<NoteType> noteTypes = producer.getNoteTypes(72, 96);
        assertThat(noteTypes.size(), is(3));
        assertThat(noteTypes.get(0), is(NoteType.QUARTER));
        assertThat(noteTypes.get(1), is(NoteType.HALF));        
        assertThat(noteTypes.get(2), is(NoteType.QUARTER));
    }
    
    @Test
    public void wholeAtEighth() {
        List<NoteType> noteTypes = producer.getNoteTypes(12, 96);
        assertThat(noteTypes.size(), is(4));
        assertThat(noteTypes.get(0), is(NoteType.EIGHTH));
        assertThat(noteTypes.get(1), is(NoteType.QUARTER));        
        assertThat(noteTypes.get(2), is(NoteType.HALF));
        assertThat(noteTypes.get(3), is(NoteType.EIGHTH));
    }

    @Test
    public void wholeAtThreeEighths() {
        List<NoteType> noteTypes = producer.getNoteTypes(36, 96);
        assertThat(noteTypes.size(), is(4));
        assertThat(noteTypes.get(0), is(NoteType.EIGHTH));
        assertThat(noteTypes.get(1), is(NoteType.HALF));
        assertThat(noteTypes.get(2), is(NoteType.QUARTER));        
        assertThat(noteTypes.get(3), is(NoteType.EIGHTH));
    }

    @Test
    public void wholeAtFiveEighths() {
        List<NoteType> noteTypes = producer.getNoteTypes(60, 96);
        assertThat(noteTypes.size(), is(4));
        assertThat(noteTypes.get(0), is(NoteType.EIGHTH));
        assertThat(noteTypes.get(1), is(NoteType.QUARTER));        
        assertThat(noteTypes.get(2), is(NoteType.HALF));
        assertThat(noteTypes.get(3), is(NoteType.EIGHTH));
    }

    @Test
    public void wholeAtSixteenth() {
        List<NoteType> noteTypes = producer.getNoteTypes(6, 96);
        assertThat(noteTypes.size(), is(5));
        assertThat(noteTypes.get(0), is(NoteType.N16TH));
        assertThat(noteTypes.get(1), is(NoteType.EIGHTH));
        assertThat(noteTypes.get(2), is(NoteType.QUARTER));        
        assertThat(noteTypes.get(3), is(NoteType.HALF));
        assertThat(noteTypes.get(4), is(NoteType.N16TH));
    }

    @Test
    public void wholeAtThreeSixteenths() {
        List<NoteType> noteTypes = producer.getNoteTypes(18, 96);
        assertThat(noteTypes.size(), is(5));
        assertThat(noteTypes.get(0), is(NoteType.N16TH));
        assertThat(noteTypes.get(1), is(NoteType.QUARTER));        
        assertThat(noteTypes.get(2), is(NoteType.HALF));
        assertThat(noteTypes.get(3), is(NoteType.EIGHTH));
        assertThat(noteTypes.get(4), is(NoteType.N16TH));
    }

    @Test
    public void wholeAtFiveSixteenths() {
        List<NoteType> noteTypes = producer.getNoteTypes(30, 96);
        assertThat(noteTypes.size(), is(5));
        assertThat(noteTypes.get(0), is(NoteType.N16TH));
        assertThat(noteTypes.get(1), is(NoteType.EIGHTH));
        assertThat(noteTypes.get(2), is(NoteType.HALF));
        assertThat(noteTypes.get(3), is(NoteType.QUARTER));        
        assertThat(noteTypes.get(4), is(NoteType.N16TH));
    }

    @Test
    public void wholeAtSevenSixteenths() {
        List<NoteType> noteTypes = producer.getNoteTypes(42, 96);
        assertThat(noteTypes.size(), is(5));
        assertThat(noteTypes.get(0), is(NoteType.N16TH));
        assertThat(noteTypes.get(1), is(NoteType.HALF));
        assertThat(noteTypes.get(2), is(NoteType.QUARTER));        
        assertThat(noteTypes.get(3), is(NoteType.EIGHTH));
        assertThat(noteTypes.get(4), is(NoteType.N16TH));
    }

    @Test
    public void wholeAtNineSixteenths() {
        List<NoteType> noteTypes = producer.getNoteTypes(54, 96);
        assertThat(noteTypes.size(), is(5));
        assertThat(noteTypes.get(0), is(NoteType.N16TH));
        assertThat(noteTypes.get(1), is(NoteType.EIGHTH));
        assertThat(noteTypes.get(2), is(NoteType.QUARTER));        
        assertThat(noteTypes.get(3), is(NoteType.HALF));
        assertThat(noteTypes.get(4), is(NoteType.N16TH));
    }

    @Test
    public void wholeAtElevenSixteenths() {
        List<NoteType> noteTypes = producer.getNoteTypes(66, 96);
        assertThat(noteTypes.size(), is(5));
        assertThat(noteTypes.get(0), is(NoteType.N16TH));
        assertThat(noteTypes.get(1), is(NoteType.QUARTER));        
        assertThat(noteTypes.get(2), is(NoteType.HALF));
        assertThat(noteTypes.get(3), is(NoteType.EIGHTH));
        assertThat(noteTypes.get(4), is(NoteType.N16TH));

    }
    @Test
    public void wholeAtThirteenSixteenths() {
        List<NoteType> noteTypes = producer.getNoteTypes(78, 96);
        assertThat(noteTypes.size(), is(5));
        assertThat(noteTypes.get(0), is(NoteType.N16TH));
        assertThat(noteTypes.get(1), is(NoteType.EIGHTH));
        assertThat(noteTypes.get(2), is(NoteType.HALF));
        assertThat(noteTypes.get(3), is(NoteType.QUARTER));        
        assertThat(noteTypes.get(4), is(NoteType.N16TH));
    }

    @Test
    public void wholeAtFifteenSixteenths() {
        List<NoteType> noteTypes = producer.getNoteTypes(42, 96);
        assertThat(noteTypes.size(), is(5));
        assertThat(noteTypes.get(0), is(NoteType.N16TH));
        assertThat(noteTypes.get(1), is(NoteType.HALF));
        assertThat(noteTypes.get(2), is(NoteType.QUARTER));        
        assertThat(noteTypes.get(3), is(NoteType.EIGHTH));
        assertThat(noteTypes.get(4), is(NoteType.N16TH));
    }

    @Test
    public void halfAtHalf() {
        List<NoteType> noteTypes = producer.getNoteTypes(48, 48);
        assertThat(noteTypes.size(), is(1));
        assertThat(noteTypes.get(0), is(NoteType.HALF));
    }

    @Test
    public void halfAtQuarter() {
        List<NoteType> noteTypes = producer.getNoteTypes(24, 48);
        assertThat(noteTypes.size(), is(2));
        assertThat(noteTypes.get(0), is(NoteType.QUARTER));
        assertThat(noteTypes.get(1), is(NoteType.QUARTER));
    }

    @Test
    public void halfAtThreeQuarters() {
        List<NoteType> noteTypes = producer.getNoteTypes(24, 48);
        assertThat(noteTypes.size(), is(2));
        assertThat(noteTypes.get(0), is(NoteType.QUARTER));
        assertThat(noteTypes.get(1), is(NoteType.QUARTER));
    }

    @Test
    public void halfAtEighth() {
        List<NoteType> noteTypes = producer.getNoteTypes(12, 48);
        assertThat(noteTypes.size(), is(3));
        assertThat(noteTypes.get(0), is(NoteType.EIGHTH));
        assertThat(noteTypes.get(1), is(NoteType.QUARTER));
        assertThat(noteTypes.get(2), is(NoteType.EIGHTH));
    }

    @Test
    public void halfAtThreeEighths() {
        List<NoteType> noteTypes = producer.getNoteTypes(36, 48);
        assertThat(noteTypes.size(), is(3));
        assertThat(noteTypes.get(0), is(NoteType.EIGHTH));
        assertThat(noteTypes.get(1), is(NoteType.QUARTER));
        assertThat(noteTypes.get(2), is(NoteType.EIGHTH));
    }

    @Test
    public void halfAtFiveEighths() {
        List<NoteType> noteTypes = producer.getNoteTypes(60, 48);
        assertThat(noteTypes.size(), is(3));
        assertThat(noteTypes.get(0), is(NoteType.EIGHTH));
        assertThat(noteTypes.get(1), is(NoteType.QUARTER));
        assertThat(noteTypes.get(2), is(NoteType.EIGHTH));
    }

    @Test
    public void halfAtSevenEighths() {
        List<NoteType> noteTypes = producer.getNoteTypes(84, 48);
        assertThat(noteTypes.size(), is(3));
        assertThat(noteTypes.get(0), is(NoteType.EIGHTH));
        assertThat(noteTypes.get(1), is(NoteType.QUARTER));
        assertThat(noteTypes.get(2), is(NoteType.EIGHTH));
    }
    
    @Test
    public void halfAtSixteenth() {
        List<NoteType> noteTypes = producer.getNoteTypes(6, 48);
        assertThat(noteTypes.size(), is(4));
        assertThat(noteTypes.get(0), is(NoteType.N16TH));
        assertThat(noteTypes.get(1), is(NoteType.EIGHTH));
        assertThat(noteTypes.get(2), is(NoteType.QUARTER));        
        assertThat(noteTypes.get(3), is(NoteType.N16TH));
    }

    @Test
    public void halfAtThreeSixteenths() {
        List<NoteType> noteTypes = producer.getNoteTypes(18, 48);
        assertThat(noteTypes.size(), is(4));
        assertThat(noteTypes.get(0), is(NoteType.N16TH));
        assertThat(noteTypes.get(1), is(NoteType.QUARTER));        
        assertThat(noteTypes.get(2), is(NoteType.EIGHTH));
        assertThat(noteTypes.get(3), is(NoteType.N16TH));
    }

    @Test
    public void halfAtFiveSixteenths() {
        List<NoteType> noteTypes = producer.getNoteTypes(30, 48);
        assertThat(noteTypes.size(), is(4));
        assertThat(noteTypes.get(0), is(NoteType.N16TH));
        assertThat(noteTypes.get(1), is(NoteType.EIGHTH));
        assertThat(noteTypes.get(2), is(NoteType.QUARTER));        
        assertThat(noteTypes.get(3), is(NoteType.N16TH));
    }

    @Test
    public void halfAtSevenSixteenths() {
        List<NoteType> noteTypes = producer.getNoteTypes(42, 48);
        assertThat(noteTypes.size(), is(4));
        assertThat(noteTypes.get(0), is(NoteType.N16TH));
        assertThat(noteTypes.get(1), is(NoteType.QUARTER));        
        assertThat(noteTypes.get(2), is(NoteType.EIGHTH));
        assertThat(noteTypes.get(3), is(NoteType.N16TH));
    }

    @Test
    public void halfAtNineSixteenths() {
        List<NoteType> noteTypes = producer.getNoteTypes(54, 48);
        assertThat(noteTypes.size(), is(4));
        assertThat(noteTypes.get(0), is(NoteType.N16TH));
        assertThat(noteTypes.get(1), is(NoteType.EIGHTH));
        assertThat(noteTypes.get(2), is(NoteType.QUARTER));        
        assertThat(noteTypes.get(3), is(NoteType.N16TH));
    }

    @Test
    public void halfAtElevenSixteenths() {
        List<NoteType> noteTypes = producer.getNoteTypes(66, 48);
        assertThat(noteTypes.size(), is(4));
        assertThat(noteTypes.get(0), is(NoteType.N16TH));
        assertThat(noteTypes.get(1), is(NoteType.QUARTER));        
        assertThat(noteTypes.get(2), is(NoteType.EIGHTH));
        assertThat(noteTypes.get(3), is(NoteType.N16TH));

    }
    @Test
    public void halfAtThirteenSixteenths() {
        List<NoteType> noteTypes = producer.getNoteTypes(78, 48);
        assertThat(noteTypes.size(), is(4));
        assertThat(noteTypes.get(0), is(NoteType.N16TH));
        assertThat(noteTypes.get(1), is(NoteType.EIGHTH));
        assertThat(noteTypes.get(2), is(NoteType.QUARTER));        
        assertThat(noteTypes.get(3), is(NoteType.N16TH));
    }

    @Test
    public void halfAtFifteenSixteenths() {
        List<NoteType> noteTypes = producer.getNoteTypes(42, 48);
        assertThat(noteTypes.size(), is(4));
        assertThat(noteTypes.get(0), is(NoteType.N16TH));
        assertThat(noteTypes.get(1), is(NoteType.QUARTER));        
        assertThat(noteTypes.get(2), is(NoteType.EIGHTH));
        assertThat(noteTypes.get(3), is(NoteType.N16TH));
    }
}

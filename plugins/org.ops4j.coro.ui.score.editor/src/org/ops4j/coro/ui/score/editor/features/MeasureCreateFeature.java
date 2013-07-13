package org.ops4j.coro.ui.score.editor.features;

import java.util.List;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.graphiti.features.IFeatureProvider;
import org.eclipse.graphiti.features.context.ICreateContext;
import org.eclipse.graphiti.features.impl.AbstractCreateFeature;
import org.eclipse.graphiti.mm.pictograms.ContainerShape;
import org.ops4j.coro.model.score.BarLine;
import org.ops4j.coro.model.score.Measure;
import org.ops4j.coro.model.score.Note;
import org.ops4j.coro.model.score.NoteType;
import org.ops4j.coro.model.score.Part;
import org.ops4j.coro.model.score.Position;
import org.ops4j.coro.model.score.Rest;
import org.ops4j.coro.model.score.ScoreFactory;

public class MeasureCreateFeature extends AbstractCreateFeature {
    
    /** 
     * Divisions per quarter note.
     * TODO make configurable 
     */
    public static final int DIVISIONS = 24;

    public MeasureCreateFeature(IFeatureProvider fp) {
        super(fp, "Measure", "Create a measure");
    }

    public boolean canCreate(ICreateContext context) {
        ContainerShape target = context.getTargetContainer();
        if (!(target instanceof ContainerShape)) {
            return false;
        }
        List<EObject> containerObjects = context.getTargetContainer().getLink()
            .getBusinessObjects();
        if (containerObjects.isEmpty()) {
            return false;
        }
        EObject container = containerObjects.get(0);
        return (container instanceof Part) || (container instanceof Measure);
    }

    public Object[] create(ICreateContext context) {
        // get the container business element
        List<EObject> containerObjects = context.getTargetContainer().getLink()
            .getBusinessObjects();

        Measure measure = createEmptyMeasure();

        EObject container = containerObjects.get(0);
        if (container instanceof Part) {
            Part part = (Part) container;
            List<Measure> measures = part.getMeasures();
            measures.add(measure);
        }
        else if (container instanceof Measure) {
            Measure previousMeasure = (Measure) container;
            EList<Measure> measures = previousMeasure.getPart().getMeasures();
            int index = measures.indexOf(previousMeasure);
            measures.add(index+1, measure);
        }

        // add the corresponding graphical representation
        addGraphicalRepresentation(context, measure);
        return new Object[] { measure };
    }

    private Measure createEmptyMeasure() {
        // TODO quarter beats hard-coded for now
        Measure measure = ScoreFactory.eINSTANCE.createMeasure();
        measure.setDivisions(DIVISIONS);
        measure.setDuration(4 * DIVISIONS);
        Note note = ScoreFactory.eINSTANCE.createNote();
        note.setDuration(4 * DIVISIONS);
        note.setType(NoteType.WHOLE);

        Rest rest = ScoreFactory.eINSTANCE.createRest();
        note.setRest(rest);
        measure.getNotes().add(note);
        
        BarLine barLine = ScoreFactory.eINSTANCE.createBarLine();
        barLine.setPosition(Position.RIGHT);
        measure.getBarLines().add(barLine);
        return measure;
    }

}

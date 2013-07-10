package org.ops4j.coro.ui.score.editor.features;

import static org.ops4j.coro.model.score.Step.*;

import java.util.List;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.graphiti.features.IFeatureProvider;
import org.eclipse.graphiti.features.context.ICreateContext;
import org.eclipse.graphiti.features.impl.AbstractCreateFeature;
import org.eclipse.graphiti.mm.pictograms.ContainerShape;
import org.ops4j.coro.model.score.Measure;
import org.ops4j.coro.model.score.Note;
import org.ops4j.coro.model.score.NoteType;
import org.ops4j.coro.model.score.Pitch;
import org.ops4j.coro.model.score.ScoreFactory;
import org.ops4j.coro.model.score.Step;

public class NoteCreateFeature extends AbstractCreateFeature {
    
    private static final Step[] STEPS = new Step[] {null, E, D, C, B, A, G, F};
    
    public NoteCreateFeature(IFeatureProvider fp) {
        super(fp, "Note", "Create Note");
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
        return (container instanceof Measure);
    }

    public Object[] create(ICreateContext context) {
        List<EObject> containerObjects = context.getTargetContainer().getLink()
            .getBusinessObjects();

        Measure measure = (Measure) containerObjects.get(0);
        Note note = createNote(context);
        measure.getNotes().add(note);
        
        addGraphicalRepresentation(context, note);
        return new Object[] { note };
    }

    private Note createNote(ICreateContext context) {
        int steps = (2*context.getY()) / 10;
        if (steps < 1 || steps > 7) {
            steps = 4;
        }
        Step step = STEPS[steps];
        
        System.out.println("step = " + step);
        
        Note note = ScoreFactory.eINSTANCE.createNote();
        Pitch pitch = ScoreFactory.eINSTANCE.createPitch();
        note.setType(NoteType.QUARTER);
        note.setPitch(pitch);
        pitch.setStep(step);
        return note;
    }
}

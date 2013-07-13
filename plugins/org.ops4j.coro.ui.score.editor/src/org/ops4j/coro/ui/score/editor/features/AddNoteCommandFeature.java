package org.ops4j.coro.ui.score.editor.features;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.graphiti.features.IFeatureProvider;
import org.eclipse.graphiti.features.context.ICustomContext;
import org.eclipse.graphiti.features.context.impl.AddContext;
import org.eclipse.graphiti.features.custom.AbstractCustomFeature;
import org.eclipse.graphiti.mm.algorithms.GraphicsAlgorithm;
import org.eclipse.graphiti.mm.pictograms.ContainerShape;
import org.eclipse.graphiti.mm.pictograms.PictogramElement;
import org.eclipse.graphiti.mm.pictograms.Shape;
import org.ops4j.coro.edit.ScoreEditService;
import org.ops4j.coro.model.score.Measure;
import org.ops4j.coro.model.score.Note;
import org.ops4j.coro.model.score.NoteType;
import org.ops4j.coro.model.score.Pitch;
import org.ops4j.coro.model.score.ScoreFactory;
import org.ops4j.coro.model.score.Step;

public class AddNoteCommandFeature extends AbstractCustomFeature {

    private String pitchHint;
    private ScoreEditService editService = new ScoreEditService();

    public AddNoteCommandFeature(IFeatureProvider fp, String pitchHint) {
        super(fp);
        this.pitchHint = pitchHint;
    }

    /**
     * Name displayed in Undo/Redo menu entry.
     */
    @Override
    public String getName() {
        return "Add Note";
    }

    @Override
    public boolean canExecute(ICustomContext context) {
        PictogramElement[] pictogramElements = context.getPictogramElements();
        if (pictogramElements.length != 1) {
            return false;
        }
        EObject obj = pictogramElements[0].getLink().getBusinessObjects().get(0);
        return (obj instanceof Note);
    }

    @Override
    public void execute(ICustomContext context) {
        PictogramElement pe = context.getPictogramElements()[0];
        Note selectedNote = (Note) pe.getLink().getBusinessObjects().get(0);

        Note newNote = createNote();
        editService.overwriteNote(selectedNote, newNote);
        Shape shape = (Shape) pe;
        updatePictogramElement(shape.getContainer());
        updatePictogramElement(shape);
    }

    private AddContext createAddContext(Note selectedNote) {
        PictogramElement selectedNotePe = getFeatureProvider()
            .getAllPictogramElementsForBusinessObject(selectedNote)[0];
        Shape selectedNoteContainer = (Shape) selectedNotePe;

        ContainerShape measureContainer = selectedNoteContainer.getContainer();
        GraphicsAlgorithm selectedNoteGa = selectedNoteContainer.getGraphicsAlgorithm();
        
        AddContext addContext = new AddContext();
        GraphicsAlgorithm measureGa = measureContainer.getGraphicsAlgorithm();
        addContext.setLocation(selectedNoteGa.getX() + 25, measureGa.getY());
        addContext.setSize(measureGa.getWidth(), measureGa.getHeight());
        addContext.setTargetContainer(measureContainer);
        return addContext;
    }

    private Note createNote() {
        char pitchChar = pitchHint.charAt("notePitch".length());
        System.out.println("pitch " + pitchChar);

        Note note = ScoreFactory.eINSTANCE.createNote();
        Pitch pitch = ScoreFactory.eINSTANCE.createPitch();
        note.setType(NoteType.QUARTER);
        note.setDuration(MeasureCreateFeature.DIVISIONS);
        note.setPitch(pitch);
        pitch.setStep(asStep(pitchChar));

        
        return note;
    }

    private Step asStep(char pitchChar) {
        return Step.getByName(Character.toString(Character.toUpperCase(pitchChar)));
    }
}

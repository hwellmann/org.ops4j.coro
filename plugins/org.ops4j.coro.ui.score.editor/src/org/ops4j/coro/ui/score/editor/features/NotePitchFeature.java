package org.ops4j.coro.ui.score.editor.features;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.graphiti.features.IFeatureProvider;
import org.eclipse.graphiti.features.context.ICustomContext;
import org.eclipse.graphiti.features.custom.AbstractCustomFeature;
import org.eclipse.graphiti.mm.algorithms.GraphicsAlgorithm;
import org.eclipse.graphiti.mm.algorithms.MultiText;
import org.eclipse.graphiti.mm.algorithms.styles.Style;
import org.eclipse.graphiti.mm.pictograms.ContainerShape;
import org.eclipse.graphiti.mm.pictograms.PictogramElement;
import org.eclipse.graphiti.mm.pictograms.Shape;
import org.eclipse.graphiti.platform.IDiagramBehavior;
import org.eclipse.graphiti.platform.IDiagramContainer;
import org.eclipse.graphiti.services.Graphiti;
import org.eclipse.graphiti.services.IGaService;
import org.eclipse.graphiti.services.IPeCreateService;
import org.ops4j.coro.model.score.Measure;
import org.ops4j.coro.model.score.Note;
import org.ops4j.coro.model.score.NoteType;
import org.ops4j.coro.model.score.Pitch;
import org.ops4j.coro.model.score.ScoreFactory;
import org.ops4j.coro.model.score.Step;
import org.ops4j.coro.ui.score.editor.style.FontService;
import org.ops4j.coro.ui.score.editor.style.MusicSymbol;
import org.ops4j.coro.ui.score.editor.style.StyleFactory;

public class NotePitchFeature extends AbstractCustomFeature {

    private static final int SPATIUM = 10;

    private String pitchHint;

    public NotePitchFeature(IFeatureProvider fp, String pitchHint) {
        super(fp);
        this.pitchHint = pitchHint;
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
        char pitchChar = pitchHint.charAt("notePitch".length());
        System.out.println("pitch " + pitchChar);

        PictogramElement[] pictogramElements = context.getPictogramElements();
        Note selectedNote = (Note) pictogramElements[0].getLink().getBusinessObjects().get(0);

        Note note = ScoreFactory.eINSTANCE.createNote();
        Pitch pitch = ScoreFactory.eINSTANCE.createPitch();
        note.setType(NoteType.QUARTER);
        note.setPitch(pitch);
        pitch.setStep(asStep(pitchChar));

        Measure measure = selectedNote.getMeasure();
        measure.getNotes().add(note);

        PictogramElement selectedNotePe = getFeatureProvider()
            .getAllPictogramElementsForBusinessObject(selectedNote)[0];
        Shape selectedNoteContainer = (Shape) selectedNotePe;

        ContainerShape measureContainer = selectedNoteContainer.getContainer();
        GraphicsAlgorithm selectedNoteGa = selectedNoteContainer.getGraphicsAlgorithm();

        IPeCreateService peCreateService = Graphiti.getPeCreateService();
        IGaService gaService = Graphiti.getGaService();

        Shape noteShape = peCreateService.createShape(measureContainer, true);

        String text = MusicSymbol.NOTEHEAD_QUARTER.asString();
        final MultiText textGa = gaService.createPlainMultiText(noteShape, text);
        int ascent = FontService.getInstance().getMusicFontAscent();
        int yOffset = getVerticalOffsetForPitch(pitch);
        gaService.setLocationAndSize(textGa, selectedNoteGa.getX() + 25, yOffset - ascent, 60, 60);
        Style musicStyle = StyleFactory.getStyleForMusic(getDiagram());
        textGa.setStyle(musicStyle);

        // create link and wire it
        link(noteShape, note);

        // select created note
        IDiagramBehavior diagramBehavior = getDiagramBehavior();
        IDiagramContainer diagramContainer = diagramBehavior.getDiagramContainer();
        diagramContainer.setPictogramElementForSelection(noteShape);
    }

    
    /**
     * TODO handle octave and clef
     * @param pitch
     * @return
     */
    private int getVerticalOffsetForPitch(Pitch pitch) {
        int vStep = 0;
        switch (pitch.getStep()) {
            case E:
                vStep = 1;
                break;
            case D:
                vStep = 2;
                break;
            case C:
                vStep = 3;
                break;
            case B:
                vStep = 4;
                break;
            case A:
                vStep = 5;
                break;
            case G:
                vStep = 6;
                break;
            case F:
                vStep = 7;
                break;
        }
        return vStep * SPATIUM / 2;
    }

    private Step asStep(char pitchChar) {
        return Step.getByName(Character.toString(Character.toUpperCase(pitchChar)));
    }
}

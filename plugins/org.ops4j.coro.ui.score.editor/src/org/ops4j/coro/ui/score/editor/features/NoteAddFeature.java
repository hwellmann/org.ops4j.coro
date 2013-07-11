package org.ops4j.coro.ui.score.editor.features;

import org.eclipse.graphiti.features.IFeatureProvider;
import org.eclipse.graphiti.features.context.IAddContext;
import org.eclipse.graphiti.features.impl.AbstractAddShapeFeature;
import org.eclipse.graphiti.mm.algorithms.MultiText;
import org.eclipse.graphiti.mm.algorithms.styles.Style;
import org.eclipse.graphiti.mm.pictograms.ContainerShape;
import org.eclipse.graphiti.mm.pictograms.PictogramElement;
import org.eclipse.graphiti.mm.pictograms.Shape;
import org.eclipse.graphiti.services.Graphiti;
import org.eclipse.graphiti.services.IGaService;
import org.eclipse.graphiti.services.IPeCreateService;
import org.ops4j.coro.model.score.Note;
import org.ops4j.coro.model.score.Pitch;
import org.ops4j.coro.ui.score.editor.style.FontService;
import org.ops4j.coro.ui.score.editor.style.MusicSymbol;
import org.ops4j.coro.ui.score.editor.style.StyleFactory;

public class NoteAddFeature extends AbstractAddShapeFeature {

    private static final int SPATIUM = 10;

    public NoteAddFeature(IFeatureProvider fp) {
        super(fp);
    }

    public boolean canAdd(IAddContext context) {
        return context.getNewObject() instanceof Note
            && context.getTargetContainer() instanceof ContainerShape;
    }

    public PictogramElement add(IAddContext context) {
        IPeCreateService peCreateService = Graphiti.getPeCreateService();
        ContainerShape measureContainer = context.getTargetContainer();
        
        Note note = (Note) context.getNewObject();


        IGaService gaService = Graphiti.getGaService();

        Shape noteShape = peCreateService.createShape(measureContainer, true);

        String text = MusicSymbol.NOTEHEAD_QUARTER.asString();
        final MultiText textGa = gaService.createPlainMultiText(noteShape, text);
        int ascent = FontService.getInstance().getMusicFontAscent();
        int yOffset = getVerticalOffsetForPitch(note.getPitch());
        gaService.setLocationAndSize(textGa, context.getX(), yOffset - ascent, 20, 60);
        Style musicStyle = StyleFactory.getStyleForMusic(getDiagram());
        textGa.setStyle(musicStyle);

        link(noteShape, note);
        layoutPictogramElement(measureContainer);
        return noteShape;
    }
    
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

    

}

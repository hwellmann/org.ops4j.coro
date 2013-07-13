package org.ops4j.coro.ui.score.editor.features;

import org.eclipse.graphiti.features.IFeatureProvider;
import org.eclipse.graphiti.features.IReason;
import org.eclipse.graphiti.features.context.IUpdateContext;
import org.eclipse.graphiti.features.impl.AbstractUpdateFeature;
import org.eclipse.graphiti.features.impl.Reason;
import org.eclipse.graphiti.mm.algorithms.GraphicsAlgorithm;
import org.eclipse.graphiti.mm.pictograms.PictogramElement;
import org.ops4j.coro.model.score.Note;
import org.ops4j.coro.model.score.Pitch;
import org.ops4j.coro.ui.score.editor.style.FontService;

public class NoteUpdateFeature extends AbstractUpdateFeature {

    public NoteUpdateFeature(IFeatureProvider fp) {
        super(fp);
    }

    @Override
    public boolean canUpdate(IUpdateContext context) {
        Object bo = getBusinessObjectForPictogramElement(context.getPictogramElement());
        return bo instanceof Note;
    }

    @Override
    public IReason updateNeeded(IUpdateContext context) {
        IReason reason = Reason.createFalseReason();
        PictogramElement pe = context.getPictogramElement();
        Note note = (Note) getBusinessObjectForPictogramElement(pe);
        GraphicsAlgorithm ga = pe.getGraphicsAlgorithm();
        int ascent = FontService.getInstance().getMusicFontAscent();
        Pitch pitch = note.getPitch();
        if (pitch != null) {
            int yOffset = getVerticalOffsetForPitch(pitch);
            int newOffset = yOffset - ascent;
            if (newOffset != ga.getY()) {
                reason = Reason.createTrueReason();
            }
        }
        return reason;
    }

    @Override
    public boolean update(IUpdateContext context) {
        PictogramElement pe = context.getPictogramElement();
        GraphicsAlgorithm ga = pe.getGraphicsAlgorithm();
        Note note = (Note) getBusinessObjectForPictogramElement(pe);
        int ascent = FontService.getInstance().getMusicFontAscent();
        Pitch pitch = note.getPitch();
        if (pitch != null) {
            int yOffset = getVerticalOffsetForPitch(pitch);
            int newOffset = yOffset - ascent;
            ga.setY(newOffset);
        }
        return true;
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
        return vStep * 10 / 2;
    }

}

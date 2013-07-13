package org.ops4j.coro.ui.score.editor.features;

import org.eclipse.graphiti.features.IFeatureProvider;
import org.eclipse.graphiti.features.context.ILayoutContext;
import org.eclipse.graphiti.features.impl.AbstractLayoutFeature;
import org.eclipse.graphiti.mm.algorithms.GraphicsAlgorithm;
import org.eclipse.graphiti.mm.pictograms.Shape;
import org.ops4j.coro.model.score.BarLine;
import org.ops4j.coro.model.score.Measure;
import org.ops4j.coro.model.score.Note;
import org.ops4j.coro.model.score.Position;

public class MeasureLayoutFeature extends AbstractLayoutFeature {

    public MeasureLayoutFeature(IFeatureProvider fp) {
        super(fp);
    }

    @Override
    public boolean canLayout(ILayoutContext context) {
        Object bo = getBusinessObjectForPictogramElement(context.getPictogramElement());
        return bo instanceof Measure;
    }

    @Override
    public boolean layout(ILayoutContext context) {
        int x = 10;
        Measure measure = (Measure) getBusinessObjectForPictogramElement(context
            .getPictogramElement());

        for (Note note : measure.getNotes()) {
            Shape noteContainer = (Shape) getFeatureProvider()
                .getPictogramElementForBusinessObject(note);
            // layoutPictogramElement(noteContainer);
            GraphicsAlgorithm ga = noteContainer.getGraphicsAlgorithm();
            ga.setX(x);
            x += ga.getWidth();
        }
        for (BarLine barLine : measure.getBarLines()) {
            if (barLine.getPosition() == Position.RIGHT) {
                Shape barLineShape = (Shape) getFeatureProvider()
                    .getPictogramElementForBusinessObject(barLine);
                GraphicsAlgorithm ga = barLineShape.getGraphicsAlgorithm();
                ga.setX(x);
            }
        }
        context.getPictogramElement().getGraphicsAlgorithm().setWidth(x + 5);
        return true;
    }
    
    
}

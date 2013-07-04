package org.ops4j.coro.ui.score.editor.features;

import org.eclipse.graphiti.features.IFeatureProvider;
import org.eclipse.graphiti.features.context.ILayoutContext;
import org.eclipse.graphiti.features.impl.AbstractLayoutFeature;
import org.eclipse.graphiti.mm.algorithms.GraphicsAlgorithm;
import org.eclipse.graphiti.mm.pictograms.ContainerShape;
import org.ops4j.coro.model.score.Measure;
import org.ops4j.coro.model.score.Part;


public class PartLayoutFeature extends AbstractLayoutFeature {

    public PartLayoutFeature(IFeatureProvider fp) {
        super(fp);
    }

    @Override
    public boolean canLayout(ILayoutContext context) {
        Object bo = getBusinessObjectForPictogramElement(context.getPictogramElement());      
        return bo instanceof Part;
    }

    @Override
    public boolean layout(ILayoutContext context) {
        int x = 0;
        int y = 10;
        Part part = (Part) getBusinessObjectForPictogramElement(context.getPictogramElement());
        
        for (Measure measure : part.getMeasures()) {
            ContainerShape measureContainer = (ContainerShape) getFeatureProvider().getPictogramElementForBusinessObject(measure);
            GraphicsAlgorithm ga = measureContainer.getGraphicsAlgorithm();
            ga.setX(x);
            ga.setY(y);
            x += ga.getWidth();
        }
        return true;
    }

}

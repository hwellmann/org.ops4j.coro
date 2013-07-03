package org.ops4j.coro.ui.score.editor.features;

import org.eclipse.graphiti.features.IFeatureProvider;
import org.eclipse.graphiti.features.context.IAddContext;
import org.eclipse.graphiti.features.impl.AbstractAddShapeFeature;
import org.eclipse.graphiti.mm.algorithms.Rectangle;
import org.eclipse.graphiti.mm.pictograms.ContainerShape;
import org.eclipse.graphiti.mm.pictograms.Diagram;
import org.eclipse.graphiti.mm.pictograms.PictogramElement;
import org.eclipse.graphiti.mm.pictograms.Shape;
import org.eclipse.graphiti.services.Graphiti;
import org.eclipse.graphiti.services.IGaService;
import org.eclipse.graphiti.services.IPeCreateService;
import org.ops4j.coro.model.score.Part;

public class PartAddFeature extends AbstractAddShapeFeature {

    public PartAddFeature(IFeatureProvider fp) {
        super(fp);
    }

    public boolean canAdd(IAddContext context) {
        return context.getNewObject() instanceof Part
            && context.getTargetContainer() instanceof Diagram;
    }

    public PictogramElement add(IAddContext context) {
        IPeCreateService peService = Graphiti.getPeCreateService();
        ContainerShape containerShape = peService.createContainerShape(
            context.getTargetContainer(), true);

        IGaService gaService = Graphiti.getGaService();
        
        
        Rectangle rectangle = gaService.createInvisibleRectangle(containerShape);
        int width = Math.max(context.getWidth(), 600);
        int height = Math.max(context.getHeight(), 60);
        gaService.setLocationAndSize(rectangle, context.getX(), context.getY(), width, height);
        
        
        for (int y = 10; y <= 50; y+= 10) {
            Shape shape = peService.createShape(containerShape, false);
            gaService.createPlainPolyline(shape, new int[] { 0, y, width, y });            
        }
        
        

        link(containerShape, context.getNewObject());
        return containerShape;
    }

}

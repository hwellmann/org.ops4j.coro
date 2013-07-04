package org.ops4j.coro.ui.score.editor.features;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.graphiti.features.IDirectEditingInfo;
import org.eclipse.graphiti.features.IFeatureProvider;
import org.eclipse.graphiti.features.context.IAddContext;
import org.eclipse.graphiti.features.impl.AbstractAddShapeFeature;
import org.eclipse.graphiti.mm.algorithms.Rectangle;
import org.eclipse.graphiti.mm.algorithms.Text;
import org.eclipse.graphiti.mm.pictograms.ContainerShape;
import org.eclipse.graphiti.mm.pictograms.PictogramElement;
import org.eclipse.graphiti.mm.pictograms.Shape;
import org.eclipse.graphiti.services.Graphiti;
import org.eclipse.graphiti.services.IGaService;
import org.eclipse.graphiti.services.IPeCreateService;
import org.ops4j.coro.model.score.Measure;
import org.ops4j.coro.ui.score.editor.style.StyleFactory;

public class MeasureAddFeature extends AbstractAddShapeFeature {

    public MeasureAddFeature(IFeatureProvider fp) {
        super(fp);
    }

    public boolean canAdd(IAddContext context) {
        return context.getNewObject() instanceof Measure
            && context.getTargetContainer() instanceof ContainerShape;
    }

    public PictogramElement add(IAddContext context) {
        IPeCreateService peCreateService = Graphiti.getPeCreateService();
        ContainerShape targetContainer = context.getTargetContainer();
        EObject parentObject = targetContainer.getLink().getBusinessObjects().get(0);
        
        if (parentObject instanceof Measure) {
            targetContainer = targetContainer.getContainer();
        }
        
        ContainerShape containerShape = peCreateService.createContainerShape(
            targetContainer, true);

        Measure measure = (Measure) context.getNewObject();
        
        IGaService gaService = Graphiti.getGaService();
        Rectangle rectangle = gaService.createInvisibleRectangle(containerShape);
        int width = Math.max(context.getWidth(), 100);
        int height = 40;
        gaService.setLocationAndSize(rectangle, context.getX(), context.getY(), width, height);

        Shape shape = peCreateService.createShape(containerShape, false);
        gaService.createPlainPolyline(shape, new int[] { width-5, 0, width-5, height });
        
        // create shape for text
        Shape markerShape = peCreateService.createShape(containerShape, false);

        // create and set text graphics algorithm
        final Text text = gaService.createPlainText(markerShape, measure.getMarker());
        text.setStyle(StyleFactory.getStyleForText(getDiagram()));
        gaService.setLocationAndSize(text, 0, 10, width, 20);

        // create link and wire it
        link(containerShape, measure);
        link(markerShape, measure);

        // provide information to support direct-editing directly
        // after object creation (must be activated additionally)
        final IDirectEditingInfo directEditingInfo = getFeatureProvider().getDirectEditingInfo();
        // set container shape for direct editing after object creation
        directEditingInfo.setMainPictogramElement(containerShape);
        // set shape and graphics algorithm where the editor for
        // direct editing shall be opened after object creation
        directEditingInfo.setPictogramElement(markerShape);
        directEditingInfo.setGraphicsAlgorithm(text);
        
        
        layoutPictogramElement(targetContainer);
        return containerShape;
    }

}

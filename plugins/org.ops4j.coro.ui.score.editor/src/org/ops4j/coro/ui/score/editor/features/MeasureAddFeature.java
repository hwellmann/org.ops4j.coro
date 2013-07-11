package org.ops4j.coro.ui.score.editor.features;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.graphiti.features.IFeatureProvider;
import org.eclipse.graphiti.features.context.IAddContext;
import org.eclipse.graphiti.features.impl.AbstractAddShapeFeature;
import org.eclipse.graphiti.mm.algorithms.MultiText;
import org.eclipse.graphiti.mm.algorithms.Polyline;
import org.eclipse.graphiti.mm.algorithms.Rectangle;
import org.eclipse.graphiti.mm.algorithms.styles.Style;
import org.eclipse.graphiti.mm.pictograms.ContainerShape;
import org.eclipse.graphiti.mm.pictograms.PictogramElement;
import org.eclipse.graphiti.mm.pictograms.Shape;
import org.eclipse.graphiti.services.Graphiti;
import org.eclipse.graphiti.services.IGaService;
import org.eclipse.graphiti.services.IPeCreateService;
import org.ops4j.coro.model.score.Measure;
import org.ops4j.coro.ui.score.editor.style.FontService;
import org.ops4j.coro.ui.score.editor.style.MusicSymbol;
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

        Shape barLineShape = peCreateService.createShape(containerShape, true);
        Polyline polyline = gaService.createPlainPolyline(barLineShape, new int[] { 0, 0, 0, height });
        gaService.setLocation(polyline, 95, 0);
        
        Shape noteShape = peCreateService.createShape(containerShape, true);

        String text = MusicSymbol.REST_WHOLE.asString();
        final MultiText textGa = gaService.createPlainMultiText(noteShape, text);
        int ascent = FontService.getInstance().getMusicFontAscent();
        gaService.setLocationAndSize(textGa, 40, 10-ascent, 60, 60);        
        Style musicStyle = StyleFactory.getStyleForMusic(getDiagram());
        textGa.setStyle(musicStyle);
                
        link(containerShape, measure);
        link(noteShape, measure.getNotes().get(0));
        link(barLineShape, measure.getBarLines().get(0));
        
        layoutPictogramElement(targetContainer);
        return containerShape;
    }

}

package org.ops4j.coro.ui.score.editor.features;

import org.eclipse.graphiti.features.IFeatureProvider;
import org.eclipse.graphiti.features.IReason;
import org.eclipse.graphiti.features.context.IUpdateContext;
import org.eclipse.graphiti.features.context.impl.AddContext;
import org.eclipse.graphiti.features.impl.AbstractUpdateFeature;
import org.eclipse.graphiti.features.impl.Reason;
import org.eclipse.graphiti.mm.algorithms.GraphicsAlgorithm;
import org.eclipse.graphiti.mm.pictograms.ContainerShape;
import org.eclipse.graphiti.mm.pictograms.PictogramElement;
import org.ops4j.coro.model.score.Measure;
import org.ops4j.coro.model.score.Note;

public class MeasureUpdateFeature extends AbstractUpdateFeature {

    public MeasureUpdateFeature(IFeatureProvider fp) {
        super(fp);
    }

    @Override
    public boolean canUpdate(IUpdateContext context) {
        Object bo = getBusinessObjectForPictogramElement(context.getPictogramElement());
        return bo instanceof Measure;
    }

    @Override
    public IReason updateNeeded(IUpdateContext context) {
        System.out.println("Measure.updateNeeded");
        boolean updateNeeded = false;
        Measure measure = (Measure) getBusinessObjectForPictogramElement(context
            .getPictogramElement());
        for (Note note : measure.getNotes()) {
            PictogramElement notePe = getFeatureProvider().getPictogramElementForBusinessObject(
                note);
            if (notePe == null) {
                updateNeeded = true;
                break;
            }
        }
        if (updateNeeded) {
            return Reason.createTrueReason("note added");
        }
        else {
            return Reason.createFalseReason();
        }
    }

    @Override
    public boolean update(IUpdateContext context) {
        ContainerShape measureContainer = (ContainerShape) context.getPictogramElement();
        Measure measure = (Measure) getBusinessObjectForPictogramElement(context
            .getPictogramElement());
        for (Note note : measure.getNotes()) {
            PictogramElement notePe = getFeatureProvider().getPictogramElementForBusinessObject(
                note);
            if (notePe == null) {
                addGraphicalRepresentation(createAddContext(measureContainer), note);
            }
        }
        layoutPictogramElement(measureContainer);
        return true;
    }
    
    private AddContext createAddContext(ContainerShape measureContainer) {
        
        AddContext addContext = new AddContext();
        GraphicsAlgorithm measureGa = measureContainer.getGraphicsAlgorithm();
        addContext.setLocation(measureGa.getX() + 25, measureGa.getY());
        addContext.setSize(measureGa.getWidth(), measureGa.getHeight());
        addContext.setTargetContainer(measureContainer);
        return addContext;
    }
}

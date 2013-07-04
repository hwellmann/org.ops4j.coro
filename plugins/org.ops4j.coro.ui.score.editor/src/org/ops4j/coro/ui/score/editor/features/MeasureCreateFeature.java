package org.ops4j.coro.ui.score.editor.features;

import java.util.List;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.graphiti.features.IFeatureProvider;
import org.eclipse.graphiti.features.context.ICreateContext;
import org.eclipse.graphiti.features.impl.AbstractCreateFeature;
import org.eclipse.graphiti.mm.pictograms.ContainerShape;
import org.ops4j.coro.model.score.Measure;
import org.ops4j.coro.model.score.Part;
import org.ops4j.coro.model.score.ScoreFactory;

public class MeasureCreateFeature extends AbstractCreateFeature {

    public MeasureCreateFeature(IFeatureProvider fp) {
        super(fp, "Measure", "Create a measure");
    }

    public boolean canCreate(ICreateContext context) {
        ContainerShape target = context.getTargetContainer();
        if (!(target instanceof ContainerShape)) {
            return false;
        }
        List<EObject> containerObjects = context.getTargetContainer().getLink()
            .getBusinessObjects();
        if (containerObjects.isEmpty()) {
            return false;
        }
        EObject container = containerObjects.get(0);
        return (container instanceof Part) || (container instanceof Measure);
    }

    public Object[] create(ICreateContext context) {
        // get the container business element
        List<EObject> containerObjects = context.getTargetContainer().getLink()
            .getBusinessObjects();

        Measure measure = ScoreFactory.eINSTANCE.createMeasure();

        EObject container = containerObjects.get(0);
        if (container instanceof Part) {
            Part part = (Part) container;
            List<Measure> measures = part.getMeasures();
            int number = measures.size() + 1;
            measure.setMarker("M" + number);
            measures.add(measure);
        }
        else if (container instanceof Measure) {
            Measure previousMeasure = (Measure) container;
            EList<Measure> measures = previousMeasure.getPart().getMeasures();
            int number = measures.size() + 1;
            measure.setMarker("M" + number);
            int index = measures.indexOf(previousMeasure);
            measures.add(index+1, measure);
        }

        // add the corresponding graphical representation
        addGraphicalRepresentation(context, measure);
        return new Object[] { measure };
    }

}

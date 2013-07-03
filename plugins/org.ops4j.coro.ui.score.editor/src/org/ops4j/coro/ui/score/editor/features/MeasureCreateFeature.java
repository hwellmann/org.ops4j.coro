package org.ops4j.coro.ui.score.editor.features;

import java.util.List;

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
        if (! (target instanceof ContainerShape)) {
            return false;
        }
        List<EObject> containerObjects = context.getTargetContainer().getLink()
            .getBusinessObjects();
        return !containerObjects.isEmpty() && (containerObjects.get(0) instanceof Part);
    }

    public Object[] create(ICreateContext context) {
        // get the container business element
        List<EObject> containerObjects = context.getTargetContainer().getLink()
            .getBusinessObjects();

        Part part = (Part) containerObjects.get(0);
        List<Measure> measures = part.getMeasures();
        Measure measure = ScoreFactory.eINSTANCE.createMeasure();
        measures.add(measure);

        // add the corresponding graphical representation
        addGraphicalRepresentation(context, measure);

        return new Object[] { measure };
    }

}

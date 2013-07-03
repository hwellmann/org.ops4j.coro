package org.ops4j.coro.ui.score.editor.features;

import java.util.List;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.graphiti.features.IFeatureProvider;
import org.eclipse.graphiti.features.context.ICreateContext;
import org.eclipse.graphiti.features.impl.AbstractCreateFeature;
import org.eclipse.graphiti.mm.pictograms.Diagram;
import org.ops4j.coro.model.score.Part;
import org.ops4j.coro.model.score.Score;
import org.ops4j.coro.model.score.ScoreFactory;

public class PartCreateFeature extends AbstractCreateFeature {

    public PartCreateFeature(IFeatureProvider fp) {
        super(fp, "Part", "Create a part");
    }

    public boolean canCreate(ICreateContext context) {
        return context.getTargetContainer() instanceof Diagram;
    }

    public Object[] create(ICreateContext context) {
        // get the container business element
        List<EObject> containerObjects = context.getTargetContainer().getLink()
            .getBusinessObjects();
        if (containerObjects.isEmpty() || !(containerObjects.get(0) instanceof Score)) {
            throw new IllegalStateException("The diagram does not contain a Coro score.");
        }

        Score score = (Score) containerObjects.get(0);
        Part part = ScoreFactory.eINSTANCE.createPart();
        score.getParts().add(part);

        // add the corresponding graphical representation
        addGraphicalRepresentation(context, part);

        return new Object[] { part };
    }

}

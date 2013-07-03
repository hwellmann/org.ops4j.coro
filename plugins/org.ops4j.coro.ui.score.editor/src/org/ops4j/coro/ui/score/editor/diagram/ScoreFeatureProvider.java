package org.ops4j.coro.ui.score.editor.diagram;

import org.eclipse.graphiti.dt.IDiagramTypeProvider;
import org.eclipse.graphiti.features.IAddFeature;
import org.eclipse.graphiti.features.ICreateFeature;
import org.eclipse.graphiti.features.context.IAddContext;
import org.eclipse.graphiti.ui.features.DefaultFeatureProvider;
import org.ops4j.coro.ui.score.editor.features.MeasureAddFeature;
import org.ops4j.coro.ui.score.editor.features.MeasureCreateFeature;
import org.ops4j.coro.ui.score.editor.features.PartAddFeature;
import org.ops4j.coro.ui.score.editor.features.PartCreateFeature;

public class ScoreFeatureProvider extends DefaultFeatureProvider {

    private IAddFeature measureAddFeature = new MeasureAddFeature(this);
    private IAddFeature partAddFeature = new PartAddFeature(this);

    public ScoreFeatureProvider(IDiagramTypeProvider dtp) {
        super(dtp);
    }

    @Override
    public ICreateFeature[] getCreateFeatures() {
        return new ICreateFeature[] { 
            new PartCreateFeature(this),
            new MeasureCreateFeature(this) };
    }

    @Override
    public IAddFeature getAddFeature(IAddContext context) {
        if (measureAddFeature.canAdd(context)) {
            return measureAddFeature;
        }
        if (partAddFeature.canAdd(context)) {
            return partAddFeature;
        }
        return super.getAddFeature(context);
    }

}

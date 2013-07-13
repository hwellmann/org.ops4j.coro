package org.ops4j.coro.ui.score.editor.diagram;

import org.eclipse.graphiti.dt.IDiagramTypeProvider;
import org.eclipse.graphiti.features.IAddFeature;
import org.eclipse.graphiti.features.ICreateFeature;
import org.eclipse.graphiti.features.ILayoutFeature;
import org.eclipse.graphiti.features.IUpdateFeature;
import org.eclipse.graphiti.features.context.IAddContext;
import org.eclipse.graphiti.features.context.ILayoutContext;
import org.eclipse.graphiti.features.context.IUpdateContext;
import org.eclipse.graphiti.mm.pictograms.PictogramElement;
import org.eclipse.graphiti.ui.features.DefaultFeatureProvider;
import org.ops4j.coro.model.score.Measure;
import org.ops4j.coro.model.score.Note;
import org.ops4j.coro.model.score.Part;
import org.ops4j.coro.ui.score.editor.features.MeasureAddFeature;
import org.ops4j.coro.ui.score.editor.features.MeasureCreateFeature;
import org.ops4j.coro.ui.score.editor.features.MeasureLayoutFeature;
import org.ops4j.coro.ui.score.editor.features.MeasureUpdateFeature;
import org.ops4j.coro.ui.score.editor.features.NoteAddFeature;
import org.ops4j.coro.ui.score.editor.features.NoteCreateFeature;
import org.ops4j.coro.ui.score.editor.features.NoteUpdateFeature;
import org.ops4j.coro.ui.score.editor.features.PartAddFeature;
import org.ops4j.coro.ui.score.editor.features.PartCreateFeature;
import org.ops4j.coro.ui.score.editor.features.PartLayoutFeature;

public class ScoreFeatureProvider extends DefaultFeatureProvider {

    private IAddFeature measureAddFeature = new MeasureAddFeature(this);
    private IAddFeature partAddFeature = new PartAddFeature(this);
    private IAddFeature noteAddFeature = new NoteAddFeature(this);

    public ScoreFeatureProvider(IDiagramTypeProvider dtp) {
        super(dtp);
    }

    @Override
    public ICreateFeature[] getCreateFeatures() {
        return new ICreateFeature[] { new PartCreateFeature(this), new MeasureCreateFeature(this),  new NoteCreateFeature(this) };
    }

    @Override
    public ILayoutFeature getLayoutFeature(ILayoutContext context) {
        PictogramElement pe = context.getPictogramElement();
        Object bo = getBusinessObjectForPictogramElement(pe);
        if (bo instanceof Part) {
            return new PartLayoutFeature(this);
        }
        if (bo instanceof Measure) {
            return new MeasureLayoutFeature(this);
        }
        return super.getLayoutFeature(context);
    }

    @Override
    public IAddFeature getAddFeature(IAddContext context) {
        if (measureAddFeature.canAdd(context)) {
            return measureAddFeature;
        }
        if (partAddFeature.canAdd(context)) {
            return partAddFeature;
        }
        if (noteAddFeature.canAdd(context)) {
            return noteAddFeature;
        }
        return super.getAddFeature(context);
    }
    
    @Override
    public IUpdateFeature getUpdateFeature(IUpdateContext context) {
        PictogramElement pe = context.getPictogramElement();
        Object bo = getBusinessObjectForPictogramElement(pe);
        if (bo instanceof Measure) {
            return new MeasureUpdateFeature(this);
        }
        if (bo instanceof Note) {
            return new NoteUpdateFeature(this);
        }
        return super.getUpdateFeature(context);
    }

}

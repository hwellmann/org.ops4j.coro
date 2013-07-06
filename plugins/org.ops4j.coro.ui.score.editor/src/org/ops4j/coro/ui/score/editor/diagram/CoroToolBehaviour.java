package org.ops4j.coro.ui.score.editor.diagram;

import org.eclipse.graphiti.dt.IDiagramTypeProvider;
import org.eclipse.graphiti.features.context.impl.CustomContext;
import org.eclipse.graphiti.features.custom.ICustomFeature;
import org.eclipse.graphiti.tb.DefaultToolBehaviorProvider;
import org.ops4j.coro.ui.score.editor.features.NotePitchFeature;


public class CoroToolBehaviour extends DefaultToolBehaviorProvider {
    

    public CoroToolBehaviour(IDiagramTypeProvider diagramTypeProvider) {
        super(diagramTypeProvider);
    }
    
    @Override
    public ICustomFeature getCommandFeature(CustomContext context, String hint) {
        if (hint != null && hint.startsWith("notePitch")) {
            return new NotePitchFeature(getFeatureProvider(), hint);
        }
        return super.getCommandFeature(context, hint);
    }

}

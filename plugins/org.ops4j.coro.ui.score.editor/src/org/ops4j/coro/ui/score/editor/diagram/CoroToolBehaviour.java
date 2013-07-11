package org.ops4j.coro.ui.score.editor.diagram;

import org.eclipse.graphiti.dt.IDiagramTypeProvider;
import org.eclipse.graphiti.features.context.impl.CustomContext;
import org.eclipse.graphiti.features.custom.ICustomFeature;
import org.eclipse.graphiti.tb.DefaultToolBehaviorProvider;
import org.ops4j.coro.ui.score.editor.features.AddNoteCommandFeature;


public class CoroToolBehaviour extends DefaultToolBehaviorProvider {
    

    public CoroToolBehaviour(IDiagramTypeProvider diagramTypeProvider) {
        super(diagramTypeProvider);
    }
    
    @Override
    public ICustomFeature getCommandFeature(CustomContext context, String hint) {
        if (hint != null && hint.startsWith("notePitch")) {
            return new AddNoteCommandFeature(getFeatureProvider(), hint);
        }
        return super.getCommandFeature(context, hint);
    }
    
    /**
     * Equality by identity. Graphiti uses EMF equality by default, which is not
     * appropriate for Coro. E.g. two measures with the same content may not be equal.
     */
    @Override
    public boolean equalsBusinessObjects(Object o1, Object o2) {
        return o1 == o2;
    }

}

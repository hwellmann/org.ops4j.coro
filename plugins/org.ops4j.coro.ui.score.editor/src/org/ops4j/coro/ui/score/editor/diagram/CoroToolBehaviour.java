package org.ops4j.coro.ui.score.editor.diagram;

import org.eclipse.graphiti.dt.IDiagramTypeProvider;
import org.eclipse.graphiti.tb.DefaultToolBehaviorProvider;


public class CoroToolBehaviour extends DefaultToolBehaviorProvider {

    public CoroToolBehaviour(IDiagramTypeProvider diagramTypeProvider) {
        super(diagramTypeProvider);
    }

}

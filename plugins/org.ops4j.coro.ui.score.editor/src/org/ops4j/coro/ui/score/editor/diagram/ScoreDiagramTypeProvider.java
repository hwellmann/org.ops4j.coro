package org.ops4j.coro.ui.score.editor.diagram;

import org.eclipse.graphiti.dt.AbstractDiagramTypeProvider;

public class ScoreDiagramTypeProvider extends AbstractDiagramTypeProvider {

    public ScoreDiagramTypeProvider() {
        setFeatureProvider(new ScoreFeatureProvider(this));
    }
}

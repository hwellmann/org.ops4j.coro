package org.ops4j.coro.ui.score.editor.diagram;

import org.eclipse.emf.ecore.EObject;
import org.ops4j.coro.model.score.Score;
import org.ops4j.coro.model.score.ScoreFactory;

public class ScoreNewWizard extends GraphitiNewWizard {

    public ScoreNewWizard() {
        super("Coro Score", "coro", "cmod", "score",
            org.eclipse.graphiti.ui.editor.DiagramEditor.DIAGRAM_EDITOR_ID, 5, true);
    }

    @Override
    protected EObject createModel(String name) {
        Score score = ScoreFactory.eINSTANCE.createScore();
        return score;
    }
}

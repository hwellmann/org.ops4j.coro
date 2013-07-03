package org.ops4j.coro.ui.score.editor.diagram;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EObject;
import org.ops4j.coro.model.score.Part;
import org.ops4j.coro.model.score.Score;
import org.ops4j.coro.model.score.ScoreFactory;

public class ScoreNewWizard extends GraphitiNewWizard {
	
	public ScoreNewWizard() {
		super("Coro Score", "cosc", "cosd", "score",
		        org.eclipse.graphiti.ui.editor.DiagramEditor.DIAGRAM_EDITOR_ID, 10, true);	}

	@Override
	protected EObject createModel(String name) {
		Score score = ScoreFactory.eINSTANCE.createScore();
		EList<Part> parts = score.getParts();
		Part part = ScoreFactory.eINSTANCE.createPart();
		parts.add(part);
		return score;
	}
}

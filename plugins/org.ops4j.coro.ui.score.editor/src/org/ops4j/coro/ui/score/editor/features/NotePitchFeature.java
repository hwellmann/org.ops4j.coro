package org.ops4j.coro.ui.score.editor.features;

import org.eclipse.graphiti.features.IFeatureProvider;
import org.eclipse.graphiti.features.context.ICustomContext;
import org.eclipse.graphiti.features.custom.AbstractCustomFeature;


public class NotePitchFeature extends AbstractCustomFeature {
    
    private String pitchHint;

    public NotePitchFeature(IFeatureProvider fp, String pitchHint) {
        super(fp);
        this.pitchHint = pitchHint;
    }
    
    @Override
    public boolean canExecute(ICustomContext context) {
        return true;
    }

    @Override
    public void execute(ICustomContext context) {
        char pitch = pitchHint.charAt("notePitch".length());
        System.out.println("pitch " + pitch);
        
    }

}

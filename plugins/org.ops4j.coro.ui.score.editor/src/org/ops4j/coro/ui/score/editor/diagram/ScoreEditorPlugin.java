package org.ops4j.coro.ui.score.editor.diagram;

import org.eclipse.ui.plugin.AbstractUIPlugin;
import org.ops4j.coro.ui.score.editor.style.FontService;
import org.osgi.framework.BundleContext;

/**
 * The activator class controls the plug-in life cycle
 */
public class ScoreEditorPlugin extends AbstractUIPlugin {

    // The plug-in ID
    public static final String PLUGIN_ID = "org.ops4j.coro.ui.score.editor"; //$NON-NLS-1$

    // The shared instance
    private static ScoreEditorPlugin plugin;

    /**
     * The constructor
     */
    public ScoreEditorPlugin() {
    }

    public void start(BundleContext context) throws Exception {
        super.start(context);
        plugin = this;
        FontService.getInstance().loadFonts();
    }

    public void stop(BundleContext context) throws Exception {
        FontService.getInstance().disposeFonts();
        plugin = null;
        super.stop(context);
    }

    /**
     * Returns the shared instance
     * 
     * @return the shared instance
     */
    public static ScoreEditorPlugin getDefault() {
        return plugin;
    }

}

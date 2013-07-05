package org.ops4j.coro.ui.score.editor.diagram;

import java.io.IOException;
import java.io.InputStream;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.StandardCopyOption;

import org.eclipse.swt.SWT;
import org.eclipse.swt.graphics.Font;
import org.eclipse.swt.widgets.Display;
import org.eclipse.ui.plugin.AbstractUIPlugin;
import org.osgi.framework.BundleContext;

/**
 * The activator class controls the plug-in life cycle
 */
public class ScoreEditorPlugin extends AbstractUIPlugin {

    // The plug-in ID
    public static final String PLUGIN_ID = "org.ops4j.coro.ui.score.editor"; //$NON-NLS-1$

    // The shared instance
    private static ScoreEditorPlugin plugin;

    private Font font;

    private Path fontFile;

    /**
     * The constructor
     */
    public ScoreEditorPlugin() {
    }

    public void start(BundleContext context) throws Exception {
        super.start(context);
        plugin = this;
        loadFonts();
    }

    private void loadFonts() throws IOException {
        
        // SWT cannot load a font from a stream, so we copy our resource to a temp file
        fontFile = Files.createTempFile("coro", ".otf");
        InputStream is = ScoreEditorPlugin.class.getResourceAsStream("/fonts/gonville-20.otf");
        Files.copy(is, fontFile, StandardCopyOption.REPLACE_EXISTING);
        
        Display display = getWorkbench().getDisplay();        
        boolean success = display.loadFont(fontFile.toString());
        if (!success) {
            throw new IllegalArgumentException("could not load Gonville font");
        }

        // The font file has to remain in place, even after loading the font.
        // We delete it in stop().
        font = new Font(display, "Gonville-20", 20, SWT.NORMAL);
    }

    public void stop(BundleContext context) throws Exception {
        disposeFonts();
        plugin = null;
        super.stop(context);
    }

    private void disposeFonts() throws IOException {
        font.dispose();
        Files.deleteIfExists(fontFile);
    }

    public Font getDefaultMusicFont() {
        return font;
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

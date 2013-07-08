package org.ops4j.coro.ui.score.editor.style;

import java.awt.Font;
import java.awt.FontFormatException;
import java.awt.Graphics2D;
import java.awt.GraphicsEnvironment;
import java.awt.font.FontRenderContext;
import java.awt.font.GlyphMetrics;
import java.awt.font.GlyphVector;
import java.awt.image.BufferedImage;
import java.io.IOException;
import java.io.InputStream;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.StandardCopyOption;
import java.util.HashMap;
import java.util.Map;

import org.eclipse.swt.SWT;
import org.eclipse.swt.graphics.FontMetrics;
import org.eclipse.swt.graphics.GC;
import org.eclipse.swt.widgets.Display;
import org.eclipse.ui.PlatformUI;
import org.ops4j.coro.ui.score.editor.diagram.ScoreEditorPlugin;


public class FontService {

    public static final String GONVILLE_FONT_NAME = "Gonville-20";
    public static final int GONVILLE_FONT_SIZE = 26;

    private static final String GONVILLE_FONT_RESOURCE = "/fonts/gonville-20.otf";
    private static final FontService instance = new FontService();
    private Path fontFile;
    
    private Map<MusicSymbol, GlyphMetrics> glyphMetricsMap = new HashMap<>();
    private org.eclipse.swt.graphics.Font swtFont;
    
    private FontMetrics musicFontMetrics;
    
    private FontService() {
    }
    
    public static FontService getInstance() {
        return instance;
    }
    
    public void loadFonts() throws IOException, FontFormatException {
        loadFontsSwt();
        loadFontsAwt();
    }
    
    private void loadFontsSwt() throws IOException, FontFormatException {
        // SWT cannot load a font from a stream, so we copy our resource to a temp file
        fontFile = Files.createTempFile("coro", ".otf");
        InputStream is = ScoreEditorPlugin.class.getResourceAsStream(GONVILLE_FONT_RESOURCE);
        Files.copy(is, fontFile, StandardCopyOption.REPLACE_EXISTING);
        is.close();
        
        Display display = PlatformUI.getWorkbench().getDisplay();        
        boolean success = display.loadFont(fontFile.toString());
        if (!success) {
            throw new IllegalArgumentException("could not load Gonville font");
        }
        swtFont = new org.eclipse.swt.graphics.Font(display, GONVILLE_FONT_NAME, GONVILLE_FONT_SIZE, SWT.NORMAL);
        
        // get font metrics
        GC gc = new GC(display);
        gc.setFont(swtFont);
        musicFontMetrics = gc.getFontMetrics();
        gc.dispose();
    }
    
    /**
     * Glyph metrics are not accessible via SWT. That's why we load them via AWT.
     * 
     * @throws IOException
     * @throws FontFormatException
     */
    private void loadFontsAwt() throws IOException, FontFormatException {
        InputStream is = ScoreEditorPlugin.class.getResourceAsStream(GONVILLE_FONT_RESOURCE);
        Font font = Font.createFont(Font.TRUETYPE_FONT, is);
        is.close();
        GraphicsEnvironment grEnv = GraphicsEnvironment.getLocalGraphicsEnvironment();
        grEnv.registerFont(font);
    }
    
    public void disposeFonts() throws IOException {
    	swtFont.dispose();
        Files.deleteIfExists(fontFile);        
    }
    
    public GlyphMetrics getGlyphMetrics(MusicSymbol symbol) {
        GlyphMetrics glyphMetrics = glyphMetricsMap.get(symbol);
        if (glyphMetrics == null) {
            BufferedImage img = new BufferedImage(100, 100, BufferedImage.TYPE_INT_RGB);
            Graphics2D graphics = img.createGraphics();
            FontRenderContext frc = graphics.getFontRenderContext();
            Font font = new Font(GONVILLE_FONT_NAME, Font.PLAIN, GONVILLE_FONT_SIZE);

            GlyphVector gv = font.createGlyphVector(frc, symbol.asString());
            glyphMetrics = gv.getGlyphMetrics(0);
            glyphMetricsMap.put(symbol, glyphMetrics);
            graphics.dispose();
            
        }
        return glyphMetrics;
    }
    
    public org.eclipse.swt.graphics.Font getCurrentMusicFont() {
    	return swtFont;
    }
    
    public int getMusicFontAscent() {
        return musicFontMetrics.getAscent();
    }

    public int getMusicFontDescent() {
        return musicFontMetrics.getDescent();
    }
}

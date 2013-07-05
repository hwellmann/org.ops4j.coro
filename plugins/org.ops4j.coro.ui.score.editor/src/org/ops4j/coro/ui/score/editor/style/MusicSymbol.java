package org.ops4j.coro.ui.score.editor.style;


public enum MusicSymbol {
    
    
    NOTEHEAD_WHOLE('\ue169'),
    NOTEHEAD_HALF('\ue13f'),
    NOTEHEAD_QUARTER('\ue13e');

    private char character;
    
    
    private MusicSymbol(char c) {
        this.character = c;
    }
    
    public char asChar() {
        return character;
    }
    
    public String asString() {
        return Character.toString(character);
    }
}

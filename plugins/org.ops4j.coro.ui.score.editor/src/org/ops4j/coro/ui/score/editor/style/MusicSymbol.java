package org.ops4j.coro.ui.score.editor.style;


public enum MusicSymbol {
    
    
    NOTEHEAD_WHOLE('\ue169'),
    NOTEHEAD_HALF('\ue13f'),
    NOTEHEAD_QUARTER('\ue13e'),
    DOT('\ue17c'),

    FLAGS_8TH_UP('\ue180'),
    FLAGS_16TH_UP('\ue182'),
    FLAGS_8TH_DOWN('\ue17f'),
    FLAGS_16TH_DOWN('\ue181'),
    
    REST_WHOLE('\ue166'),
    REST_HALF('\ue162'),
    REST_QUARTER('\ue15d'),
    REST_EIGHTH('\ue164'),
    REST_16TH('\ue165'),
    
    ;

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

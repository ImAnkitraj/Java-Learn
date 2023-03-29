package com.tekion.cricket;

import java.util.List;

public class Cricket {
    private Match match;

    public Cricket(Match match) {
        this.match = match;
    }

    public void playMatch() {
        this.match.play();
    }
}

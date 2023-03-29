package com.tekion.cricket;

public enum BallOutcome {
    One(1),
    Two(2),
    Three(3),
    Four(4),
    Six(6),
    Wicket(-1);
    private final int value;

    BallOutcome(int intValue) {
        this.value = intValue;
    }

    public int getValue() {
        return value;
    }
}

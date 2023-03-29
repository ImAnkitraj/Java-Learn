package com.tekion.cricket;

public class Ball {
    private Player batsman;
    private Player baller;
    private BallOutcome ballOutcome;

    public Ball(Player batsman, Player baller, BallOutcome ballOutcome) {
        this.batsman = batsman;
        this.baller = baller;
        this.ballOutcome = ballOutcome;
    }

    public String toString() {
        return batsman.getName() + " played the ball, bowled by " + baller.getName() + "Result : " + ballOutcome.toString();
    }

    public Player getBatsman() {
        return batsman;
    }

    public Player getBaller() {
        return baller;
    }

    public BallOutcome getBallOutcome() {
        return ballOutcome;
    }
}

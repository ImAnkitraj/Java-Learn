package com.tekion.cricket;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Over {
    private List<Ball> balls = new ArrayList<>();
    private Player striker;
    private Player nonStriker;
    private Player baller;
    private Integer runs;

    private void ball() {
        Random random = new Random();
        List<BallOutcome> arrayOfBallOutcome = new ArrayList<>(List.of(BallOutcome.values()));
        balls.add(new Ball(striker, baller, arrayOfBallOutcome.get(random.nextInt(7))));
    }

    public void throwOver() {
        for (int i = 0; i < 6; i++) {
            ball();
        }
        for (Ball b : balls) {
            runs += Math.max(b.getBallOutcome().getValue(), 0);
        }
    }

    public Integer getRuns() {
        return runs;
    }

    public Over(Player striker, Player nonStriker, Player baller) {
        this.striker = striker;
        this.nonStriker = nonStriker;
        this.baller = baller;
    }

    public static void main(String[] args) {
        Player striker = new Batsman("MS Dhoni");
        Player nonStriker = new Batsman("Virat Kholi");
        Player baller = new Baller("Mitchell Stark");
        Over o = new Over(striker, nonStriker, baller);
        o.throwOver();
//        System.out.println(o.getRuns());
    }
}

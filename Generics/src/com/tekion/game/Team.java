package com.tekion.game;

import java.util.ArrayList;
import java.util.List;

public class Team<T extends Player> {

    private String name;
    private int played = 0;
    private int win = 0;
    private int lost = 0;
    private int tie = 0;
    private List<T> members = new ArrayList<>();

    public Team(String name) {
        this.name = name;
    }

    public boolean addPlayer(T player) {
        if (members.contains(player)) {
            System.out.println(player.getName() + " already in the team");
            return false;
        }
        members.add(player);


        System.out.println( player.getName() + " is selected in the team");
        return true;
    }

    public String getName() {
        return name;
    }

    public int numPlayers() {
        return members.size();
    }

    public void matchResult(Team oponent, int ourScore, int theirScore) {
        if (ourScore > theirScore) {
            win++;
        } else if (ourScore == theirScore) {
            tie++;
        } else {
            lost++;
        }

        if (oponent != null) {
            oponent.matchResult(null, theirScore, ourScore);
        }
    }

    public int ranking() {
        return (win * 2) + tie;
    }
}

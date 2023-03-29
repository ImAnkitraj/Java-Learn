package com.tekion.game;

public class Main {
    public static void main(String[] args) {
        FootballPlayer footbalPlayer = new FootballPlayer("Ronaldo");
        BaseballPlayer baseballPlayer = new BaseballPlayer(("Goku"));
        SoccerPlayer soccerPlayer = new SoccerPlayer("Messi");

        Team<FootballPlayer> team = new Team<FootballPlayer>("Pandavas");

//        team.addPlayer(soccerPlayer);
        team.addPlayer(footbalPlayer);
//        team.addPlayer(baseballPlayer);
        System.out.println(team);
//        Team<String> strTeam = new Team<>("bdsckj");

    }


}
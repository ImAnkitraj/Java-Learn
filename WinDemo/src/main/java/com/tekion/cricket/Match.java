package com.tekion.cricket;

import java.util.Date;
import java.util.List;

public class Match {
    private Date date;
    private List<Team> teams;
    private Scorecard scorecard;
    private String venue;

    public Match(Date date, List<Team> teams, Scorecard scorecard, String venue) {
        this.date = date;
        this.teams = teams;
        this.scorecard = scorecard;
        this.venue = venue;
    }

    public void play() {

    }
}

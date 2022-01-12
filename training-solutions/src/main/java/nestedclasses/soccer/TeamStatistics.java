package nestedclasses.soccer;

import java.util.Objects;

public class TeamStatistics {

    private String teamName;
    private Match match;
    private int goalsFor;
    private int goalsAgainst;
    private int points;

    public TeamStatistics(String teamName) {
        this.teamName = teamName;
        this.match = new Match();
    }
    public void played(int plusGoalsFor, int plusGoalsAgainst){
        match.played++;
        if(plusGoalsAgainst > plusGoalsFor){
            match.lost++;
        }else if(plusGoalsFor > plusGoalsAgainst){
            match.won++;
        }else {
            match.tied++;
        }
        this.goalsFor += plusGoalsFor;
        this.goalsAgainst += plusGoalsAgainst;
        this.points = this.match.won * 3 + this.match.tied;
    }


    @Override
    public String toString() {
        return teamName + " " + match + " " + match.won + " " + match.tied + " " + match.lost
                + " " + goalsFor + " - " + goalsAgainst + ", " + points;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        TeamStatistics that = (TeamStatistics) o;
        return teamName.equals(that.teamName);
    }

    @Override
    public int hashCode() {
        return Objects.hash(teamName);
    }

    public static class Match {

        private int played;
        private int won;
        private int tied;
        private int lost;

    }

    public String getTeamName() {
        return teamName;
    }

    public Match getMatch() {
        return match;
    }

    public int getGoalsFor() {
        return goalsFor;
    }

    public int getGoalsAgainst() {
        return goalsAgainst;
    }

    public int getPoints() {
        return points;
    }
    public int getPlayed() {
        return match.played;
    }

    public int getWon() {
        return match.won;
    }

    public int getTied() {
        return match.tied;
    }

    public int getLost() {
        return match.lost;
    }
}

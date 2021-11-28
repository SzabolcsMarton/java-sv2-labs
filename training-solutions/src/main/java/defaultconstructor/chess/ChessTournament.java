package defaultconstructor.chess;

import java.util.Arrays;
import java.util.List;

public class ChessTournament {
    private List<Team> teams;

    public ChessTournament() {
        this.teams = Arrays.asList(
                new Team(), new Team(), new Team());
    }

    public List<Team> getTeams() {
        return teams;
    }

    public void addPlayersToTeams(List<Player> playersRegistrated){
        for (int i = 0; i < teams.size() * 2; i++){
            if (playersRegistrated.size() >= i + 1) {
                if (i % 2 == 0) {
                    teams.get(i / 2).setPlayerOne(playersRegistrated.get(i));
                } else {
                    teams.get(i / 2).setPlayerTwo(playersRegistrated.get(i));
                }
            }
        }
    }
}

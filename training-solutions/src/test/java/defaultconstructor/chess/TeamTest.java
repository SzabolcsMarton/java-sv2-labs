package defaultconstructor.chess;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class TeamTest {

    @Test
    void createTeamTest(){
        Player player = new Player();
        player.setEmail("player@gmail.com");
        player.setName("Bela Bacsi");
        Player otherPlayer = new Player();
        otherPlayer.setName("Pista Bacsi");
        otherPlayer.setEmail("otherPlayer@gmail.com");

        Team team = new Team();
        team.setPlayerOne(player);
        team.setPlayerTwo(otherPlayer);

        assertEquals("Bela Bacsi", team.getPlayerOne().getName());
        assertEquals("otherPlayer@gmail.com", team.getPlayerTwo().getEmail());
    }

}
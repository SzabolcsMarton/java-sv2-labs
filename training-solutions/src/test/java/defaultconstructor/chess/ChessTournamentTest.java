package defaultconstructor.chess;

import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class ChessTournamentTest {


    @Test
    void createChessTournamentTest(){

        ChessTournament chessTournament = new ChessTournament();

        assertEquals(3,chessTournament.getTeams().size());

    }

    @Test
    void addPlayersToTeamTest(){

        ChessTournament chessTournament = new ChessTournament();

        Player playerOne = new Player();
        Player playerTwo = new Player();
        Player playerThree = new Player();
        Player playerFour = new Player();
        Player playerFive = new Player();
        Player playerSix = new Player();
        Player playerSeven = new Player();
        playerOne.setName("One");
        playerOne.setEmail("one@gmail.com");
        playerTwo.setName("Two");
        playerTwo.setEmail("two@gmail.com");
        playerThree.setName("Three");
        playerThree.setEmail("three@gmail.com");
        playerFour.setName("Four");
        playerFour.setEmail("four@Gmail.com");
        playerFive.setName("Five");
        playerFive.setEmail("five@gmail.com");
        playerSix.setName("Six");
        playerSix.setEmail("six@gmail.com");
        playerSeven.setName("Seven");
        playerSeven.setName("seven@gmail.com");

        List<Player> players = Arrays.asList(playerOne, playerTwo, playerThree, playerFour, playerFive, playerSix, playerSeven);
        chessTournament.addPlayersToTeams(players);

        assertEquals("Four", chessTournament.getTeams().get(1).getPlayerTwo().getName());
        assertEquals("six@gmail.com", chessTournament.getTeams().get(2).getPlayerTwo().getEmail());

    }

    @Test
    void addPlayersToTeamWithLessPlayersThanSixTest(){
        ChessTournament chessTournament = new ChessTournament();

        Player playerOne = new Player();
        Player playerTwo = new Player();
        Player playerThree = new Player();
        playerOne.setName("One");
        playerOne.setEmail("one@gmail.com");
        playerTwo.setName("Two");
        playerTwo.setEmail("two@gmail.com");
        playerThree.setName("Three");
        playerThree.setEmail("three@gmail.com");

        List<Player> players = Arrays.asList(playerOne, playerTwo, playerThree);

        chessTournament.addPlayersToTeams(players);

        assertEquals("Three",chessTournament.getTeams().get(1).getPlayerOne().getName());
        assertNull(chessTournament.getTeams().get(2).getPlayerTwo());

    }

}
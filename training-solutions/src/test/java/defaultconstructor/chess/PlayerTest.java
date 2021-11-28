package defaultconstructor.chess;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PlayerTest {

    @Test
    void createPlayerTest(){
        Player player = new Player();
        player.setName("Jozska");
        player.setEmail("joci@gmail.com");

        assertEquals("Jozska", player.getName());
        assertEquals("joci@gmail.com", player.getEmail());
    }

}
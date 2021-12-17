package isahasa.fleet;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class LinerTest {

    @Test
    void loadTest(){
        Liner liner = new Liner(200);

        assertEquals(0, liner.loadPassengers(50));
        assertEquals(50, liner.getPassengers());
    }

    @Test
    void overLoadTest() {
        Liner liner = new Liner(200);

        assertEquals(50, liner.loadPassengers(250));
        assertEquals(200, liner.getPassengers());
    }

}
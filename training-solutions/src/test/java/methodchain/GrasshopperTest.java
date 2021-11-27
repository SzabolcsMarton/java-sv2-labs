package methodchain;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class GrasshopperTest {

    Grasshopper grasshopper = new Grasshopper();

    @Test
    void hopOnceTest() {
        grasshopper.hopOnce(Direction.NEGATIV);

        assertEquals(-1, grasshopper.getPosition());
    }

    @Test
    void moveFromZeroToThreeWithFiveHopsTest() {
        grasshopper.moveFromZeroToThreeWithFiveHops();

        assertEquals(3, grasshopper.getPosition());
    }

    @Test
    void getPositionTest() {
        assertEquals(0,grasshopper.getPosition());
    }
}
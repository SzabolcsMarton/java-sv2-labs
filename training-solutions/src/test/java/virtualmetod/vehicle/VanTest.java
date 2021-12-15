package virtualmetod.vehicle;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class VanTest {

    @Test
    void getGrossLoadTest() {
        Van van = new Van(1000, 1, 500);

        assertEquals( 1650, van.getGrossLoad());
    }

    @Test
    void toStringTest() {
        Van van = new Van(1000, 1, 500);

        assertEquals("Van{cargoWeight=" + 500 + ", numberOfPassenger=" + 1 + ", vehicleWeight=" + 1000 + '}', van.toString());
    }
}
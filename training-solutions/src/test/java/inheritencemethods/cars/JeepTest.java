package inheritencemethods.cars;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class JeepTest {

    @Test
    void createJeepTest() {
        Jeep jeep = new Jeep(7.0, 40, 50.0, 15.0, 10);

        assertEquals(15, jeep.getExtraCapacity());
        assertEquals(10, jeep.getExtraFuel());
    }

    @Test
    void createWithWrongExtrafuel() throws IllegalStateException {
        IllegalArgumentException exception = assertThrows(IllegalArgumentException.class,
                () -> new Jeep(7.0, 40, 50.0, 15.0, 20));
        assertEquals("Extra fuel is more than extra Capacity", exception.getMessage());
    }

    @Test
    void driveTest() {
        Jeep jeep = new Jeep(10.0, 30.0, 50.0, 40.0, 20.0);
        jeep.drive(300);

        assertEquals(0.0, jeep.getExtraFuel());
        assertEquals(20.0, jeep.getFuel());
    }

    @Test
    void driveWithNotEnoughFuelTest() throws RuntimeException {
        Jeep jeep = new Jeep(10.0, 30.0, 50.0, 40.0, 20.0);

        Exception exception = assertThrows(RuntimeException.class, () -> jeep.drive(600));
        assertEquals("Fuel is not enough", exception.getMessage());
    }

    @Test
    void calculateRefillTest(){
        Jeep jeep = new Jeep(10.0, 30.0, 50.0, 40.0, 20.0);

        assertEquals(40, jeep.calculateRefillAmount());
    }

}
package interfacestaticmethods.vehicle;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class VehicleTest {

    @Test
    void bicycleTest() {
        Vehicle vehicle = Vehicle.of(2);
        assertEquals(Bicycle.class, vehicle.getClass());
    }

    @Test
    void carTest() {
        Vehicle vehicle = Vehicle.of(4);

        assertEquals(Car.class, vehicle.getClass());
    }

    @Test
    void exceptionTest() {
        Exception ex = assertThrows(IllegalArgumentException.class, () -> Vehicle.of(3));
        assertEquals("This is neither a bicycle nor a car.", ex.getMessage());
    }
}
package virtualmetod.vehicle;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class VehicleTest {

    @Test
    void getGrossLoadTest() {
        Vehicle vehicle = new Vehicle(1500);

        assertEquals(1575, vehicle.getGrossLoad());
    }

    @Test
    void getVehicleWeightTest() {
        Vehicle vehicle = new Vehicle(1500);

        assertEquals(1500, vehicle.getVehicleWeight());
    }

    @Test
    void toStringTest() {
        Vehicle vehicle = new Vehicle(1500);

        assertEquals("Vehicle{vehicleWeight=" + 1500 + '}', vehicle.toString());
    }
}
package isahasa.fleet;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CargoShipTest {
    @Test
    void loadTest() {
        CargoShip cargoShip = new CargoShip(1000);
        assertEquals(0, cargoShip.getCargoWeight());
        int remainder = cargoShip.loadCargo(500);

        assertEquals(0, remainder);
        assertEquals(500, cargoShip.getCargoWeight());
    }

    @Test
    void overLoadTest() {
        CargoShip cargoShip = new CargoShip(1000);
        assertEquals(0, cargoShip.getCargoWeight());
        int remainder = cargoShip.loadCargo(1500);

        assertEquals(500, remainder);
        assertEquals(1000, cargoShip.getCargoWeight());
    }
}
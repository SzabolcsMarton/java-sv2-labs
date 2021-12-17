package isahasa.fleet;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class FerryBoatTest {

        @Test
        void loadTest() {
            FerryBoat ferryBoat = new FerryBoat(1000, 50);

            assertEquals(0, ferryBoat.loadPassengers(40));
            assertEquals(0, ferryBoat.loadCargo(500));
            assertEquals(500, ferryBoat.getCargoWeight());
            assertEquals(40, ferryBoat.getPassengers());
        }

        @Test
        void overLoadTest() {
            FerryBoat ferryBoat = new FerryBoat(1000, 50);

            assertEquals(30, ferryBoat.loadPassengers(80));
            assertEquals(200, ferryBoat.loadCargo(1200));
            assertEquals(1000, ferryBoat.getCargoWeight());
            assertEquals(50, ferryBoat.getPassengers());
        }

}
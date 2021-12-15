package virtualmetod.vehicle;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class FerryBoatTest {

    @Test
    void canCarryWithTrueTest() {
        FerryBoat ferryBoat = new FerryBoat(1000);
        Car carOne = new Car(1500, 0);
        Car carTwo = new Van(1500, 1, 300);

        assertTrue(ferryBoat.canCarry(carOne));
        assertTrue(ferryBoat.canCarry(carTwo));
    }

    @Test
    void canCarryWithFalseTest() {
        FerryBoat ferryBoat = new FerryBoat(1000);
        Car carOne = new Car(1900, 4);
        Car carTwo = new Van(1500, 2, 500);

        assertFalse(ferryBoat.canCarry(carOne));
        assertFalse(ferryBoat.canCarry(carTwo));
    }

    @Test
    void loadSuccessTest() {
        FerryBoat ferryBoat = new FerryBoat(1500);
        Car car = new Car(1000, 1);

        assertTrue(ferryBoat.load(car));
    }

    @Test
    void loadFailedTest() {
        FerryBoat ferryBoat = new FerryBoat(1000);
        Car car = new Car(2000, 1);

        assertFalse(ferryBoat.load(car));
    }

    @Test
    void getGrossLoadTest() {
        FerryBoat ferryBoat = new FerryBoat(1000);
        Car car = new Car(1000, 2);
        ferryBoat.load(car);

        assertEquals(2300, ferryBoat.getGrossLoad());
    }

    @Test
    void toStringCarTest() {
        FerryBoat ferryBoat = new FerryBoat(1500);
        Car car = new Car(1200, 3);
        ferryBoat.load(car);

        assertEquals("FerryBoat{" +
                "car=" +
                "Car{numberOfPassenger=" + 3 + ", vehicleWeight=" + 1200 + '}' +
                '}', ferryBoat.toString());
    }

    @Test
    void toStringVanTest() {
        FerryBoat ferryBoat = new FerryBoat(1500);
        Van van = new Van(1000, 1, 400);
        ferryBoat.load(van);

        assertEquals("FerryBoat{car=Van{cargoWeight=" + 400 + ", numberOfPassenger=" + 1 + ", vehicleWeight=" + 1000 + "}}", ferryBoat.toString());
    }
}
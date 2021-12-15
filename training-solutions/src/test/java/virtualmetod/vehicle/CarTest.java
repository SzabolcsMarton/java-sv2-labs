package virtualmetod.vehicle;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CarTest {


    @Test
    void getGrossLoadTest() {
        Car car = new Car(1500, 3);

        assertEquals(4 * Car.PERSON_AVERAGE_WEIGHT + 1500, car.getGrossLoad());
    }

    @Test
    void toStringTest() {
        Car car = new Car(1500, 3);

        assertEquals("Car{numberOfPassenger=" + 3 + ", vehicleWeight=" + 1500 + '}', car.toString());
    }

}
package interfacedefaultmethods.seat;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SeatTest {

    @Test
    void familyCarTest() {
        FamilyCar familyCar = new FamilyCar();

        assertEquals(5, familyCar.getNumberOfSeats());
    }

    @Test
    void sportsCarTest() {
        SportsCar sportsCar = new SportsCar();

        assertEquals(2, sportsCar.getNumberOfSeats());
    }

    @Test
    void testCar() {
        Car car = new Car("Lada Samara", 5);

        assertEquals("Lada Samara", car.getBrand());
        assertEquals(5, car.getNumberOfSeats());
    }
}
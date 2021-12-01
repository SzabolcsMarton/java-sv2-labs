package inheritencemethods.cars;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CarTest {

    @Test
    void createarTest(){
        Car car = new Car(7.0,40,50);

        assertEquals(7.0, car.getFuelRate());
        assertEquals(40, car.getFuel());
        assertEquals(50, car.getTankCapacity());
    }

    @Test
    void createWithWrongTest() throws IllegalArgumentException{
        IllegalArgumentException exception = assertThrows(IllegalArgumentException.class,
                ()-> new Car(7.0,50,40));
        assertEquals("Can not have more fuel than the capacity",exception.getMessage());
    }

    @Test
    void testDrive() {
        Car car = new Car(5.0, 25.0, 40.0);
        car.drive(100);

        assertEquals(20.0, car.getFuel());
    }

    @Test
    void testModifyFuelAmount() {
        Car car = new Car(5.0, 25.0, 40.0);
        car.modifyFuelAmount(-10.0);

        assertEquals(15.0, car.getFuel());
    }

    @Test
    void testNotEnoughFuelShouldThrowException() throws IllegalStateException {
        Car car = new Car(5.0, 25.0, 40.0);

        IllegalStateException exception = assertThrows(IllegalStateException.class, () -> car.drive(600));
        assertEquals("Fuel is not enough", exception.getMessage());
    }

    @Test
    void testCalculateRefillAmount() {
        Car car = new Car(5.0, 25.0, 40.0);

        assertEquals(15.0, car.calculateRefillAmount());
    }

}
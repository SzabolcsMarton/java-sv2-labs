package immutable;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CarTest {

    @Test
    void createCarTest(){
       Car car = new Car("Opel","Corsa",2010);

       assertEquals("Opel",car.getBrand());
       assertEquals("Corsa",car.getType());
       assertEquals(2010,car.getYearOfCreation());
    }

}
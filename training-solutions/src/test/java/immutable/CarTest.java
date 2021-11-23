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

    @Test
    void createCarWithNullBrandTest(){
        IllegalArgumentException exception = assertThrows(IllegalArgumentException.class,
                ()-> new Car(null,"Corsa", 1998));
        assertEquals("Brand name cannot be empty!",exception.getMessage());
    }

    @Test
    void createCarWithEmptyBrandTest(){
        IllegalArgumentException exception = assertThrows(IllegalArgumentException.class,
                ()-> new Car("","Corsa", 1998));
        assertEquals("Brand name cannot be empty!",exception.getMessage());
    }

    @Test
    void createCarWithWrongYearTest(){
            IllegalArgumentException exception = assertThrows(IllegalArgumentException.class,
                    ()-> new Car("Opel","Corsa", 2022));
            assertEquals("Year of production cannot be in the future!",exception.getMessage());

    }

}
package sorting;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class CarDealerTest {

    CarDealer carDealer;

    @BeforeEach
    void init() {
        carDealer = new CarDealer();
        carDealer.addCar(new Car("a",2000 , 3_000_000));
        carDealer.addCar(new Car("b", 2010, 5_000_000));
        carDealer.addCar(new Car("c", 1985, 1_000_000));

    }

    @Test
    void getCarsOrderedByYearOfConstructionTest() {
        List<Car> expected = carDealer.getCarsOrderedByYearOfConstruction();

        assertEquals("c", expected.get(0).getBrand());
        assertEquals("b", expected.get(2).getBrand());
    }

    @Test
    void getCarsOrderedByPriceTest() {
        List<Car> expected = carDealer.getCarsOrderedByPrice();

        assertEquals("c", expected.get(0).getBrand());
        assertEquals("b", expected.get(2).getBrand());

    }
}
package lambdaintro;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class UsedCars {

    private List<Car> carsForSell;

    public UsedCars(List<Car> carsForSell) {
        this.carsForSell = carsForSell;
    }

    public List<Car> listCarsByPrice() {
        List<Car> carsSortedByPrice = new ArrayList<>(carsForSell);
        carsSortedByPrice.sort((car, otherCar)-> Integer.valueOf(car.getPrice()).compareTo(otherCar.getPrice()));
        return carsSortedByPrice;
    }

    public List<Car> listCarsByLengthDesc() {
        List<Car> carsSortedByLength = new ArrayList<>(carsForSell);
        carsSortedByLength.sort((car, otherCar) -> Double.valueOf(car.getLength()).compareTo(otherCar.getLength()));
        Collections.reverse(carsSortedByLength);
        return carsSortedByLength;
    }

    public List<Car> listCarsOneBrandByType(String brand) {
        List<Car> carsByBrandTypeAlphabetic = new ArrayList<>(carsForSell);
        carsByBrandTypeAlphabetic.sort((car, otherCar) -> car.getType().compareTo(otherCar.getType()));
        carsByBrandTypeAlphabetic.removeIf((car) -> !car.getBrand().equals(brand));
        return carsByBrandTypeAlphabetic;
    }

    public List<Car> getCarsForSell() {
        return new ArrayList<>(carsForSell);
    }
}

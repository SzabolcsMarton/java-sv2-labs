package sorting;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class CarDealer {

    private List<Car> carsForSell = new ArrayList<>();

    public void addCar(Car car){
        carsForSell.add(car);
    }

    public List<Car> getCarsOrderedByYearOfConstruction(){
        List<Car> orderedCars = new ArrayList<>(carsForSell);
        Collections.sort(orderedCars,new CarConstructionComparator());
        return orderedCars;
    }

    public List<Car> getCarsOrderedByPrice() {
        List<Car> orderedCars = new ArrayList<>(carsForSell);
        Collections.sort(orderedCars, new CarPriceComparator());
        return orderedCars;
    }

    public List<Car> getCarsForSell() {
        return new ArrayList<>(carsForSell);
    }
}

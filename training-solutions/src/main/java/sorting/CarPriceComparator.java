package sorting;

import java.util.Comparator;

public class CarPriceComparator implements Comparator<Car> {
    @Override
    public int compare(Car o1, Car o2) {
        return Integer.valueOf(o1.getPrice()).compareTo(o2.getPrice());
    }
}

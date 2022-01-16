package sorting;

import java.util.Comparator;

public class CarConstructionComparator implements Comparator<Car> {

    @Override
    public int compare(Car o1, Car o2) {
        return Integer.valueOf(o1.getMadeIn()).compareTo(o2.getMadeIn());
    }
}

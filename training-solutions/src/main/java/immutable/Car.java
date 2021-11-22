package immutable;

import java.time.LocalDate;

public class Car {
    private final String brand;
    private final String type;
    private final int yearOfCreation;

    public Car(String brand, String type, int yearOfCreation) {
        if(brand == null || brand.isBlank()){
            throw new IllegalArgumentException("Brand is missing!");
        }
        if(yearOfCreation > LocalDate.now().getYear()){
            throw new IllegalArgumentException("Year of creation is not valid!");
        }
        this.brand = brand;
        this.type = type;
        this.yearOfCreation = yearOfCreation;
    }

    public String getBrand() {
        return brand;
    }

    public String getType() {
        return type;
    }

    public int getYearOfCreation() {
        return yearOfCreation;
    }
}

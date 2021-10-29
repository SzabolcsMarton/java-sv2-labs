package primitivetypes.exam;

import java.time.LocalDate;

public class Person {
    private String name;
    private LocalDate dateOfBirth;
    private int zipCode;
    private double averagePoints;

    public Person(String name, LocalDate dateOfBirth, int zipCode, double averagePoints) {
        this.name = name;
        this.dateOfBirth = dateOfBirth;
        this.zipCode = zipCode;
        this.averagePoints = averagePoints;
    }

    public String getName() {
        return name;
    }

    public LocalDate getDateOfBirth() {
        return dateOfBirth;
    }

    public int getZipCode() {
        return zipCode;
    }

    public double getAveragePoints() {
        return averagePoints;
    }

    @Override
    public String toString() {
        return "Person { name= " + name +
                ", dateOfBirth= " + dateOfBirth +
                ", zipCode= " + zipCode +
                ", average= " + averagePoints + " }";
    }
}

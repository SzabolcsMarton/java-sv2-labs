package junit5fixture;

public class Ship {
    private String name;
    private int yearOfConstruction;
    private double lenght;

    public Ship(String name, int yearOfConstruction, double lenght) {
        this.name = name;
        this.yearOfConstruction = yearOfConstruction;
        this.lenght = lenght;
    }

    public String getName() {
        return name;
    }

    public int getYearOfConstruction() {
        return yearOfConstruction;
    }

    public double getLenght() {
        return lenght;
    }
}

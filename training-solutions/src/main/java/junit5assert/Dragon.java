package junit5assert;

public class Dragon {
    private String name;
    private int numberOfLegs;
    private double height;

    public Dragon(String name, int numberOfHeads, double height) {
        this.name = name;
        this.numberOfLegs = numberOfHeads;
        this.height = height;
    }

    public String getName() {
        return name;
    }

    public int getNumberOfHeads() {
        return numberOfLegs;
    }

    public double getHeight() {
        return height;
    }
}

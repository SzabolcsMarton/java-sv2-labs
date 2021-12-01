package inheritanceattributes;

public class Building {

    protected String name;

    protected double area;

    private int floors;

    public Building(String name, double area, int floor) {
        this.name = name;
        this.area = area;
        this.floors = floor;
    }

    public int getFloors() {
        return floors;
    }
}

package inheritanceattributes;

public class SchoolBuilding extends Building{

    private int numberOfClassRooms;

    public SchoolBuilding(String name, double area, int floor, int numberOfClassRooms) {
        super(name, area, floor);
        this.numberOfClassRooms = numberOfClassRooms;
    }

    public int getNumberOfClassRooms() {
        return numberOfClassRooms;
    }
}

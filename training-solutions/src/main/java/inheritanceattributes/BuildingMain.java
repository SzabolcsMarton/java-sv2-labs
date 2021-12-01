package inheritanceattributes;

public class BuildingMain {

    public static void main(String[] args) {
        Building building = new Building("Building",250,2);
        SchoolBuilding schoolBuilding = new SchoolBuilding("Schoolbuilding",850.5,3,12);
        System.out.println(building.name);
        System.out.println(building.area);
        System.out.println(building.getFloors());
        System.out.println();
        System.out.println(schoolBuilding.name);
        System.out.println(schoolBuilding.area);
        System.out.println(schoolBuilding.getFloors());
        System.out.println(schoolBuilding.getNumberOfClassRooms());
    }
}

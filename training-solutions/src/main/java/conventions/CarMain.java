package conventions;

public class CarMain {
    public static void main(String[] args) {
        Car car = new Car("Skoda","benzin",4,5);
        car.addModelName("1000 Mb");

        System.out.println("Cartype: " + car.getCarType());
        System.out.println("Engine : " + car.getEngineType());
        System.out.println("Nr.of doors: " + car.getDoors());
        System.out.println("Nr.of passangers: " + car.getPersons());
    }
}

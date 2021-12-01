package inheritencemethods.plane;

public class Plane {

    public static void main(String[] args) {
        Passenger passenger = new Passenger("Sanyi bacsi",10_000);
        System.out.println(passenger.getName());
        System.out.println(passenger.getPriceOfPlaneTicket());

        System.out.println();

        PriorityPassenger priorityPassenger = new PriorityPassenger("Jozsi bacsi",10_000, 25);
        System.out.println(priorityPassenger.getName());
        System.out.println(priorityPassenger.getPriceOfPlaneTicket());
        System.out.println(priorityPassenger.getPERCENT());

        System.out.println();

        FirstClassPassenger firstClassPassenger = new FirstClassPassenger("Juli neni", 10_000, 25);
        System.out.println(firstClassPassenger.getName());
        System.out.println(firstClassPassenger.getPriceOfPlaneTicket());
        System.out.println(firstClassPassenger.getPERCENT());
        System.out.println(firstClassPassenger.getExtraCharge());
    }
}

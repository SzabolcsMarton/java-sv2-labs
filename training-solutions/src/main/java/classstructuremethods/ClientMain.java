package classstructuremethods;

public class ClientMain {

    public static void main(String[] args) {
        Client client = new Client();

        client.setName("Pista");
        client.setYearOfBirth(1985);
        client.setAddress("Budapest");

        System.out.println("Name: " + client.getName());
        System.out.println("Y.O.B. : " + client.getYearOfBirth());
        System.out.println("Address: "+ client.getAddress());

        client.migrate("Dömös");

        System.out.println("New Address: " + client.getAddress());


    }
}

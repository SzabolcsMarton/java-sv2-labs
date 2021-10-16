package classstructureattributes;

import java.util.Scanner;

public class ClientMain {

    public static void main(String[] args) {
        Scanner clientScanner = new Scanner(System.in);
        Client client = new Client();

        System.out.println("Name:");
        client.name = clientScanner.nextLine();

        System.out.println("Year of Birth:");
        client.yearOfBirth = clientScanner.nextInt();

        clientScanner.nextLine();

        System.out.println("Address:");
        client.address = clientScanner.nextLine();


        System.out.println("Name: " + client.name );
        System.out.println("Y.O.B. :" + client.yearOfBirth);
        System.out.println("Address :" + client.address);
    }
}

package classstructureio;

import java.util.Scanner;

public class Registration {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Adja meg a nevét:");
        String name = scanner.nextLine();

        System.out.println("Adja meg az e-mail cimét:");
        String emailAddress = scanner.nextLine();

        System.out.println("A regisztracios adatok:");
        System.out.println("Név: " + name);
        System.out.println("E-mail cim: " + emailAddress);
    }
}

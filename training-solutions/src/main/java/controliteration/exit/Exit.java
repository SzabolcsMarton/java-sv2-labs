package controliteration.exit;

import java.util.Scanner;

public class Exit {

    public static void main(String[] args) {
        Scanner scnr = new Scanner(System.in);
        String letter;
        String message = "Az ügyfélszolgálat menüje jelenleg nem elérhető.\n " +
                "Kilépés: x billentyű megnyomásával";
        do {
            System.out.println(message);
            letter = scnr.nextLine().toLowerCase();
        }while (!letter.equals("x"));
        System.out.println("Köszönjük türelmét'");
    }
}

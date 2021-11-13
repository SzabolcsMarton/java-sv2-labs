package introexceptionthrow;

import java.util.Scanner;

public class Registration {
    public static void main(String[] args) {
        Scanner scnr = new Scanner(System.in);
        Validation validation = new Validation();
        boolean isValid = false;

        System.out.println("Üdvözlöm! \nKérem adja meg a felhasználó nevét:");
        String name = scnr.nextLine();
        try {
            validation.validateName(name);
            isValid = true;
        }catch (IllegalArgumentException iae){
            System.out.println(iae.getMessage());
        }

        System.out.println("Krem adja meg az életkorát:");
        String age = scnr.nextLine();
        try {
            validation.validateAge(age);
            isValid = true;
        }catch (IllegalArgumentException iae){
            System.out.println(iae.getMessage());
        }

        System.out.println("A megadott regisztrációs adatok:");
        System.out.println("Felhasználónév : " + name);
        System.out.println("Életkor: " + age);

        String result = isValid ? "Sikeres regisztracio!" : "Sikertelen regisztracio!";
        System.out.println(result);

    }


}

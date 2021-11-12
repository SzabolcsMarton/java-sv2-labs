package introexceptiontrycatchtrace;

import java.util.Scanner;

public class CalculatorMain {
    public static void main(String[] args) {
        Scanner scnr = new Scanner(System.in);
        Calculator calculator = new Calculator();

        int firstNumber = 0;
        int secondNumber = 0;

        System.out.println("Adja meg az elso szamot:");
        try {
            firstNumber = Integer.parseInt(scnr.nextLine());
        } catch (NumberFormatException nfe) {
            System.out.println("Nem szamot irt be! Alapertelmezett ertek 0 lesz.");
        }

        System.out.println("Adja meg az masodik szamot:");
        try {
            secondNumber = Integer.parseInt(scnr.nextLine());
        } catch (NumberFormatException nfe) {
            System.out.println("Nem szamot irt be! Alapertelmezett ertek 0 lesz.");
        }

        System.out.println("Milyen műveletet vegezzunk el?");
        System.out.println("1. Összeadás");
        System.out.println("2. Kivonás");
        System.out.println("3. Szorzás");
        System.out.println("4. Osztás");
        String operation = scnr.nextLine();

        try {
            switch (operation) {
                case "1":
                    System.out.println("Eredmény: " + calculator.add(firstNumber, secondNumber));
                    break;
                case "2":
                    System.out.println("Eredmény: " + calculator.subtract(firstNumber, secondNumber));
                    break;
                case "3":
                    System.out.println("Eredmény: " + calculator.multiplicate(firstNumber, secondNumber));
                    break;
                case "4":
                    System.out.println("Eredmény egész része: " + calculator.divide(firstNumber, secondNumber));
                    break;
                default:
                    System.out.println("Nincs ilyen számú művelet");
            }
        } catch (ArithmeticException ae) {
            System.out.println("Nullával való osztás nem értelmezett");
        }
    }

}

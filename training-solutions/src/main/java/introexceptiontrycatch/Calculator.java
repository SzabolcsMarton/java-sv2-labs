package introexceptiontrycatch;

import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        Scanner scnr = new Scanner(System.in);

        int firstNumber = 0;
        int secondNumber =0;

        System.out.println("Adja meg az elso szamot:");
        try{
            firstNumber = Integer.parseInt(scnr.nextLine());
            scnr.nextLine();
        }catch (NumberFormatException nfe){
            System.out.println("Nem szamot irt be!");
        }

        System.out.println("Adja meg az masodik szamot:");
        try{
            secondNumber = Integer.parseInt(scnr.nextLine());
            scnr.nextLine();
        }catch (NumberFormatException nfe){
            System.out.println("Nem szamot irt be!");
        }
        System.out.println("Milyen műveletet vegezzunk, valasszon a felsoroltakbol?");
        System.out.println("1. Összeadás");
        System.out.println("2. Kivonás");
        System.out.println("3. Szorzás");
        System.out.println("4. Osztás");
        String operation  = scnr.nextLine();

        try {
            switch (operation) {
                case "1":
                    System.out.println("Eredmény: " + (firstNumber + secondNumber));
                    break;
                case "2":
                    System.out.println("Eredmény: " + (firstNumber - secondNumber));
                    break;
                case "3":
                    System.out.println("Eredmény: " + (firstNumber * secondNumber));
                    break;
                case "4":
                    System.out.println("Eredmény egész része: " + (firstNumber / secondNumber));
                    break;
                default:
                    System.out.println("Értelmezhetetlen művelet");
            }
        } catch (ArithmeticException ae) {
            System.out.println("Nem értelmezhető művelet: 0-val való osztás!");
        }
    }
}

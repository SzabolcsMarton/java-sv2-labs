package statements;

import java.util.Scanner;

public class DivByThree {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Szám: ");
        int number = scanner.nextInt();
        boolean canDivideBy3 = number % 3 == 0;
        System.out.println("Oszthato hárommal: " + canDivideBy3);
    }
}

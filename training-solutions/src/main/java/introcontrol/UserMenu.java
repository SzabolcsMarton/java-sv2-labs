package introcontrol;

import java.util.Scanner;

public class UserMenu {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("1. Felhasználók listázása\n2. Felhasználók felvétele\nTöbbi: Kilépés");
        System.out.println("Adj meg egy menüpontot:");
        int number = scanner.nextInt();

        if(number == 1) {
            System.out.println("Felhasználok listázása");
        }
        if(number == 2){
            System.out.println("Felhasználók felvétele");
        }
    }

}

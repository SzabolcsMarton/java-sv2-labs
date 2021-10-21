package introcontrol;

import java.util.Scanner;

public class Qualifier {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Type in a number!");
        int number = scanner.nextInt();
         if( number > 100) {
             System.out.println("Nagyobb, mint szaz!");
         }else {
             System.out.println("Szaz vagy kissebb");
         }
    }
}

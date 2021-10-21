package introcontrol;

import java.util.Scanner;

public class Sum {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Irj be 5 szamot!");
        int total = 0;
        for(int i = 0; i < 5; i++) {
            int amount = scanner.nextInt();
            total += amount;
        }
        System.out.println("Összeg: " + total);
    }
}

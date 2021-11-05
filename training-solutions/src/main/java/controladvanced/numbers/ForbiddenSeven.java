package controladvanced.numbers;

import java.util.Scanner;

public class ForbiddenSeven {

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        System.out.println("Type in the number to start with:");
        int number = scn.nextInt();

        for (int i = number; i >= number; i++) {
            if (i % 7 == 0) {
                System.out.println("X");
                continue;
            }


            if (Integer.toString(i).contains("7")) {
                break;
            }

            System.out.println(i);
        }
    }
}


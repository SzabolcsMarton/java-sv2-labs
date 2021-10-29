package numbers;

import java.util.Scanner;

public class MathOperation {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        String projectToBeSolved = "(15 / 2) + 8 * 5 - 10";
        double result = (15.0 / 2.0) + 8 * 5.0 - 10;


        System.out.println("Oldja meg a kovetkezo feladatot \n " +
                "es az eredmenyt irja be! :");
        System.out.println(projectToBeSolved);
        double userSolution = scn.nextDouble();

        if((Math.abs(result - userSolution) < 0.0001)){
            System.out.println("Helyes megoldas!");
        }else{
            System.out.println("Sajnos helytelen a megoldas");
        }
    }

}

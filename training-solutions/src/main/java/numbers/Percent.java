package numbers;

import java.util.Scanner;

public class Percent {
    public double getValue(int number, int percent) {
        return number / (double)100 *percent;
    }

    public double getBase(int number, int percent) {
        return number / percent * (double)100;

    }

    public double getPercent(int number, int percent) {
        return percent / (double)number * 100;
    }

    public static void main(String[] args) {
        Percent percent = new Percent();
        Scanner scn = new Scanner(System.in);

        System.out.println("Type in the first number:");
        int firstNumber = scn.nextInt();
        System.out.println("Type in the second number:");
        int secondNumber = scn.nextInt();
        System.out.println(percent.getValue(firstNumber, secondNumber));
        System.out.println(percent.getBase(firstNumber, secondNumber));
        System.out.println(percent.getPercent(firstNumber, secondNumber));
    }
}

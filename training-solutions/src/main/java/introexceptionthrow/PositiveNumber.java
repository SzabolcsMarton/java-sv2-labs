package introexceptionthrow;

import java.util.Scanner;

public class PositiveNumber {

    public static void main(String[] args) {
        Scanner scnr = new Scanner(System.in);
        System.out.println("Irjon be egy pozitiv egesz szamot:");
        String number = scnr.nextLine();
        char[] charsInNumber = number.toCharArray();
        for (int i = 0; i < charsInNumber.length; i++){
            if(!Character.isDigit(charsInNumber[i])){
                throw new IllegalArgumentException("Not a number: " + number);
            }
        }
    }
}

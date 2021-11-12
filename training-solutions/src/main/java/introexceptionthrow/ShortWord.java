package introexceptionthrow;

import java.util.Scanner;

public class ShortWord {

    public static void main(String[] args) {
        Scanner scnr = new Scanner(System.in);

        System.out.println("Adjon meg egy maximum 5 betus szot:");
        String word = scnr.nextLine();
        if (word.length() > 5) {
            throw new IllegalArgumentException("A szo hosszabb mint 5 betu! => " + word);
        }
        char[] charsInNumber = word.toCharArray();
        for (int i = 0; i < charsInNumber.length; i++) {
            if (!Character.isAlphabetic(charsInNumber[i])) {
                throw new IllegalArgumentException("A(z) " + (i + 1) + ". karakter nem betu! => " + word);
            }
        }
        System.out.println("A megadott szo : " + word);
    }
}

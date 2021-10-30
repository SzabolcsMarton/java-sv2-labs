package stringbasic.Characters;

import java.util.Arrays;
import java.util.Scanner;

public class Words {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        System.out.println("Kerem a tanar irja be a szot! :");
        String wordToSpell = scn.nextLine();
        char[] spelledChars = new char[wordToSpell.length()];
        System.out.println("Betuzze a kovetkezo szot: " + wordToSpell);
        System.out.println("Minden betu utan nyomjon enter billentyut!");
        for (int i = 0; i < wordToSpell.length(); i++) {
            String letter = scn.nextLine();
            spelledChars[i] = letter.toCharArray()[0];

        }
        System.out.println("A birt betuk : " + Arrays.toString(spelledChars));

        String spelledWord = new String(spelledChars);
        System.out.println("A beirt szo: " + spelledWord);

        if (spelledWord.equals(wordToSpell)){
            System.out.println("Az eredeti szo: " + wordToSpell);
            System.out.println("A betuzott szo ugyanaz.");
        }else{
            System.out.println("Sajnos a betuzott szo nem ugyanaz.");
        }
    }
}

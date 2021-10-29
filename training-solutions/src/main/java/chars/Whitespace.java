package chars;

import java.util.Scanner;

public class Whitespace {

    public String makeWhitespaceToStar(String text) {
        char[] charsOfText = text.toCharArray();
        for (int i = 0; i < text.length(); i++){
            if(charsOfText[i] == ' '){
                charsOfText[i] = '*';
            }
        }
        return new String(charsOfText);
    }

    public static void main(String[] args) {

        Whitespace whitespace = new Whitespace();
        Scanner scn = new Scanner(System.in);

        System.out.println("Type in a few words separated by space!");
        String text = scn.nextLine();

        System.out.println(whitespace.makeWhitespaceToStar(text));
    }
}

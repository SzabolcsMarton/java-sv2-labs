package controlselection.consonant;

public class ToConsonant {

    public String vowels = "aeiou";

    public char toConsonant(char c) {

        if (vowels.indexOf(c) != -1) {
            return (char) (c + 1);
        }
        else {
            return c;
        }
    }
}

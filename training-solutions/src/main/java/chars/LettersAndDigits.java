package chars;

public class LettersAndDigits {

    public void printLetterOrDigit(String text){
        for(int i = 0; i < text.length(); i++){
            char charToTest = text.charAt(i);
            if(Character.isAlphabetic(charToTest)){
                System.out.println(charToTest + ": Betu");
            }else if (Character.isDigit(charToTest)){
                System.out.println(charToTest + ": Szam");
            }else {
                System.out.println(charToTest + " Egyeb");
            }
        }
    }

    public static void main(String[] args) {
        LettersAndDigits lettersAndDigits = new LettersAndDigits();
        lettersAndDigits.printLetterOrDigit("bfa68fF;X");
    }
}

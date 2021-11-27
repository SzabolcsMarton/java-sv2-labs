package methodchain;

public class ModifiedWord {

    public String modify(String word){

        char toSmallX = word.toUpperCase().charAt(1);

        return word
                .toUpperCase()
                .replace(toSmallX, 'x')
                .substring(0,3)
                .concat("y");

    }
}

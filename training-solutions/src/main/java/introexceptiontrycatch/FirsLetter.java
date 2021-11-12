package introexceptiontrycatch;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class FirsLetter {
    private List<String> words = Arrays.asList("auto", "kuplung","teve", "fizika");

    public static void main(String[] args) {
        FirsLetter firsLetter = new FirsLetter();

        try{
            for(String word: firsLetter.words){
                System.out.println(word.charAt(0));
            }
        }catch (NullPointerException npe){
            System.out.println(npe.getMessage());
        }

    }
}

package algorithmstransformation.letters;

import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class TwoLettersTest {

    TwoLetters twoLetters = new TwoLetters();

    @Test
    void getFirstTwoLettersTest(){
        List<String> words = Arrays.asList("auto", "kalapacs", "kalap", "java", "januar", "porckorong");
        List<String> expext = Arrays.asList("au", "ka", "ka", "ja", "ja", "po");

        assertEquals(expext, twoLetters.getFirstTwoLetters(words));


    }

}
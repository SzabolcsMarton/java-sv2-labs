package algorithmsdecision.words;

import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class WordTest {

    @Test
    void containsLongerWordTest(){
        Word word = new Word();
        List<String> wordsList = Arrays.asList("kacsa", "pirkadat", "teve", "asztal", "slusszkulcs", "birka");

        assertTrue(word.containsLongerWord(wordsList,"asztal"));
        assertTrue(word.containsLongerWord(wordsList,"lepke"));
        assertFalse(word.containsLongerWord(wordsList,"szarvasmarha"));

    }

}
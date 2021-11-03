package junit5fixture;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class WordsTest {
    Words words;

    @BeforeEach
    void initWords(){
        words = new Words();
        words.addWord("ajto");
        words.addWord("cipo");
        words.addWord("kalapacs");
        words.addWord("java");
        words.addWord("javascript");
        words.addWord("butykostengely");
        words.addWord("kisusti");
    }
    @Test
    void testGetWordsStartWith(){
        List<String> controll = Arrays.asList("java", "javascript");
        words.getWordsStartWith("j");

        assertEquals(controll, words.getWords());
    }

    @Test
    void  testGetWordsWithLenght(){
        List<String> controll = Arrays.asList("ajto", "cipo","java");
        words.getWordsWithLenght(4);

        assertEquals(controll,words.getWords());
    }

}
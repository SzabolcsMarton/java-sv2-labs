package controlselection.consonant;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ToConsonantTest {

    @Test
    void testWithVowel(){
        assertEquals('b', new ToConsonant().toConsonant('a'));
    }

    @Test
    void testWithConsonant(){
        assertEquals('d', new ToConsonant().toConsonant('d'));
    }

}
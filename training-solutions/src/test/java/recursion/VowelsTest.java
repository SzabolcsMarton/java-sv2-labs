package recursion;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class VowelsTest {

    @Test
    void getNumberOfVowelsTest(){
        Vowels vowels = new Vowels();

        assertEquals(0,vowels.getNumberOfVowels(""));
        assertEquals(1,vowels.getNumberOfVowels("e"));
        assertEquals(3,vowels.getNumberOfVowels("kalapacs"));
    }


}
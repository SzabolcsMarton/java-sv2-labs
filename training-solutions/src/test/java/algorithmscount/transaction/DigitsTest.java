package algorithmscount.transaction;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class DigitsTest {

    @Test
    void getCountOfNumbersTest(){
        Digits digits = new Digits();

        assertEquals(9, digits.getCountOfNumbers());
    }

}
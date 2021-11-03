package junit5assert;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class NumbersTest {

    @Test
    void testGetEvenNumbers(){
        Numbers numbers = new Numbers();
        int[] numbersToTest = {2, 8, 5, 6, 2, 3, 9};
        int[] numbersTestResult = {2, 8, 0, 6, 2, 0, 0};

        assertArrayEquals(numbers.getEvenNumbers(numbersToTest), numbersTestResult);
    }

}
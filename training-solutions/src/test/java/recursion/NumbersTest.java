package recursion;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class NumbersTest {

    @Test
    void getNumbersTest(){
        Numbers numbers = new Numbers();

        assertEquals(15,numbers.getSum(new int[]{1,2,3,4,5}));
        assertEquals(7,numbers.getSum(new int[]{7}));

    }

}
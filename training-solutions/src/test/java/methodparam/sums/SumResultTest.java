package methodparam.sums;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SumResultTest {

    @Test
    void createSumResultTest(){
        SumResult sumResult = new SumResult(25.5,-10.2);

        assertEquals(25.5, sumResult.getSumOfPositives());
        assertEquals(-10.2, sumResult.getSumOfNegatives());
    }

}
package methodparam.sums;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SumResultTest {

    @Test
    void createSumResultTest(){
        SumResult sumResult = new SumResult(25.5,-10.2);

        assertEquals(25.5, sumResult.getSumOfPositives(), 0.000001);
        assertEquals(-10.2, sumResult.getSumOfNegatives(), 0.000001);
    }

}
package methodparam.sums;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SeparatedSumTest {

    @Test
    void sumTest(){
      SeparatedSum separatedSum = new SeparatedSum();
      String floatingNumbers = separatedSum.readFile();
      SumResult sumResult = separatedSum.sum(floatingNumbers);

      assertEquals(110.6, sumResult.getSumOfPositives(), 0.000001);
      assertEquals(-153.3, sumResult.getSumOfNegatives(), 0.000001);
    }

}
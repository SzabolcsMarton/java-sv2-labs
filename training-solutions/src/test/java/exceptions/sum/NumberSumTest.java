package exceptions.sum;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class NumberSumTest {

    NumbersSum numbersSum = new NumbersSum();

    @Test
    void testGetSumWithInts() {
        assertEquals(32, numbersSum.getSum(new int[]{12, 3, -2, 11, 8}));
    }

    @Test
    void testGetSumWithStrings() {
        assertEquals(32, numbersSum.getSum(new String[]{"12", "3", "-2", "11", "8"}));
    }

    @Test
    void testGetSumWithIntsWithNullParameter() {
        int[] numbers = null;
        Exception ex = assertThrows(IllegalArgumentException.class,
                () -> numbersSum.getSum(numbers));
        assertEquals("numbers can not be null", ex.getMessage());
    }

    @Test
    void testGetSumWithStringsWithNullParameter() {
        String[] numbers = null;
        Exception ex = assertThrows(IllegalArgumentException.class,
                () -> numbersSum.getSum(numbers));
        assertEquals("numbers can not be null", ex.getMessage());
    }

    @Test
    void testGetSumWithStringsWithIllegalNumbers() {
        String[] numbers = new String[]{"1", "2", "a", "3"};
        Exception ex = assertThrows(IllegalArgumentException.class,
                () -> numbersSum.getSum(numbers));
        assertEquals("Can not convert string to int", ex.getMessage());
    }
}
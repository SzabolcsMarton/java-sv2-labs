package sorting;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class IncomeTest {

    @Test
    void getHighestIncomeTest() {
        int[] incomes = new int[]{12548, 65847, 4876 ,64646, 61465};

        assertEquals(65847, new Income(incomes).getHighestIncome());
    }
}
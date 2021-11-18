package algorithmssum.sales;

import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class SalesAmountSumCalculatorTest {

    @Test
    void salesAmountSumCalculatorTest(){

        SalesAmountSumCalculator salesAmountSumCalculator = new SalesAmountSumCalculator();

        List<SalesPerson> salesPersons = Arrays.asList(
                new SalesPerson("Sanyibacsi", 500),
                new SalesPerson("Belabacsi", 600),
                new SalesPerson("Jozsibacsi", 800),
                new SalesPerson("Erzsineni", 300)
        );

        assertEquals(2200, salesAmountSumCalculator.SalesAmountSumCalculator(salesPersons));
    }





}
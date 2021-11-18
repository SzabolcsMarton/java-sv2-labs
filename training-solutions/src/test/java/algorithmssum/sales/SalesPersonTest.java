package algorithmssum.sales;

import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class SalesPersonTest {

    @Test
    void createSalesPersonTest(){
        SalesPerson salesPerson =new SalesPerson("Sanyibacsi", 100_000);
        assertEquals("Sanyibacsi", salesPerson.getName());
        assertEquals(100_000, salesPerson.getAmount());
    }

}
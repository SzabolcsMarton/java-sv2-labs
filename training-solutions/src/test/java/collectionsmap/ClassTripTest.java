package collectionsmap;

import org.junit.jupiter.api.Test;

import java.nio.file.Paths;

import static org.junit.jupiter.api.Assertions.*;

class ClassTripTest {

    @Test
    void loadInpaymentsTest(){
        ClassTrip classTrip = new ClassTrip();
        classTrip.loadInpayments(Paths.get("src/test/resources/inpayments.txt"));

        assertEquals(3,classTrip.getInPayments().size());
        assertTrue(classTrip.getInPayments().containsValue(15000));
        assertTrue(classTrip.getInPayments().containsValue(12500));
        assertTrue(classTrip.getInPayments().containsValue(5000));
    }

    @Test
    void loadInpaymentWithWrongPathShouldThrowIllegalArgumentException(){
        ClassTrip classTrip = new ClassTrip();

        Exception exception = assertThrows(IllegalArgumentException.class,
                ()-> classTrip.loadInpayments(Paths.get("src/test/resources/inpay.txt")));
        assertEquals("Can not read file", exception.getMessage());
    }


}
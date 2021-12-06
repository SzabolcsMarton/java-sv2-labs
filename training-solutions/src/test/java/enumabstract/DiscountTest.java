package enumabstract;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class DiscountTest {

    @Test
    void specialOfferTest() {
        Discount discount = Discount.SPECIAL_OFFER;

        assertEquals(800, discount.getAmountToPay(200, 5));
    }

    @Test
    void blackFridayOfferTest() {
        Discount discount = Discount.BLACK_FRIDAY_OFFER;

        assertEquals(400, discount.getAmountToPay(200, 3));
        assertEquals(700, discount.getAmountToPay(200, 5));
        assertEquals(1000, discount.getAmountToPay(200, 7));
    }
}
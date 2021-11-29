package initializer;

import org.junit.jupiter.api.Test;

import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.*;

class CreditCardTest {

    final Rate[] rates = {new Rate(Currency.HUF, 1.0),
            new Rate(Currency.EUR, 350.50),
            new Rate(Currency.SFR, 300.00),
            new Rate(Currency.GBP, 439.43),
            new Rate(Currency.USD, 320.40)
    };

    @Test
    void createCreditcardWithAllParamsTest() {
        CreditCard creditCard = new CreditCard(100,Currency.GBP, Arrays.asList(rates));
        assertEquals(43943,creditCard.getBalance());
    }

    @Test
    void createCreditCardWithSingleParamTest(){
        CreditCard creditCard = new CreditCard(1000);
        assertEquals(1000, creditCard.getBalance());
    }

    @Test
    void paymentWithTwoParamsTest(){
        CreditCard creditCard = new CreditCard(1000);
        assertTrue(creditCard.payment(20,Currency.USD));
        assertEquals(980,creditCard.getBalance());
    }

    @Test
    void paymentWithTwoParamsTestFail(){
        CreditCard creditCard = new CreditCard(1000);
        assertFalse(creditCard.payment(10000));
        assertEquals(1000, creditCard.getBalance());
    }





}
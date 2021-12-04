package interfacedependencyinversion.amount;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PayableTest {



    @Test
    void amountTest(){
        Payable amount = new Amount();
        assertEquals(1000,amount.getPayableAmount(1000));
    }

    @Test
    void cashTest(){
        Payable cash = new Cash();
        assertEquals(125,cash.getPayableAmount(123));
        assertEquals(125,cash.getPayableAmount(127));
        assertEquals(120,cash.getPayableAmount(122));
        assertEquals(130,cash.getPayableAmount(128));
        assertEquals(125,cash.getPayableAmount(125));
    }

    @Test
    void bankAtmTest(){
        Payable bank = new BankAtm();
        assertEquals(2000, bank.getPayableAmount(1250));
    }

}
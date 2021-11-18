package algorithmssum.transaction;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class TransactionTest {

    @Test
    void createTransactionTest(){
        Transaction trans = new Transaction("12321",TransactionOperation.CREDIT, 1000);

        assertEquals(1000, trans.getAmount());
        assertEquals("12321", trans.getAccountNumber());
        assertEquals(TransactionOperation.CREDIT, trans.getTransactionOperation());
        assertTrue(trans.isCredit());
        assertFalse(trans.isDebit());
    }

}
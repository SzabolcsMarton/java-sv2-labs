package algorithmscount.transaction;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class TransactionTest {

    @Test
    void transActionCreateTest(){
        Transaction transaction = new Transaction("123",TransactionType.DEBIT, 1000);

        assertEquals("123", transaction.getAccountNumber());
        assertEquals(TransactionType.DEBIT,transaction.getTransType());
        assertEquals(1000, transaction.getAmount());

    }

}
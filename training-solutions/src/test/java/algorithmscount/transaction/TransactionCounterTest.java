package algorithmscount.transaction;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class TransactionCounterTest {

    @Test
    void countEntryLessThanTest(){
        TransactionCounter transCounter = new TransactionCounter();
        List<Transaction>  transactions = new ArrayList<>();
        transactions.add(new Transaction("123",TransactionType.CREDIT,2000));
        transactions.add(new Transaction("223",TransactionType.DEBIT,3000));
        transactions.add(new Transaction("323",TransactionType.DEBIT,4000));
        transactions.add(new Transaction("423",TransactionType.CREDIT,7000));
        transactions.add(new Transaction("523",TransactionType.CREDIT,3000));
        transactions.add(new Transaction("623",TransactionType.DEBIT,4000));
        transactions.add(new Transaction("723",TransactionType.CREDIT,5000));

        assertEquals(2, transCounter.countEntryLessThan(transactions,4000));
    }

}
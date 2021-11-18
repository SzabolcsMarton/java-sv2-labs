package algorithmssum.transaction;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class TransactionSumCalculatorTest {

    @Test
    void sumAmountOfCreditEntriesTest(){
        TransactionSumCalculator transCalc = new TransactionSumCalculator();
        List<Transaction> transactions = new ArrayList<>();

        transactions.add(new Transaction("12321",TransactionOperation.CREDIT, 1000));
        transactions.add(new Transaction("22321",TransactionOperation.DEBIT, 3000));
        transactions.add(new Transaction("32321",TransactionOperation.CREDIT, 4000));
        transactions.add(new Transaction("42321",TransactionOperation.DEBIT, 2000));

        assertEquals(5000, transCalc.sumAmountOfCreditEntries(transactions));
    }

}
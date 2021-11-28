package staticattrmeth.Bank;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class BankTransactionTest {

    @Test
    void initTest() {
        BankTransaction.initTheDay();

        assertEquals(0, BankTransaction.getAverageOfTransaction());
        assertEquals(0, BankTransaction.getSumOfTransactions());
        assertEquals(0, BankTransaction.getCurrentMaxValue());
        assertEquals(0, BankTransaction.getCurrentMinValue());

    }

    @Test
    void transactionTest() {
        BankTransaction.initTheDay();
        BankTransaction bankTransaction = new BankTransaction(1000);

        assertEquals(1000L, BankTransaction.getCurrentMinValue());
        assertEquals(1000L, BankTransaction.getCurrentMaxValue());
        assertEquals(1000L, BankTransaction.getSumOfTransactions());
        assertEquals(1000L, BankTransaction.getAverageOfTransaction());

        assertEquals(1000L, bankTransaction.getTransactionValue());
    }

    @Test
    void transactionWithMoreThanOneTest() {
        BankTransaction.initTheDay();
        new BankTransaction(1000);
        new BankTransaction(3000);
        new BankTransaction(5000);

        assertEquals(1000, BankTransaction.getCurrentMinValue());
        assertEquals(5000, BankTransaction.getCurrentMaxValue());
        assertEquals(3000, BankTransaction.getAverageOfTransaction());
        assertEquals(9000, BankTransaction.getSumOfTransactions());

    }


}
package exceptionclass.bank;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class AccountTest {
    @Test
    void nullAccountNumberShouldThrowExceptiTest() {
        String accountNumber = null;

        Exception ex = assertThrows(IllegalArgumentException.class, () -> new Account(accountNumber, 0));
        assertEquals("AccountNumber is null!", ex.getMessage());
    }

    @Test
    void createTest() {
        String accountNumber = "11";
        double balance = 1.2;
        double maxSubtract = 100000;
        Account account = new Account(accountNumber, balance);

        assertEquals(accountNumber, account.getAccountNumber());
        assertEquals(balance, account.getBalance());
        assertEquals(maxSubtract, account.getMaxSubtract());
    }

    @Test
    void setMaxSubtractTest() {
        double maxSubtract = -50;
        Account account = new Account("111", 0);

        InvalidAmountBankOperationException ex = assertThrows(InvalidAmountBankOperationException.class,
                () -> account.setMaxSubtract(maxSubtract));
        assertEquals("Invalid Amount", ex.getMessage());
    }

    @Test
    void setMaxSubtractModifyTest() {
        double maxSubtract = 120000;
        Account account = new Account("111", 0);
        account.setMaxSubtract(maxSubtract);

        assertEquals(maxSubtract, account.getMaxSubtract());
    }

    @Test
    void subtractInvalidAmountTest() {
        double amount = -50;
        Account account = new Account("111", 100);

        InvalidAmountBankOperationException ex = assertThrows(InvalidAmountBankOperationException.class,
                () -> account.subtract(amount));
        assertEquals("Invalid Amount", ex.getMessage());
    }

    @Test
    void subtractLowBalanceTest() {
        double amount = 100;
        Account account = new Account("111", 30);

        LowBalanceBankOperationException ex = assertThrows(LowBalanceBankOperationException.class,
                () -> account.subtract(amount));
        assertEquals("Low balance!", ex.getMessage());
    }

    @Test
    void subtractWithCorrectAmountTest() {
        double amount = 50;
        Account account = new Account("111", 500);
        account.subtract(amount);

        assertEquals(450,account.getBalance() );
    }

    @Test
    void depositWithWrongAmountTest() {
        double amount = -100;
        Account account = new Account("11", 100);

        InvalidAmountBankOperationException ex = assertThrows(InvalidAmountBankOperationException.class,
                () -> account.deposit(amount));
        assertEquals("Invalid Amount", ex.getMessage());
    }

    @Test
    void testDepositShouldCorrectReturn() {
        double amount = 100;
        Account account = new Account("111", 500);
        account.deposit(amount);

        assertEquals(600,account.getBalance() );
    }

}
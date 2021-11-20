package algorithmsdecision.bankaccounts;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class BankAccountTest {

    BankAccount account = new BankAccount("Sanyibacsi","123", 1000);

    @Test
    void withdrawTest(){
        account.withdraw(200);
        assertEquals(800, account.getBalance());
    }

    @Test
    void depositTest(){
        account.deposit(200);
        assertEquals(1200, account.getBalance());
    }

}
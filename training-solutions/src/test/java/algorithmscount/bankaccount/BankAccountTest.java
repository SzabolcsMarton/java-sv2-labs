package algorithmscount.bankaccount;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class BankAccountTest {

    @Test
    void bankAccountTest(){
        BankAccount bankAccount = new BankAccount("Sanyibacsi","12321", 1000);
        assertEquals("Sanyibacsi", bankAccount.getName());
        assertEquals("12321", bankAccount.getAccountNumber());
        assertEquals(1000, bankAccount.getBalance());
    }

}
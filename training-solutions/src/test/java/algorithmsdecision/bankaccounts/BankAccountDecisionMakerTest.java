package algorithmsdecision.bankaccounts;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class BankAccountDecisionMakerTest {

    BankAccountDecisionMaker decisionMaker = new BankAccountDecisionMaker();

    @Test
    void containsBalanceGreaterThanTest(){
        List<BankAccount> accounts = new ArrayList<>();
        accounts.add(new BankAccount("a","123",1000));
        accounts.add(new BankAccount("b","223",2000));
        accounts.add(new BankAccount("c","323",3000));
        accounts.add(new BankAccount("d","423",4000));

        assertTrue(decisionMaker.containsBalanceGreaterThan(accounts,2500));
        assertFalse(decisionMaker.containsBalanceGreaterThan(accounts,5000));
    }

}
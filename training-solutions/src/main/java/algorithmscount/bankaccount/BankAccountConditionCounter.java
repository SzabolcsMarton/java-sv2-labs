package algorithmscount.bankaccount;

import java.util.List;

public class BankAccountConditionCounter {

    public int countWithBalanceGreaterThan(List<BankAccount> accounts, int minAmount){
        int counter = 0;
        for (BankAccount actual : accounts){
            if(actual.getBalance() > minAmount){
                counter++;
            }
        }
        return counter;
    }

}

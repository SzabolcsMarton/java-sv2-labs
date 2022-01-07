package exceptionclass.bank;

import java.util.List;

public class Bank {

    private List<Account> accounts;

    public Bank(List<Account> accounts) {
        if(accounts == null){
            throw new IllegalArgumentException("Accounts list can not be null");
        }
        this.accounts = accounts;
    }

    public void withdraw(String accountNumber, double amount){
        Account account = findAccountByAccountNumber(accountNumber);
        account.subtract(amount);
    }

    public void deposit(String accountNumber, double amount){
        Account account = findAccountByAccountNumber(accountNumber);
        account.deposit(amount);

    }

    private Account findAccountByAccountNumber(String accountNumber){
        Account account = null;
        for(Account actual : accounts){
            if(actual.getAccountNumber().equals(accountNumber)){
                account = actual;
            }
        }
        checkAccount(account);
        return account;
    }

    private void checkAccount(Account account){
        if(account == null){
            throw new InvalidAccountNumberBankOperationException("Invalid accont number!");
        }
    }
}
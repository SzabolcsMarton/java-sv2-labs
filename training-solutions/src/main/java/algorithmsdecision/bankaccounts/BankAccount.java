package algorithmsdecision.bankaccounts;

public class BankAccount {

    private final String name;
    private String accountNumber;
    private int balance;

    public BankAccount(String name, String accountNumber, int balance) {
        this.name = name;
        this.accountNumber = accountNumber;
        this.balance = balance;
    }

    public void withdraw( int amount){
        balance -= amount;
    }

    public void deposit(int amount){
        balance += amount;
    }

    public String getName() {
        return name;
    }

    public String getAccountNumber() {
        return accountNumber;
    }

    public int getBalance() {
        return balance;
    }
}

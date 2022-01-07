package exceptionclass.bank;

public class Account {

    private final String accountNumber;
    private double balance;
    private double maxSubtract;

    private static final double BASIC_MAXSUBSTRACT = 100_000;

    public Account(String accountNumber, double balance) {
        if(accountNumber == null){
            throw new IllegalArgumentException("AccountNumber is null!");
        }
        this.accountNumber = accountNumber;
        this.balance = balance;
        this.maxSubtract = BASIC_MAXSUBSTRACT;
    }

    public void subtract(double amount){
        if(amount <= 0 || amount > maxSubtract){
            throw new InvalidAmountBankOperationException("Invalid Amount");
        }
        if(amount > balance){
            throw new LowBalanceBankOperationException("Low balance!");
        }
        balance -= amount;

    }

    public void deposit(double amount) {
        if(amount <= 0){
            throw new InvalidAmountBankOperationException("Invalid Amount");
        }
        balance += amount;
    }

    public void setMaxSubtract(double maxSubtract) {
        if(maxSubtract <= 0){
            throw new InvalidAmountBankOperationException("Invalid Amount");
        }
        this.maxSubtract = maxSubtract;
    }

    public String getAccountNumber() {
        return accountNumber;
    }

    public double getBalance() {
        return balance;
    }

    public double getMaxSubtract() {
        return maxSubtract;
    }

}

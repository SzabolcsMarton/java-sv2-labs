package algorithmscount.transaction;

public class Transaction {
    private String accountNumber;
    private TransactionType transType;
    private int amount;

    public Transaction(String accountNumber, TransactionType transType, int amount) {
        this.accountNumber = accountNumber;
        this.transType = transType;
        this.amount = amount;
    }

    public String getAccountNumber() {
        return accountNumber;
    }

    public TransactionType getTransType() {
        return transType;
    }

    public int getAmount() {
        return amount;
    }
}

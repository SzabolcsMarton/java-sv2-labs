package staticattrmeth.Bank;

public class BankTransaction {
    private static final long MIN_TRANSACTION_VALUE = 1;
    private static final long MAX_TRANSACTION_VALUE = 10_000_000;
    private static long countOfTransactions = 0;
    private static long sumOfTransactions = 0;
    private static long currentMinValue = MAX_TRANSACTION_VALUE;
    private static long currentMaxValue = MIN_TRANSACTION_VALUE;

    public long transactionValue;

    public BankTransaction(long transactionValue) {
        if (transactionValue < BankTransaction.MIN_TRANSACTION_VALUE || transactionValue > BankTransaction.MAX_TRANSACTION_VALUE) {
            throw new IllegalArgumentException("Transactionvalue must be between 1 and 10 000 000!");
        }
        countOfTransactions++;
        sumOfTransactions += transactionValue;
        if(transactionValue < currentMinValue){
            currentMinValue = transactionValue;
        }
        if(transactionValue > currentMaxValue){
            currentMaxValue = transactionValue;
        }
        this.transactionValue = transactionValue;
    }

    public long getTransactionValue() {
        return transactionValue;
    }

    public static void initTheDay() {
        countOfTransactions = 0;
        sumOfTransactions = 0;
        currentMinValue = MAX_TRANSACTION_VALUE;
        currentMaxValue = MIN_TRANSACTION_VALUE;
    }

    public static long getAverageOfTransaction() {
        return countOfTransactions == 0 ? 0 : sumOfTransactions / countOfTransactions;
    }

    public static long getCurrentMinValue() {
        return countOfTransactions == 0 ? 0 : currentMinValue;
    }

    public static long getCurrentMaxValue() {
        return countOfTransactions == 0 ? 0 : currentMaxValue;
    }

    public static long getSumOfTransactions() {
        return sumOfTransactions;
    }

}

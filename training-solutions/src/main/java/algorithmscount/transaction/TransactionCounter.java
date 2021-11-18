package algorithmscount.transaction;

import java.util.List;

public class TransactionCounter {

    public int countEntryLessThan(List<Transaction> transactions, int amountLimit) {
        int counter = 0;
        for (Transaction actual : transactions){
            if(actual.getTransType() == TransactionType.CREDIT &&
                    actual.getAmount() > amountLimit){
                counter++;
            }
        }
        return counter;
    }
}

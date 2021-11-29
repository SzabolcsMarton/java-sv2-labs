package initializer;

import java.util.ArrayList;
import java.util.List;

public class CreditCard {

    private static final List<Rate> RATES = new ArrayList<>();

    private long balance;

    public CreditCard(long balance, Currency currency, List<Rate> currentRate) {
        RATES.addAll(currentRate);
        this.balance = Math.round(balance * getRateToConvert(currency));

    }

    public CreditCard(long balance) {
        this.balance = balance;
    }

    public long getBalance() {
        return balance;
    }

    public boolean payment(long amount, Currency currency) {
        long value = Math.round(amount * getRateToConvert(currency));
        if (value <= balance) {
            balance -= value;
            return true;
        }
        return false;
    }

    public boolean payment(long amount) {
        return payment(amount, Currency.HUF);
    }

    private double getRateToConvert(Currency currency) {
        for (Rate actual : RATES) {
            if (actual.getCurrency() == currency) {
                return actual.getConversionFactor();
            }
        }
        return 1.0;
    }
}

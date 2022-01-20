package lambdacomparator.account;

import java.text.Collator;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Locale;

public class BankAccounts {

    private List<BankAccount> accounts;

    public BankAccounts(List<BankAccount> accounts) {
        this.accounts = accounts;
    }

    public List<BankAccount>listBankAccountsByAccountNumber() {
        List<BankAccount> result = new ArrayList<>(accounts);
        result.sort(Comparator.comparing(BankAccount::getAccountNumber));

        return result;
    }

    public List<BankAccount> listBankAccountsByBalance() {
        List<BankAccount> result = new ArrayList<>(accounts);
        result.sort(Comparator.comparing(bankAccount -> Math.abs(bankAccount.getBalance())));

        return result;
    }

    public List<BankAccount> listBankAccountsByBalanceDesc() {
        List<BankAccount> result = new ArrayList<>(accounts);
        result.sort(Comparator.comparing(BankAccount::getBalance, Comparator.reverseOrder()));
        return result;
    }

    public List<BankAccount> listBankAccountsByNameThenAccountNumber() {
        List<BankAccount> result = new ArrayList<>(accounts);
        Collator collator = Collator.getInstance(new Locale("hu", "HU"));
        result.sort(Comparator.comparing(BankAccount::getNameOfOwner, Comparator.nullsFirst(collator))
                .thenComparing(BankAccount::getAccountNumber));
        return result;
    }

    public List<BankAccount> getAccounts() {
        return accounts;
    }
}

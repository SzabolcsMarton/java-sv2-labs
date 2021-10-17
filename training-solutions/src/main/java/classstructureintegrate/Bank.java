package classstructureintegrate;

import java.util.Scanner;

public class Bank {

    public static void main(String[] args) {
        Scanner bankScanner = new Scanner(System.in);

        System.out.println("Account Number: ");
        String accountNumber = bankScanner.nextLine();

        System.out.println("Name:");
        String name = bankScanner.nextLine();

        System.out.println("Open balance: ");
        int balance = bankScanner.nextInt();

        BankAccount bankAccount = new BankAccount(accountNumber,name,balance);

        System.out.println(bankAccount.getInfo());

        System.out.println("Amount to deposit:");
        int amountToDeposit = bankScanner.nextInt();
        bankAccount.deposit(amountToDeposit);
        System.out.println(bankAccount.getInfo());

        System.out.println("Amount to withdraw:");
        int amountToWithdraw = bankScanner.nextInt();
        bankAccount.withdraw(amountToWithdraw);
        System.out.println(bankAccount.getInfo());




    }
}

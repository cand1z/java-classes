package application;

import utilities.BankAccount;

import java.util.Locale;
import java.util.Scanner;

public class Program {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner scan = new Scanner(System.in);
        BankAccount account;
        double amount;

        System.out.print("Enter account number: ");
        int accountNumber = scan.nextInt();

        System.out.print("Enter account holder: ");
        String accountHolder = scan.next();

        System.out.print("Is there an initial deposit (y/n): ");
        char initialDeposit = scan.next().charAt(0);
        do {
            if (initialDeposit == 'y') {
                System.out.print("Enter initial deposit value: ");
                amount = scan.nextDouble();
                account = new BankAccount(accountNumber, accountHolder, amount);
            } else if (initialDeposit == 'n'){
                account = new BankAccount(accountNumber, accountHolder);
            } else {
                System.out.print("Insert a valid value (y/n)");
                initialDeposit = scan.next().charAt(0);
            }
        } while (initialDeposit != 'y' && initialDeposit != 'n');

        if (initialDeposit == 'y') {
            System.out.print("Enter initial deposit value: ");
            amount = scan.nextDouble();
            account = new BankAccount(accountNumber, accountHolder, amount);
        } else {
            account = new BankAccount(accountNumber, accountHolder);
        }

        System.out.println();
        System.out.println("Account data: ");
        System.out.println(account);

        System.out.println();
        System.out.print("Enter a deposit value: ");
        amount = scan.nextDouble();
        account.bandDeposit(amount);
        System.out.println("Updated account data:");
        System.out.println(account);

        System.out.println();
        System.out.print("Enter a withdraw value: ");
        amount = scan.nextDouble();
        account.bankDraft(amount);
        System.out.println("Updated account data:");
        System.out.println(account);
    }
}

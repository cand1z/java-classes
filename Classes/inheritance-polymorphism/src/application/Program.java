package application;

import entities.Account;
import entities.BusinessAccount;
import entities.SavingsAccount;

public class Program {
    public static void main(String[] args) {

        BusinessAccount account = new BusinessAccount();

        Account acc = new Account(1001, "Davi", 0.0);
        BusinessAccount bacc = new BusinessAccount(1002, "Alex", 2.0, 500.0);

        // UPCAST
        Account acc1 = bacc;

        Account acc2 = new BusinessAccount(1003, "Maria", 0.0, 200.0);
        Account acc3 = new SavingsAccount(1004, "Ana", 0.0, 13.50);

        // DOWNCAST
        BusinessAccount acc4 = (BusinessAccount) acc2;
        acc4.loan(400);

        if (acc2 instanceof BusinessAccount) {
            BusinessAccount acc5 = (BusinessAccount) acc2;
            acc5.loan(500);
            System.out.println("Loan!");
        }
        if (acc3 instanceof SavingsAccount) {
            SavingsAccount acc5 = (SavingsAccount) acc3;
            acc5.updateBalance();
            System.out.println("Update!");
        }

        // OVERRIDE
        Account account1 = new Account(0001, "Claudio", 1000.0);
        account1.withdraw(200);
        System.out.println(account1.getBalance());

        Account account2 = new SavingsAccount(0002, "Claudinho", 1000.0, 0.01);
        account2.withdraw(200);
        System.out.println(account2.getBalance());

        Account account3 = new BusinessAccount(0003, "Bob", 1000.0, 500.0);
        account3.withdraw(200);
        System.out.println(account3.getBalance());
    }
}

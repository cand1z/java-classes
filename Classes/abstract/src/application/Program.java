package application;

import entities.Account;
import entities.BusinessAccount;
import entities.SavingsAccount;

import java.util.ArrayList;
import java.util.List;

public class Program {
    public static void main(String[] args) {

        List<Account> list = new ArrayList<>();

        list.add(new SavingsAccount(1001, "Alex", 500.0, 0.01));
        list.add(new BusinessAccount(1002, "Maria", 2000.0, 1000.0));
        list.add(new SavingsAccount(1003, "Davi", 3000.0, 0.01));
        list.add(new BusinessAccount(1004, "Ana", 10.10, 1000.0));
        
        double sum = 0;
        for (Account acc :
                list) {
            sum += acc.getBalance();
        }

        System.out.println("SUM: R$" + String.format("%.2f",sum));

        for (Account acc :
                list) {
            acc.deposit(10);
            System.out.printf("Updated balance for account %d: R$%.2f\n", acc.getNumber(), acc.getBalance());
        }
    }
}

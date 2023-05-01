package application;

import entities.Employee;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

import static utility.VerifyId.hasId;
import static utility.VerifyId.existId;

public class Program {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner scanner = new Scanner(System.in);

        List<Employee> list = new ArrayList<>();

        System.out.print("How many employees will bew registered? ");
        int n = scanner.nextInt();

        for (int i = 0; i < n; i++) {
            System.out.printf("%d# Employee:\n", i + 1);

            System.out.print("ID: ");
            int id = scanner.nextInt();
            while (hasId(list, id)){
                System.out.println("This ID is already taken. Please, enter another ID:");
                id = scanner.nextInt();
            }

            System.out.print("Name: ");
            scanner.nextLine();
            String name = scanner.nextLine();
            System.out.print("Salary: ");
            double salary = scanner.nextDouble();

            list.add(new Employee(id, name, salary));

            System.out.println();
        }

        System.out.println();
        System.out.print("Enter the employee ID that will hava salary increase: ");
        int id = scanner.nextInt();
        Employee emp = list.stream().filter(x -> x.getId() == id).findFirst().orElse(null);
        if (emp == null) {
            System.out.println("This doest not exist!");
        } else {
            System.out.print("Enter the percentage: ");
            double percentage = scanner.nextDouble();
            emp.increaseSalary(percentage);
        }

        System.out.println();
        for (Employee item : list) {
            System.out.println(item);
        }

        scanner.close();
    }

}

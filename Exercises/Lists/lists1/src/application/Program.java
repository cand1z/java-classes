package application;

import entities.Employee;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

import static utility.HasID.hasId;

public class Program {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner scanner = new Scanner(System.in);

        List<Employee> list = new ArrayList<>() {
        };

        // READING DATA

        System.out.print("How many employees will be registered? ");
        int n = scanner.nextInt();

        for (int i = 0; i < n; i++) {
            System.out.println();
            System.out.print("Employee #" + i + ": ");

            System.out.println();
            System.out.print("ID: ");
            int id = scanner.nextInt();
            while (hasId(list, id)){
                System.out.print("Id already taken. Try again: ");
                id = scanner.nextInt();
            }


            System.out.print("Name: ");
            scanner.nextLine();
            String name = scanner.nextLine();
            System.out.print("Salary: ");
            double salary = scanner.nextDouble();

            list.add(new Employee(id, name, salary));
        }

        System.out.println("List: ");
        for (Employee i : list) {
            System.out.println(i);
        }

        scanner.close();
    }
}

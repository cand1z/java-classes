package application;

import entities.Employee;

import java.util.Scanner;

public class Program {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        Employee employee = new Employee();

        System.out.print("Name: ");
        employee.name = scan.nextLine();
        System.out.print("Gross salary: ");
        employee.grossSalary = scan.nextDouble();
        System.out.print("Tax: ");
        employee.tax = scan.nextDouble();

        System.out.println();
        System.out.println("Employee: " + employee);

        System.out.println();
        System.out.print("Which percentage to increase salary? ");
        int percentage = scan.nextInt();
        employee.increaseSalary(percentage);

        System.out.println();
        System.out.println("Updated data: " + employee);
    }
}

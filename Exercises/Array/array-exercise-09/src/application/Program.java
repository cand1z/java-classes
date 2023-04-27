package application;

import utilities.Student;

import java.util.Scanner;

public class Program {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Numbers of students: ");
        int n = scanner.nextInt();
        Student [] v = new Student[n];

        for (int i = 0; i < v.length; i++) {
            scanner.nextLine();
            System.out.printf("Enter the name, first and second grades of the %dst student: \n", i + 1);
            String name = scanner.nextLine();
            double n1 = scanner.nextDouble();
            double n2 = scanner.nextDouble();
            v[i] = new Student(name, n1, n2);

        }

        System.out.println("Aproved students");
        for (int i = 0; i < v.length; i++) {
            if (v[i].averageStudent() >= 6){
                System.out.println(v[i].getName());
            }
        }

        scanner.close();
    }
}

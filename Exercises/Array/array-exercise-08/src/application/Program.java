package application;

import utilities.Person;

import java.util.Scanner;

public class Program {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("How many people? ");
        int n = scanner.nextInt();
        Person[] vector = new Person[n];
        int older = 0;
        String nameOlder = "";

        for (int i = 0; i < vector.length; i++) {
            scanner.nextLine();
            System.out.printf("%dst person data: %n", i + 1);
            System.out.print("Name: ");
            String name = scanner.nextLine();
            System.out.print("Age: ");
            int age = scanner.nextInt();

            vector[i] = new Person(name, age);
        }
        for (int i = 0; i < vector.length; i++) {
            if (vector[i].getAge() > older) {
                nameOlder = vector[i].getName();
            }
        }
        System.out.println("OLDER PERSON: " + nameOlder);
        scanner.close();
    }
}

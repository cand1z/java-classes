package application;

import entities.Person;

import java.util.Locale;
import java.util.Scanner;

public class Program {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner scanner = new Scanner(System.in);

        System.out.print("How many people will be described? ");
        int n = scanner.nextInt();
        double minorsP,avgHeight, sumHeight = 0;
        int under = 0;

        Person [] vector = new Person[n];
        for (int i = 0; i < vector.length; i++) {
            scanner.nextLine();
            System.out.printf("%dst person data: %n", i +1);

            System.out.print("Name: ");
            String name = scanner.nextLine();

            System.out.print("Age: ");
            int age = scanner.nextInt();

            System.out.print("Height: ");
            double height = scanner.nextDouble();

            System.out.println();

            vector[i] = new Person(name, age, height);
            sumHeight += vector[i].getHeight();
            if (vector[i].getAge() < 16){
                under++;
            }
        }

        avgHeight = sumHeight / vector.length;
        minorsP = ((double)under / vector.length) * 100;

        System.out.printf("Average height: %.2f\n", avgHeight);
        System.out.printf("People under 16 years old: %.2f%%\n", minorsP);

        for (int i = 0; i < vector.length; i++) {
            if (vector[i].getAge() < 16){
                System.out.printf("%s%n", vector[i].getName());
            }
        }

    }
}

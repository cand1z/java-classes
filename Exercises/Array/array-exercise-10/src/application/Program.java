package application;

import entities.Person;

import java.sql.SQLOutput;
import java.util.Locale;
import java.util.Scanner;

public class Program {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner scanner = new Scanner(System.in);

        System.out.print("How many people will be analysed? ");
        int n = scanner.nextInt();
        Person[] v = new Person[n];
        double avgHeightFemale = 0;
        int nMen = 0;

        for (int i = 0; i < v.length; i++) {
            System.out.printf("%dst person height: ", i + 1);
            double height = scanner.nextDouble();
            System.out.printf("%dst person gender: ", i + 1);
            char gender = Character.toUpperCase(scanner.next().charAt(0));
            v[i] = new Person(height, gender);

            avgHeightFemale += v[i].getHeight() / v.length;
            if (v[i].getGender() == 'M') {
                nMen++;
            }
        }
        double lowerHeight = v[0].getHeight();
        double greaterHeight = v[0].getHeight();

        for (int i = 0; i < v.length; i++) {
            if (v[i].getHeight() > greaterHeight) {
                greaterHeight = v[i].getHeight();
            }
            if (v[i].getHeight() < lowerHeight) {
                lowerHeight = v[i].getHeight();
            }
        }
        System.out.printf("Lower height: %.2f \n", lowerHeight);
        System.out.printf("Greater height: %.2f \n", greaterHeight);
        System.out.printf("Women average height: %.2f \n", avgHeightFemale);
        System.out.printf("Number of men: %d", nMen);

        scanner.close();
    }
}

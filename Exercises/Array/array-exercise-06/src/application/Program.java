package application;

import java.util.Locale;
import java.util.Scanner;

public class Program {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner scanner = new Scanner(System.in);

        System.out.print("N Value: ");
        int n = scanner.nextInt();

        double [] vector = new double[n];
        double avg = 0;


        for (int i = 0; i < vector.length; i++) {
            System.out.print("Number: ");
            vector[i] = scanner.nextDouble();
            avg += vector[i] / vector.length;
        }

        System.out.printf("Average: %.2f%n", avg);
        System.out.println("Below average elements: ");
        for (int i = 0; i < vector.length; i++) {
            if (vector[i] < avg) {
                System.out.println(vector[i]);
            }
        }
        scanner.close();
    }
}

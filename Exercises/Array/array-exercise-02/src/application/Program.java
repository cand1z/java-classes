package application;

import java.util.Locale;
import java.util.Scanner;

public class Program {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner scanner = new Scanner(System.in);

        System.out.print("How many numbers you will put? ");
        int n = scanner.nextInt();
        double [] vect = new double[n];
        double sum = 0;

        for (int i = 0; i < vect.length; i++) {
            scanner.nextLine();
            System.out.print("Digit a number: ");
            vect[i] = scanner.nextDouble();
            sum += vect[i];
        }

        System.out.print("VALUES = ");
        for (int i = 0; i < vect.length; i++) {
            System.out.print(vect[i] + " ");
        }

        System.out.println();
        System.out.println();

        double avg = sum / vect.length;
        System.out.println("SUM = " + sum);
        System.out.println("AVERAGE = "+ avg);

        scanner.close();
    }
}

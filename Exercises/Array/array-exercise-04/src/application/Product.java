package application;

import java.util.Locale;
import java.util.Scanner;

public class Product {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner scanner = new Scanner(System.in);

        System.out.print("How many number you will put? ");
        int n = scanner.nextInt();
        double [] vector = new double[n];
        int posMaior = 0;
        double maior = vector[0];

        for (int i = 0; i < vector.length; i++) {
            System.out.print("Digit a number: ");
            vector[i] = scanner.nextDouble();

            if (vector[i] > maior){
                maior = vector[i];
                posMaior = i + 1;
            }
        }

        System.out.println();
        System.out.printf("Bigger value = %.2f%n", maior);
        System.out.printf("Bigger value position = %d", posMaior);


        scanner.close();
    }
}

package application;

import java.util.Locale;
import java.util.Scanner;

public class Program {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner scanner = new Scanner(System.in);

        System.out.println("N Value: ");
        int n = scanner.nextInt();

        int [] a = new int[n];
        int [] b = new int[n];
        int [] c = new int[n];
        System.out.println("Digit A vector values: ");
        for (int i = 0; i < a.length; i++) {
            a[i] = scanner.nextInt();
        }
        System.out.println("Digit B vector values: ");
        for (int i = 0; i < b.length; i++) {
            b[i] = scanner.nextInt();
        }

        for (int i = 0; i < c.length; i++) {
            c[i] = a[i] + b[i];
            System.out.println(c[i]);
        }


        scanner.close();
    }
}

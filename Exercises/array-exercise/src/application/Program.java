package application;

import java.util.Locale;
import java.util.Scanner;

public class Program {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner scanner = new Scanner(System.in);

        System.out.print("Numbers to verify: ");
        int n = scanner.nextInt();
        int[] x = new int[n];

        for (int i = 0; i < n; i++) {
            scanner.nextLine();
            System.out.print("Number: ");
            x[i] = scanner.nextInt();
        }

        System.out.println("Negative numbers: ");
        for (int i = 0; i < n; i++) {
            if (x[i] < 0){
                System.out.println(x[i]);
            }
        }

        scanner.close();
    }
}

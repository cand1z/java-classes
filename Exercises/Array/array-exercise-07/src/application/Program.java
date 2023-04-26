package application;

import java.util.Scanner;

public class Program {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("N Value:");
        int n = scanner.nextInt();

        int[] v = new int[n];

        for (int i = 0; i < v.length; i++) {
            System.out.print("Digit a number: ");
            v[i] = scanner.nextInt();
        }
        int sum = 0;
        for (int i = 0; i < v.length; i++) {
            if (v[1] % 2 == 0) {
                sum += v[i];
            }
        }
        if (sum == 0) {
            System.out.println("No even numbers");
        } else {
            System.out.println(sum/ v.length);
        }
        scanner.close();
    }
}

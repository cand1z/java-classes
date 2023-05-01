package application;

import java.util.Locale;
import java.util.Scanner;

public class Program {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner scanner = new Scanner(System.in);

        int count = 0;
        int n = scanner.nextInt();
        int[][] matrix = new int[n][n];

        // reading data
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                matrix[i][j] = scanner.nextInt();
            }
        }

        // print data
        System.out.println("Diagonal: ");
        for (int i = 0; i < matrix.length; i++) {
            System.out.print(matrix[i][i] + " ");
            // get negative numbers
            for (int j = 0; j < matrix[i].length; j++) {
                if (matrix[i][j] < 0) {
                    count++;
                }
            }
        }

        System.out.println();
        System.out.print("Negative numbers: " + count);

        scanner.close();
    }
}

package application;

import entities.Product;

import java.util.Locale;
import java.util.Scanner;

public class Program {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner scan = new Scanner(System.in);

        System.out.print("Number of N: ");
        int n = scan.nextInt();
        double sum = 0;
        Product[] v = new Product[n];

        for (int i = 0; i < v.length; i++) {
            scan.nextLine();
            System.out.printf("%d - Product name: ", i + 1);
            String name = scan.nextLine();
            System.out.printf("%s price: ", name);
            double price = scan.nextDouble();
            v[i] = new Product(name, price);
            sum += v[i].getPrice();
        }
        double avg = sum / v.length;
        System.out.printf("AVERAGE PRICE = %.2f%n", avg);
    }
}

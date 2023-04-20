package application;

import entities.Rectangle;

import java.util.Scanner;

public class Program {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        Rectangle rect = new Rectangle();

        System.out.println("Enter the rectangle width and height");
        rect.height = scan.nextDouble();
        rect.width = scan.nextDouble();

        System.out.printf("AREA = %.2f%n", rect.area());
        System.out.printf("PERIMETER = %.2f%n", rect.perimeter());
        System.out.printf("DIAGONAL = %.2f%n", rect.diagonal());
    }
}

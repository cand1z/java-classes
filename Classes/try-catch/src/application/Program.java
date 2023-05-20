package application;

import java.sql.SQLOutput;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Program {
    public static void main(String[] args) {
        method1();

        System.out.println("End of program");
    }

    public static void method1() {
        System.out.println("*** STARTING METHOD 1 ***");
        method2();
        System.out.println("*** END OF METHOD 1 ***");
    }

    public static void method2(){
        Scanner scanner = new Scanner(System.in);

        System.out.println("*** STARTING METHOD 2 ***");

        try {
            System.out.print("Enter names: ");
            String[] vect = scanner.nextLine().split(" ");
            System.out.print("Enter array position: ");
            int position = scanner.nextInt();
            System.out.println(vect[position]);
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Invalid position!");
            e.printStackTrace();
            scanner.next();
        } catch (InputMismatchException e) {
            System.out.println("Input error!");
        }
        scanner.close();

        System.out.println("*** END OF METHOD 2 ***");
    }
}

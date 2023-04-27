package application;

import java.util.Locale;
import java.util.Scanner;
import entities.Room;

public class Program {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner scanner = new Scanner(System.in);

        System.out.print("How many rooms will be rented? ");
        int n = scanner.nextInt();
        Room[] v = new Room[10];

        for (int i = 0; i < n; i++) {
            scanner.nextLine();

            System.out.printf("Rent #%d:\n", i + 1);
            System.out.print("Name: ");
            String name = scanner.nextLine();
            System.out.print("Email: ");
            String email = scanner.nextLine();
            System.out.print("Room: ");
            int room = scanner.nextInt();

            v[i] = new Room(name, email, room);

            System.out.println();
        }
        System.out.println("Busy rooms: ");
        for (int i = 0; i < v.length; i++) {
            if (v[i] != null) {
                System.out.println(i+1 +": " + v[i]);
            }
        }
        scanner.close();
    }
}

import java.util.Scanner;

public class Bitwise {
    public static void main(String[] args) {
        // Aula referente a bitwise
        Scanner sc = new Scanner(System.in);

        System.out.println("Insira o valor de N: ");
        int n = sc.nextInt();

        int mask = 0b100000;

        if ((n & mask) != 0) {
            System.out.println("6th byte is 0");
        } else {
            System.out.println("6th byte is not 0");
        }
    }
}
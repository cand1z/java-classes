import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        /*
        Fazer um programa para ler uma temperatura em Celsius e mostrar o equivalente em
Fahrenheit. Perguntar se o usuário deseja repetir (s/n). Caso o usuário digite "s", repetir o
programa.
        Fórmula F = 9*C/5 + 32
         */
        Scanner sc = new Scanner(System.in);

        char continua = 'n';
        do {
            System.out.println("Insira a temperatura em Celsius: ");
            double tempC = sc.nextDouble();

            double tempF = ((9 * tempC) / 5) + 32;
            System.out.printf("Equivalente em Fahrenheit: %.1f%n", tempF);

            System.out.println("Deseja repetir? (s/n)");
            continua = sc.next().charAt(0);

        } while (continua == 's');
    }
}
import java.util.Locale;
import java.util.Scanner;

public class exercicio_04 {
    public static void main(String[] args) {
        /*
        Fazer um programa para ler um número N. Depois leia N pares de números e mostre a divisão do primeiro pelo segundo. Se o denominador for igual a zero, mostrar a mensagem "divisao impossivel".
         */
        System.out.println("Inicio do exercicio 04");
        Scanner sc = new Scanner(System.in);
        Locale.setDefault(Locale.US);

        System.out.println("Insira o valor de N: ");
        int N = sc.nextInt();

        for (int i = 0; i < N; i++) {
            System.out.println("Insira o primeiro valor: ");
            double a = sc.nextInt();
            System.out.println("Insira o segundo valor: ");
            double b = sc.nextInt();

            if (b == 0){
                System.out.println("Impossível efetuar a divisão");
            } else {
                double divisao = a / b;
                System.out.printf("Resultado de divisão de %.1f por %.1f é igual a %.1f%n", a, b, divisao);
            }
        }
    }
}

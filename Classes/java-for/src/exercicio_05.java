import java.util.Scanner;

public class exercicio_05 {
    public static void main(String[] args) {
        /*
        Ler um valor N. Calcular e escrever seu respectivo fatorial. Fatorial de N = N * (N-1) * (N-2) * (N-3) * ... * 1.
Lembrando que, por definição, fatorial de 0 é 1.
         */
        System.out.println("Inicio do exercicio 05");
        Scanner sc = new Scanner(System.in);

        System.out.println("Insira o valor de N: ");
        int N = sc.nextInt();

        int fatorial = 1;
        for (int i = 1; i <= N; i++) {
            fatorial *= i;
        }
        System.out.println(fatorial);

        sc.close();
    }
}

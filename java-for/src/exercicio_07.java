import java.util.Scanner;

public class exercicio_07 {
    public static void main(String[] args) {
        /*
        Fazer um programa para ler um número inteiro positivo N. O programa deve então mostrar na tela N linhas,
começando de 1 até N. Para cada linha, mostrar o número da linha, depois o quadrado e o cubo do valor, conforme
exemplo.
         */
        System.out.println("Inicio do exercicio 07");
        Scanner sc = new Scanner(System.in);

        System.out.println("Insira o valor de N: ");
        int N = sc.nextInt();

        for (int i = 1; i <= N; i++) {
            int quadrado = (int) Math.pow(i,2);
            int cubo = (int) Math.pow(i,3);
            System.out.print("Número da linha: " + i + " - ");
            System.out.print("Número da linha ao quadrado: " + quadrado + " - ");
            System.out.println("Número da linha ao cubo: " + cubo);

        }
    }
}

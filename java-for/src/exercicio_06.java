import java.util.Scanner;

public class exercicio_06 {
    public static void main(String[] args) {
        // Ler um número inteiro N e calcular todos os seus divisores.
        System.out.println("Inicio do exercicio 06");
        Scanner sc = new Scanner(System.in);

        System.out.println("Insira o valor de N: ");
        int N = sc.nextInt();

        for (int i = 1; i <= N ; i++) {
           if ((N % i) == 0){
               System.out.println(i);
           }
        }
    }
}

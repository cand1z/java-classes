import java.util.Locale;
import java.util.Scanner;

public class exercicio_02 {
    public static void main(String[] args) {
        System.out.println("Inicio do exercicio");
        Scanner sc = new Scanner(System.in);

        /*
        Escreva um programa para ler as coordenadas (X,Y) de uma quantidade indeterminada de pontos no sistema
cartesiano. Para cada ponto escrever o quadrante a que ele pertence. O algoritmo será encerrado quando pelo
menos uma de duas coordenadas for NULA (nesta situação sem escrever mensagem alguma).
         */

        System.out.println("Insira o valor de X: ");
        int x = sc.nextInt();
        System.out.println("Insira o valor de Y: ");
        int y = sc.nextInt();

        while (x != 0 && y != 0) {

            if (x > 0 && y > 0) {
                System.out.println("Primeiro");
            } else if (x < 0 && y > 0) {
                System.out.println("Segundo");
            } else if (x < 0 && y < 0) {
                System.out.println("Terceiro");
            } else if (x > 0 && y < 0) {
                System.out.println("Quarto");
            }

            System.out.println("Insira o valor de X: ");
            x = sc.nextInt();
            System.out.println("Insira o valor de Y: ");
            y = sc.nextInt();
        }
    }
}

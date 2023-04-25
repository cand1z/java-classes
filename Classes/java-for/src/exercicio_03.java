import java.util.Locale;
import java.util.Scanner;

public class exercicio_03 {
    public static void main(String[] args) {
        /*
        Leia 1 valor inteiro N, que representa o número de casos de teste que vem a seguir. Cada caso de teste
        consiste de 3 valores reais, cada um deles com uma casa decimal. Apresente a média ponderada para cada um
        destes conjuntos de 3 valores, sendo que o primeiro valor tem peso 2, o segundo valor tem peso 3 e o terceiro
        valor tem peso 5.
         */
        System.out.println("Inicio do programa");
        Scanner sc = new Scanner(System.in);
        Locale.setDefault(Locale.US);

        System.out.println("Insira um valor: ");
        int N = sc.nextInt();

        for (int i = 0; i < N ; i++) {
                System.out.println("Insira a primeira nota: ");
                double a = sc.nextDouble();
                System.out.println("Insira a segunda nota: ");
                double b = sc.nextDouble();
                System.out.println("Insira a terceira nota: ");
                double c = sc.nextDouble();

                System.out.printf("A média ponderada dos valores, onde os valores tem peso 2, 3 e 5 respectivamente é : %.1f%n", (a * 2.0 + b * 3.0 + c * 5.0) / 10.0);
        }

        sc.close();
    }
}

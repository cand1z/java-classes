import java.util.Scanner;

public class exercicio_02 {
    public static void main(String[] args) {
       /*
        Leia um valor inteiro N. Este valor será a quantidade de valores inteiros X que serão lidos em seguida. Mostre
        quantos destes valores X estão dentro do intervalo [10,20] e quantos estão fora do intervalo, mostrando essas
        informações conforme exemplo (use a palavra "in" para dentro do intervalo, e "out" para fora do intervalo).
        */
        System.out.println("Inicio do exercicio 02");
        Scanner sc = new Scanner(System.in);

        System.out.println("Insira o valor que irá repetir o código: ");
        int N = sc.nextInt();
        int in = 0, out = 0;

        for (int i = 0; i < N ; i++) {
            int x = sc.nextInt();
            if (x >= 10 && x <= 20){
                in++;
            }else {
                out++;
            }
        }
        System.out.println(in + " in");
        System.out.println(out + " out");

        sc.close();
    }
}

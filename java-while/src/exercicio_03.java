import java.util.Scanner;

public class exercicio_03 {
    public static void main(String[] args) {
        /*
        Um Posto de combustíveis deseja determinar qual de seus produtos tem a preferência de seus clientes. Escreva
um algoritmo para ler o tipo de combustível abastecido (codificado da seguinte forma: 1.Álcool 2.Gasolina 3.Diesel
4.Fim). Caso o usuário informe um código inválido (fora da faixa de 1 a 4) deve ser solicitado um novo código (até
que seja válido). O programa será encerrado quando o código informado for o número 4. Deve ser escrito a
mensagem: "MUITO OBRIGADO" e a quantidade de clientes que abasteceram cada tipo de combustível, conforme
exemplo.
         */
        System.out.println("Inicio do exercicio");
        Scanner sc = new Scanner(System.in);

        System.out.println("Insira o código:");
        int c = sc.nextInt();
        int alcool = 0, gasolina = 0, diesel = 0;

        while (c != 4) {
            if (c == 1) {
                alcool += 1;
            } else if (c == 2) {
                gasolina += 1;
            } else if (c == 3) {
                diesel += 1;
            }
            System.out.println("Insira um novo código:");
            c = sc.nextInt();
        }

        System.out.println("MUITO OBRIGADO!");
        System.out.println("Alcool: " + alcool);
        System.out.println("Gasolina: " + gasolina);
        System.out.println("Diesel: " + diesel);

        sc.close();
    }
}

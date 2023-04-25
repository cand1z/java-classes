import java.util.Locale;
import java.util.Scanner;

import static java.util.Locale.US;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Locale.setDefault(US);
        /*
        Exercicio 01: Fazer um programa para ler um número inteiro, e depois dizer se este número é negativo ou não.

        System.out.println("Inicio do exercicio 01.");
        System.out.println("Insira um número:");
        int numero = sc.nextInt();

        if (numero < 0){
            System.out.println("Número informado é negativo");
        }else {
            System.out.println("Número informado é positivo");
        }
         */
        /*
        Exercicio 02: Fazer um programa para ler um número inteiro e dizer se este número é par ou ímpar

        System.out.println("Inicio do exercicio 02");
        System.out.println("Insira um número:");
        int numero = sc.nextInt();

        if ( numero % 2 == 0){
            System.out.println("Número inserido é par");
        }else {
            System.out.println("Número inserido é impar");
        }
         */
        /*
        Exercicio 03: Leia 2 valores inteiros (A e B). Após, o programa deve mostrar uma mensagem "Sao Multiplos" ou "Nao sao
Multiplos", indicando se os valores lidos são múltiplos entre si. Atenção: os números devem poder ser digitados em
ordem crescente ou decrescente

        System.out.println("Inicio do exercicio 03");

        System.out.println("Insira o primeiro número:");
        int numero1 = sc.nextInt();
        System.out.println("Insira o segundo número:");
        int numero2 = sc.nextInt();

        if (numero2 % numero1 == 0 || numero1 % numero2 == 0){
            System.out.println("São multiplos");
        }else {
            System.out.println("Não são multiplos");
        }
         */
        /*
        Exercicio 04: Leia a hora inicial e a hora final de um jogo. A seguir calcule a duração do jogo, sabendo que o mesmo pode
começar em um dia e terminar em outro, tendo uma duração mínima de 1 hora e máxima de 24 horas.

        System.out.println("Inicio do exercicio 04");
        System.out.println("Insira a hora inicial: ");
        int horaInicial = sc.nextInt();
        System.out.println("Insira a hora final: ");
        int horaFinal = sc.nextInt();
        int duracao;

        if (horaInicial < horaFinal){
            duracao = horaFinal - horaInicial;
        }
        else {
            duracao = 24 - horaInicial + horaFinal;
        }
        System.out.printf("O JOGO DUROU %d HORA(s)",duracao);
         */
        /*
        Exercicio 05: Com base na tabela abaixo, escreva um programa que leia o código de um item e a quantidade deste item. A
seguir, calcule e mostre o valor da conta a pagar.
        1 - Cachorro Quente - R$ 4.00
        2 - X Salada - R$ 4.50
        3 - X Bacon - R$ 5.00
        4 - Torrada simples - R$ 2.00
        5 - Refrigerante - R$ 1.50

        System.out.println("Inicio do exercicio 05: ");
        System.out.println("Tabela de preços: ");
        System.out.println(
                "1 |   Cachorro Quente  | R$ 4.00\n" +
                "2 |   X Salada         | R$ 4.50\n" +
                "3 |   X Bacon          | R$ 5.00\n" +
                "4 |   Torrada simples  | R$ 2.00\n" +
                "5 |   Refrigerante     | R$ 1.50");

        double valorProduto, total;
        System.out.println("Insira o código do produto escolhido: ");
        int codigo = sc.nextInt();
        System.out.println("Insira a quantia do produto escolhido: ");
        int quantia = sc.nextInt();

        if (codigo == 1){
            valorProduto = 4.00;
            total = valorProduto * quantia;
            System.out.printf("Total a pagar: %.2f%n",total);
        }
        else if(codigo == 2) {
            valorProduto = 4.50;
            total = valorProduto * quantia;
            System.out.printf("Total a pagar: %.2f%n",total);
        }
        else if (codigo == 3) {
            valorProduto = 5.00;
            total = valorProduto * quantia;
            System.out.printf("Total a pagar: %.2f%n",total);
        }
        else if (codigo == 4) {
            valorProduto = 2.00;
            total = valorProduto * quantia;
            System.out.printf("Total a pagar: %.2f%n",total);
        }
        else if (codigo == 5) {
            valorProduto = 1.50;
            total = valorProduto * quantia;
            System.out.printf("Total a pagar: %.2f%n",total);
        }else {
            System.out.println("Código de produto informado não está na tabela.");
        }
         */
        /*
        Exercicio 07: Leia 2 valores com uma casa decimal (x e y), que devem representar as coordenadas
de um ponto em um plano. A seguir, determine qual o quadrante ao qual pertence o
ponto, ou se está sobre um dos eixos cartesianos ou na origem (x = y = 0).
Se o ponto estiver na origem, escreva a mensagem “Origem”.
Se o ponto estiver sobre um dos eixos escreva “Eixo X” ou “Eixo Y”, conforme for a
situação.

        System.out.println("Inicio do exercicio 07");
        System.out.println("Insira a coordenada de X: ");
        double x = sc.nextDouble();
        System.out.println("Insira a coordenada de Y: ");
        double y = sc.nextDouble();
        
        if (x == 0.0 && y > 0 || y < 0){
            System.out.println("Eixo X");
        } else if (y == 0.0 && x < 0 || x > 0) {
            System.out.println("Eixo Y");
        } else if (x > 0.0 && y > 0.0) {
            System.out.println("Q1");
        } else if (x > 0.0 && y < 0.0) {
            System.out.println("Q4");
        } else if (x < 0.0 && y < 0.0) {
            System.out.println("Q3");
        } else if (x < 0.0 && y > 0.0) {
            System.out.println("Q2");
        } else if ( x == 0 && y == 0) {
            System.out.println("Origem");
        }
         */
        /*
        Exercicio 08: Em um país imaginário denominado Lisarb, todos os habitantes ficam felizes em pagar seus impostos, pois sabem
que nele não existem políticos corruptos e os recursos arrecadados são utilizados em benefício da população, sem
qualquer desvio. A moeda deste país é o Rombus, cujo símbolo é o R$.
Leia um valor com duas casas decimais, equivalente ao salário de uma pessoa de Lisarb. Em seguida, calcule e
mostre o valor que esta pessoa deve pagar de Imposto de Renda, segundo a tabela abaixo

        de 0 a R$2.000,00 - Isento
        de R$2.000,00 a R$3.000,00 - 8%
        de R$3.000,01 a R$4.500,00 - 18%
        acima de R$4.500,00 - 28%

        Lembre que, se o salário for R$ 3002.00, a taxa que incide é de 8% apenas sobre R$ 1000.00, pois a faixa de
salário que fica de R$ 0.00 até R$ 2000.00 é isenta de Imposto de Renda. No exemplo fornecido (abaixo), a taxa é
de 8% sobre R$ 1000.00 + 18% sobre R$ 2.00, o que resulta em R$ 80.36 no total. O valor deve ser impresso com
duas casas decimais.


        System.out.println("Iniciando exercicio 08");

        System.out.println("Insira o seu salário: ");
        double salario = sc.nextDouble();
        double imposto = 0;

        if (salario < 2000.00){
            imposto = 0.0;
        } else if (salario <= 3000) {
            imposto = (salario - 2000.00) * 0.08;
        } else if (salario <= 4500) {
            imposto = (salario - 3000) * 0.18 + 1000 * 0.08;
        } else if (salario > 4500) {
            imposto = (salario - 4500) * 0.28 + 1500 * 0.18 + 1000 * 0.08;
        }

        if (imposto == 0){
            System.out.println("Isento");
        } else {
            System.out.printf("R$ %.2f%n", imposto);
        }
         */
        sc.close();
    }
}
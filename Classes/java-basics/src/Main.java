import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        /*
        Exercício 1: Faça um programa para ler o valor do raio de um círculo, e depois mostrar o valor da área deste círculo com quatro
        casas decimais conforme exemplos.
        Fórmula da área: area = π . raio2
        Considere o valor de π = 3.14159


        System.out.println("Inicio do exercicios 01");

        double area;
        System.out.print("Insira o valor do raio: ");
        double raio = sc.nextDouble();

        area = 3.14159*Math.pow(raio, 2);

        System.out.printf("O valor da área do circulo é: %.4f%n", area);
         */

        /*
        Exercicio 02: Fazer um programa para ler quatro valores inteiros A, B, C e D. A seguir, calcule e mostre a diferença do produto
de A e B pelo produto de C e D segundo a fórmula: DIFERENCA = (A * B - C * D).


        System.out.println("Inicio do exercicio 02");
        int A, B, C, D;
        A = sc.nextInt();
        B = sc.nextInt();
        C = sc.nextInt();
        D = sc.nextInt();

        System.out.printf("A diferença do produto de A e B pelo produto de C e D é: %d", ( A * B ) - ( C * D ) );
         */

        /*
        Exercicio 03: Fazer um programa que leia o número de um funcionário, seu número de horas trabalhadas, o valor que recebe por
hora e calcula o salário desse funcionário. A seguir, mostre o número e o salário do funcionário, com duas casas
decimais

        System.out.println("Inicio do exercicio 03");

        System.out.println("Insira o número do funcionário: ");
        int numeroFuncionario = sc.nextInt();
        System.out.println("Insira a quantia de horas trabalhadas: ");
        double horasTrabalhadas = sc.nextDouble();
        System.out.println("Insira o valor da hora: ");
        double valorHora = sc.nextDouble();

        double salario = horasTrabalhadas * valorHora;

        System.out.println("Número = "+ numeroFuncionario);
        System.out.printf("Salario = %.2f%n ", salario);
         */

        /*
        Exercicio 04: Fazer um programa para ler o código de uma peça 1, o número de peças 1, o valor unitário de cada peça 1, o
código de uma peça 2, o número de peças 2 e o valor unitário de cada peça 2. Calcule e mostre o valor a ser pago.


        System.out.println("Inicio do exercicio 04");

        int codPeca1, codPeca2, numPeca1, numPeca2;
        double valorPeca1, valorPeca2, valorTotal;

        System.out.println("Insira o código da primeira peça: ");
        codPeca1 = sc.nextInt();
        System.out.println("Insira o numero de peças: ");
        numPeca1 = sc.nextInt();
        System.out.println("Insira o valor unitário da peça: ");
        valorPeca1 = sc.nextDouble();

        System.out.println("Insira o código da segunda peça: ");
        codPeca1 = sc.nextInt();
        System.out.println("Insira o numero de peças: ");
        numPeca2 = sc.nextInt();
        System.out.println("Insira o valor unitário da peça: ");
        valorPeca2 = sc.nextDouble();

        valorTotal = (numPeca1 * valorPeca1)+(numPeca2 * valorPeca2);

        System.out.printf("Valor total a ser pago: %.2f%n",valorTotal);

         */

        /*
        Exercicio 05: Fazer um programa que leia três valores com ponto flutuante de dupla precisão: A, B e C. Em seguida, calcule e
mostre:
    a) a área do triângulo retângulo que tem A por base e C por altura.
    b) a área do círculo de raio C. (pi = 3.14159)
    c) a área do trapézio que tem A e B por bases e C por altura.
    d) a área do quadrado que tem lado B.
    e) a área do retângulo que tem lados A e B.


        System.out.println("Inicio do exercicio 05");

        double A, B, C;

        System.out.println("Insira o valor de A:");
        A = sc.nextDouble();
        System.out.println("Insira o valor de B:");
        B = sc.nextDouble();
        System.out.println("Insira o valor de C:");
        C = sc.nextDouble();

        System.out.printf("TRIANGULO RETANGULO = %.3f%n", (A*C)/2);
        System.out.printf("CIRCULO = %.3f%n",  3.14159*Math.pow(C,2));
        System.out.printf("TRAPEZIO = %.3f%n", ((A+B)*C)/2);
        System.out.printf("Quadrado = %.3f%n", Math.pow(B,2));
        System.out.printf("RETANGULO = %.3f%n", A*B);

         */
    }
}
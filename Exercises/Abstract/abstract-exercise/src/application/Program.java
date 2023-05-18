package application;

import entities.Contribuinte;
import entities.Fisica;
import entities.Juridica;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

public class Program {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        List<Contribuinte> list = new ArrayList<>();

        System.out.print("Insira o número de contribuintes: ");
        int n = sc.nextInt();

        for (int i = 1; i <= n; i++) {
            System.out.println();
            System.out.println("Informação do #" + i + " contribuinte:");

            System.out.print("Pessoa física ou juridica? (f/j) ");
            char ch = sc.next().toLowerCase().charAt(0);

            System.out.print("Nome: ");
            sc.nextLine();
            String nome = sc.nextLine();

            System.out.print("Renda anual: ");
            double rendaAnual = sc.nextDouble();

            if (ch == 'f') {
                System.out.print("Gastos com saúde: ");
                double gastosSaude = sc.nextDouble();

                list.add(new Fisica(nome, rendaAnual, gastosSaude));
            } else {
                System.out.print("Número de funcionários: ");
                int numeroDeFuncionarios = sc.nextInt();

                list.add(new Juridica(nome, rendaAnual, numeroDeFuncionarios));
            }
        }

        System.out.println();
        double totalImposto = 0.0;
        System.out.println("IMPOSTO A PAGAR:");
        for (Contribuinte contribuinte :
                list) {
            System.out.println(contribuinte.getNome() + ": R$ " + String.format("%.2f",contribuinte.imposto()));
            totalImposto += contribuinte.imposto();
        }

        System.out.println();
        System.out.printf("TOTAL DE IMPOSTOS A PAGAR: R$ %.2f", totalImposto);


        sc.close();
    }
}

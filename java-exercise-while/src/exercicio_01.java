import java.util.Locale;
import java.util.Scanner;

public class exercicio_01 {
    public static void main(String[] args) {
        /*
        Escreva um programa que repita a leitura de uma senha até que ela seja válida. Para cada leitura de senha
incorreta informada, escrever a mensagem "Senha Invalida". Quando a senha for informada corretamente deve ser
impressa a mensagem "Acesso Permitido" e o algoritmo encerrado. Considere que a senha correta é o valor 2002.
         */
        System.out.println("Inicio do exercicio");

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        int senha = 2002;
        System.out.println("Insira a senha: ");
        int validaSenha = sc.nextInt();

        while (validaSenha != senha){
            System.out.println("Senha inválida");
            validaSenha = sc.nextInt();
        }
        System.out.println("Acesso permitido");
        sc.close();
    }
}
import java.util.Locale;
import java.util.Scanner;

public class AboutCustomer {
    
public static void main(String[] args) {

    Scanner scanner = new Scanner (System.in).useLocale(Locale.US);

            System.out.println("Olá, seja bem-vindo a página de acesso do seu banco!");
            System.out.println("Para obter informações sobre o saldo atual, será necessário as seguintes informações: ");

            System.out.println("Digite seu nome:");           
            String nome = scanner.next();

            System.out.println("Digite seu sobrenome:");
            String sobrenome = scanner.next();

            System.out.println("Olá " + nome + " " + sobrenome + " seja bem vindo(a) a seu banco digital!");

            System.out.println("Digite o número da conta:");
            Short númeroDaConta = scanner.nextShort();

            System.out.println("Digite o número da agência:");
            String númeroDaAgência = scanner.next();

            double saldoAtual = 48.0;


        System.out.println("Nome Completo: " + nome + " " + sobrenome);
        System.out.println("Número da Agência: " + númeroDaAgência);
        System.out.println("Número da Conta: " + númeroDaConta);
        System.out.println("Seu saldo atual é de: R$" + saldoAtual);

        
        



    }


}

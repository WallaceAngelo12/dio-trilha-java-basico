import java.util.Locale;
import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) throws Exception {
        Scanner conta = new Scanner(System.in).useLocale(Locale.US);

        System.out.println("Seja bem vindo, Digite seu nome: ");
        String nomeCliente = conta.next();

        System.out.println("Digite o seu Numero: ");
        int numero = conta.nextInt();

        System.out.println("Digite sua Agencia: ");
        String agencia = conta.next();

        System.out.println("Quando deseja depositar inicialmente? ");
        Double saldo = conta.nextDouble();

        System.out
                .println("Olá " + nomeCliente + ", Obrigado por criar uma conta em nosso banco, sua agência é "
                        + agencia
                        + ", conta " + numero + " e seu saldo de R$" + saldo + " já está disponível para saque.");

    }
}

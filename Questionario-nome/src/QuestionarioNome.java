import java.util.Locale;
import java.util.Scanner;

public class QuestionarioNome {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in).useLocale(Locale.US);

        System.out.println("Digite seu nome: ");
        String nome = scanner.next();

        System.out.println("Digite o seu sobrenome: ");
        String sobrenome = scanner.next();

        System.out.println("Digite sua idade: ");
        int idade = scanner.nextInt();

        System.out.println("Digite sua altura");
        double altura = scanner.nextDouble();

        System.out.println(
                "Olá " + nome + " " + sobrenome + " Sua idade é " + idade + " e sua altura é de : " + altura
                        + " metros.");
    }
}

import java.util.Scanner;

public class Main {

   public static void main(String[] args) {
       Scanner sc = new Scanner(System.in);
       int dub = 0;
       int option;

       System.out.println("Digite o valor do ingresso: ");
       double valorIngresso = sc.nextDouble();
       sc.nextLine();
       System.out.println("Digite o nome do filme: ");
       String nomeFilme = sc.nextLine();

       System.out.println("Informe se o ingresso é dublado: \n digite 1 se for dublado e 0 se não");
       boolean dublado = sc.nextInt() == 1;


    System.out.println("Bem vindo ao sistema de gestão de ingressos!");
       System.out.println("=============================");
       System.out.println("1 - Meia entrada");
       System.out.println("2 - Ingresso para familia");
       System.out.println("=============================");
       switch (option = sc.nextInt()){
        case 1:
            MeiaEntrada meiaEntrada = new MeiaEntrada(nomeFilme,valorIngresso,dublado);
            System.out.println("Valor do ingresso: " + meiaEntrada.calcularValorIngresso());
            break;
        case 2:
            System.out.println("Digite a quantidade de pessoas: ");
            int numPessoas = sc.nextInt();
            IngressoFamilia familia = new IngressoFamilia(nomeFilme,valorIngresso,dublado,numPessoas);
            System.out.println("Valor do ingresso: " + familia.calcularValorIngresso());
            break;
           default:
               System.out.println("Digite uma opção válida");
    }
    sc.close();
}
}

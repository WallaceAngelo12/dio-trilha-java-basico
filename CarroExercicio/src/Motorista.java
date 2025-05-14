import java.util.Scanner;

public class Motorista {
    public static void main(String[] args) {
        int option = -1;
        Scanner scanner = new Scanner(System.in);
        Carro carro = new Carro();

        do {
            System.out.println("====== Menu =======");
            System.out.println("1 - Ligar");
            System.out.println("2 - Desligar");
            System.out.println("3 - Acelerar");
            System.out.println("4 - Frear");
            System.out.println("5 - Verificar velocidade");
            System.out.println("6 - Trocar marcha");
            System.out.println("7 - Virar para direita");
            System.out.println("8 - Virar para esquerda");
            System.out.println("0 - Sair");
            System.out.println("Escolha uma opção: ");

            if (scanner.hasNextInt()) {
                option = scanner.nextInt();
            } else {
                System.out.println("Entrada inválida. Digite um número.");
                scanner.next();
                continue;
            }

            switch (option) {
                case 1:
                    carro.ligar();
                    break;
                case 2:
                    carro.desligar();
                    break;
                case 3:
                    carro.acelerar();
                    break;
                case 4:
                    carro.frear();
                    break;
                case 5:
                    carro.verificarVelocidade();
                    break;
                case 6:
                    System.out.println("Digite a marcha desejada: ");
                    if (scanner.hasNextInt()) {
                        int marchaInput = scanner.nextInt();
                        carro.trocarMarcha(marchaInput);
                    } else {
                        System.out.println("Entrada inválida. Digite um número inteiro.");
                        scanner.next();
                    }
                    break;
                case 7:
                    carro.virarDireita();
                    break;
                case 8:
                    carro.virarEsquerda();
                    break;
                case 0:
                    System.out.println("Obrigado por usar nosso programa");
                    break;
                default:
                    System.out.println("Opção inválida");
                    break;
          }
        }while(option != 0);

        scanner.close();
    }
}
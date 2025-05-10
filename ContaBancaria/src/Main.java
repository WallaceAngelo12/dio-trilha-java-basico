package src;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        ContaBancaria conta = null;
        int option;


        do {
                System.out.println("Escolha uma das opções:");
                System.out.println("=========================");
                System.out.println("1 - Criar uma conta");
                System.out.println("2 - Consultar saldo");
                System.out.println("3 - Depositar");
                System.out.println("4 - Sacar");
                System.out.println("5 - Pagar boleto");
                System.out.println("6 - informações da conta");
                System.out.println("=========================");
                System.out.println("0 - Sair");

                option = scanner.nextInt();
                scanner.nextLine();

                switch (option){
                    case 1 :
                        System.out.println("Digite o nome do titular da conta: ");
                        String nomeTitular = scanner.nextLine();

                        System.out.println("Digite o saldo inicial da conta: ");
                        float saldoInicial = scanner.nextFloat();
                        scanner.nextLine();
                        conta = new ContaBancaria(nomeTitular,saldoInicial);
                        break;
                    case 2:
                        if(conta != null){
                            System.out.print("Seu saldo é de : " + conta.getSaldo());
                        }else{
                            System.out.println("Conta não criada!");
                        }
                        break;
                    case 3:
                        if(conta != null){
                            System.out.println("Digite o valor do depósito: ");
                            float valorDeposito = scanner.nextFloat();
                            conta.depositar(valorDeposito);
                        }else{
                            System.out.println("Conta não criada!");
                        }
                        break;
                    case 4:
                        if(conta != null){
                            System.out.println("Digite o valor do saque: ");
                            float valorSaque = scanner.nextFloat();
                            conta.sacar(valorSaque);
                        }else{
                            System.out.println("Conta não criada!");
                        }
                        break;
                    case 5: if(conta != null){
                        System.out.println("Digite o valor do boleto: ");
                        float valorBoleto = scanner.nextFloat();
                        conta.pagarBoleto(valorBoleto);
                    }else{
                        System.out.println("Conta não criada!");
                    }
                    case 6:
                        if(conta != null){
                            System.out.println("=========================");
                            System.out.println("Nome do titular: " + conta.getNomeTitular());
                            System.out.println("Numero da conta: " + conta.getNumeroConta());
                            System.out.println("Saldo da conta: " + conta.getSaldo());
                            System.out.println("Cheque especial: R$" + conta.getChequeEspecial());
                            System.out.println("Saldo total: R$" + conta.getSaldoTotal());
                            System.out.println("=========================");
                        }else{
                            System.out.println("Conta não criada!");
                        }
                    break;
                    case 0:
                        System.out.println("Encerrando o programa...");
                        break;
                    default:
                        System.out.println("Opção inválida!");
                        break;
                }
        }while(option != 0);

        scanner.close();


    }
}

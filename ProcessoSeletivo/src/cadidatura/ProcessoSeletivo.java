package cadidatura;

import java.util.InputMismatchException;
import java.util.Scanner;

public class ProcessoSeletivo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        try {
            System.out.println("Digite o salário pretendido: ");
            double salarioPretendido = scanner.nextDouble();
            analisarCandidato(salarioPretendido);
        }

        catch (InputMismatchException e) {
            System.out.println("Digite um valor válido!");
        }catch (Exception e) {
            System.out.println("Ocorreu um erro desconhecido!");
        }finally {
            scanner.close();
        }

    }
    static void analisarCandidato(double salarioPretendido){
        double salarioBase = 2000.0;
        if (salarioBase> salarioPretendido){
            System.out.println("LIGAR PARA O CANDIDATO!");
    }else if (salarioBase==salarioPretendido){
            System.out.println("LIGAR PARA O CANDIDATO COM CONTRA PROPOSTA!");
        }else{
            System.out.println("AGUARDANDO OS DEMAIS CANDIDATOS!");
        }
}}
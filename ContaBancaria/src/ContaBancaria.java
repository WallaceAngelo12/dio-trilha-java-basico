package src;

public class ContaBancaria {

    private final int numeroConta;
    private float saldo;
    private final String nomeTitular;
    private float chequeEspecial;
    private float multa;

    static int totalContas = 0;

    public ContaBancaria(String nomeTitular,float saldoInicial){
        this.nomeTitular = nomeTitular;
        this.saldo = saldoInicial;
        totalContas++;
        this.numeroConta = totalContas;
        if (saldoInicial > 500){
            chequeEspecial = saldoInicial / 2;
        }else{
            chequeEspecial = 50;
        }
        System.out.println("Conta criada com sucesso!");
        System.out.println("=========================");
        System.out.println("Nome do titular: " + nomeTitular);
        System.out.println("Numero da conta: " + numeroConta);
        System.out.println("Saldo da conta: " + saldo);
        System.out.println("Cheque especial: R$" + chequeEspecial);
        System.out.println("Saldo total: R$" + getSaldoTotal());
        System.out.println("=========================");
    }

    public int getNumeroConta() {
        return numeroConta;
    }

    public float getSaldo() {
        return saldo;
    }

    public String getNomeTitular() {
        return nomeTitular;
    }

    public float getChequeEspecial() {
        return chequeEspecial;
    }

    public float getSaldoTotal(){
        return saldo + chequeEspecial;
    }

    public void depositar(float valor){
        if (valor > 0){
            saldo += valor;
            System.out.println("Deposito realizado com sucesso!");
            System.out.println("Novo saldo da conta: R$" + saldo);
        }else{
            System.out.println("Valor inválido!");
        }
    }

    public void sacar(float valor){
        if (valor > 0 && valor <= saldo){
            saldo -= valor;
            System.out.println("Saque realizado com sucesso!");
            System.out.println("Novo saldo da conta: R$" + saldo);
        } else if (valor <= getSaldoTotal()) {
            float valorChequeEspecialUsado =  valor-saldo;
            saldo = 0;
            chequeEspecial -= valorChequeEspecialUsado;
            multa = valorChequeEspecialUsado * 0.2f;
            System.out.println("Saque realizado com sucesso!");
            System.out.println("ChequeEspecial utilizado!, sera cobrado uma taxa de 20% do valor utilizado");
            System.out.println("Multa: R$" + multa);
            System.out.println("Novo saldo da conta: R$" + getSaldoTotal());
        } else {
            System.out.println("Valor inválido!");
        }
    }

    public void pagarBoleto(float valor){
        if(valor <=0){
            System.out.println("Valor inválido!");
            return;
        }

        if (valor <= saldo){
            saldo -= valor;
            System.out.println("Pagamento realizado com sucesso!");
            System.out.println("Novo saldo da conta: R$" + saldo);
        } else if (valor <= getSaldoTotal()) {
            float valorChequeEspecialUsado =  valor-saldo;
            saldo = 0;
            chequeEspecial -= valorChequeEspecialUsado;
            multa = valorChequeEspecialUsado * 0.2f;

            System.out.println("Saque realizado com sucesso!");
            System.out.println("ChequeEspecial utilizado!, sera cobrado uma taxa de 20% do valor utilizado");
            System.out.println("Multa: R$" + multa);
            System.out.println("Novo saldo da conta: R$" + getSaldoTotal());
        }else{
            System.out.println("Valor insuficiente para o pagamento!");
        }
    }
}

public class Atendente extends Usuarios{

    private double caixa;
    private double valor;

    public Atendente(String nome, String email, String senha) {
        super(nome, email, senha,false);
    }

    public void receberPagamento(double valor){
        this.caixa += valor;
        System.out.println("Pagamento efetuado com sucesso!");
    }

    public void fecharCaixa(){
        System.out.println("Caixa fechado com sucesso!");
        System.out.println("Saldo atual: " + this.caixa);
        this.caixa = 0;
    }

}



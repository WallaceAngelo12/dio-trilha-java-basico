package AparelhoTelefonico;

public class AparelhoTelefonico implements AparelhoTelefonicoInter{
    private String numero;

    public String getNumero() {
        return numero;
    }

    public void setNumero(String numero) {
        this.numero = numero;
    }

    public  void ligar(String numero){
        setNumero(numero);
        System.out.println("Aparelho Telefonico Ligando para " + numero);
    }

    public void atender(){
        System.out.println("Atendendo ligação");
    }

    public void iniciarCorreioVoz(){
        System.out.println("Aparelho Telefonico Iniciando correio voz");
    }
}

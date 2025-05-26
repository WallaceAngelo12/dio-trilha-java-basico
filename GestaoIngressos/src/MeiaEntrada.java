public class MeiaEntrada extends Ingresso{

    public MeiaEntrada(String nomeFilme, double valor, boolean dublado) {
        super(nomeFilme, valor, dublado);
    }
    public double calcularValorIngresso() {
        return this.getValor() / 2;
    }
}

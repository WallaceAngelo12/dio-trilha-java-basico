public class IngressoFamilia extends Ingresso{

    private int numPessoas;


    public IngressoFamilia(String nomeFilme, double valor, boolean dublado, int numPessoas) {
        super(nomeFilme, valor, dublado);
        this.numPessoas = numPessoas;
    }
    public int getNumPessoas() {
        return numPessoas;
    }
    public void setNumPessoas(int numPessoas) {
        this.numPessoas = numPessoas;
    }

    public double calcularValorIngresso() {
        if(numPessoas > 3){
            return this.getNumPessoas() * getValor() * 0.95;
        }
        return this.getNumPessoas() * getValor();
    }

}

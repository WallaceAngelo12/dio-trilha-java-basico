public class Vendedor extends Usuarios{

        private int vendas;

        public Vendedor(String nome, String email, String senha) {
            super(nome, email, senha, false);
        }

    public int getVendas() {
        return vendas;
    }


    public void realizarVenda(){
            vendas++;
            System.out.println("Venda efetuada!");
        }

    public void consultarVendas(){
             System.out.println("Vendas efetuadas: " + vendas);
        }


}

public class Gerente extends Usuarios {


    public Gerente(String nome, String email, String senha) {
        super(nome, email, senha,true);
    }


    public void gerarRelatorio(){
        System.out.println("Gerando relatório...");
        System.out.println("Relatório gerado com sucesso!");
    }

    public void consultarVendas(){
        System.out.println("Consultando vendas...");
        System.out.println("Consulta realizada com sucesso!");
    }



}

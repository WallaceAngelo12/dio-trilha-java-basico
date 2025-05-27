public class Main {

    public static void main(String[] args) {

        Gerente gerente = new Gerente("Gerente", "<EMAIL>", "123456");
        Vendedor vendedor = new Vendedor("Vendedor", "<EMAIL>", "123456");
        Atendente atendente = new Atendente("Atendente", "<EMAIL>", "123456");

        gerente.realizarLogin("<EMAIL>", "123456");
        gerente.gerarRelatorio();

        vendedor.realizarLogin("<EMAIL>", "123456");
        vendedor.realizarVenda();
        vendedor.consultarVendas();

        atendente.realizarLogin("<EMAIL>", "123456");
        atendente.receberPagamento(100);
        atendente.fecharCaixa();
    }
}

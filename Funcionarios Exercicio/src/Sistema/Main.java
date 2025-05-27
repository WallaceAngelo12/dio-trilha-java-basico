package Sistema;

import funcionarios.*;

public class Main {

    public static void main(String[] args) {

        Gerente gerente = new Gerente("funcionarios.Gerente", "<EMAIL>", "123456");
        Vendedor vendedor = new Vendedor("funcionarios.Vendedor", "<EMAIL>", "123456");
        Atendente atendente = new Atendente("funcionarios.Atendente", "<EMAIL>", "123456");

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

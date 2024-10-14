package loja;

import java.awt.color.ProfileDataException;

public class Principal {
    public static void main(String[] args) {
        Venda venda = new Venda();

        Cliente cliente1 = new Cliente();
        cliente1.nome = "José";
        cliente1.endereco = "Rua A";
        cliente1.telefone = "11-22334455";

        Produto produtos1 = new Produto();
        produtos1.descricao = "Tenis";
        produtos1.qtdEstoque = 1;
        produtos1.preco = 100.0;

        Produto produtos2 = new Produto();
        produtos2.descricao = "Cinto";
        produtos2.qtdEstoque = 1;
        produtos2.preco = 100.0;

        Produto[] produtos = new Produto[]{produtos1, produtos2};

        venda.cliente = cliente1;
        venda.produtos = produtos;
        venda.valorTotal = venda.calcular();
        venda.qtdEstoque();

        System.out.println("--------- Venda ----------");

        System.out.println();

        System.out.println("Dados do cliente");

        System.out.printf("Nome do cliente: %s%n", cliente1.nome);
        System.out.printf("Endereço do cliente: %s%n", cliente1.endereco);
        System.out.printf("Telefone do cliente: %s%n", cliente1.telefone);

        System.out.println();

        System.out.printf("Nome do produto: %s%n", produtos1.descricao);
        System.out.printf("Quantidade em estoque: %s%n", produtos1.qtdEstoque);
        System.out.printf("Preço do produto: %s%n", produtos1.preco);

        System.out.println();

        System.out.printf("Nome do produto: %s%n", produtos2.descricao);
        System.out.printf("Quantidade em estoque: %s%n", produtos2.qtdEstoque);
        System.out.printf("Preço do produto: %s%n", produtos2.preco);


        System.out.println("Total: " + venda.valorTotal);

    }

}

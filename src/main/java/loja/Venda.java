package loja;

public class Venda {
    Produto[] produtos;
    Cliente cliente;
    Double valorTotal;

    public double calcular() {
        double calcularTotal = 0;
        for (int i = 0; i < produtos.length; i++) {
            calcularTotal += produtos[i].preco;

        }
        return calcularTotal;
    }

    public int qtdEstoque() {
        int estoque = 20;

        for (Produto produto : produtos) {
            estoque += produto.qtdEstoque;

            if (estoque <= 0) {
                System.out.println("Estoque vazio.");
            }
        }
        return estoque;

    }

}

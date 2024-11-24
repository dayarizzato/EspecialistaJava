package construtores;

public class Principal {
    public static void main(String[] args) {
        Produto produto = new Produto("Picanha");
        Produto produto2 = new Produto("Contra-filé", 1);
        Produto produto3 = new Produto();

        produto.nome = null;
        produto.quantidade = -1;

        System.out.println(produto.nome);
        System.out.println(produto.quantidade);
        System.out.println("------------------------------");
        System.out.println(produto2.nome);
        System.out.println(produto2.quantidade);
        System.out.println("------------------------------");
        System.out.println(produto3.nome);
        System.out.println(produto3.quantidade);
    }
}

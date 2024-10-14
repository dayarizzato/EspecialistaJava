package product;

public class Principal {

    public static void main(String[] args) {
        Produto produto1 = new Produto();
        Produto produto2 = new Produto();

        produto1.alterarValorCusto(10);
        produto2.alterarValorCusto(5);

        produto1.alterarValorCustoEmbalagem();

    }

}

package product;

public class Produto {

    static double custoEmbalagem;
    double valorCusto;
    double valorVenda;

    public void alterarValorCustoEmbalagem(){
        this.alterarValorCusto(10);
    }

    public void alterarValorCusto(double valorCusto){
        this.valorCusto = valorCusto;
    }

    public void imprimirValorEmbalagem(double valorVenda){
        System.out.printf("O preço da embalagem é: %.2f%n", Produto.custoEmbalagem);
    }

}

package arrays.exerciciosArrays2;

public class ItemCardapio {

    String descricao;
    double preco;

    public boolean precoEntreOsDois(double precoMinimo, double precoMaximo){
        return preco <= precoMaximo && preco >= precoMinimo;
    }
    public void imprimir(){
        System.out.printf("%s - R$ %.2f \n", descricao, preco);
    }

}

package arrays.exerciciosArrays2;

import java.util.ArrayList;

public class Cardapio {
    //ItemCardapio[] itens = new ItemCardapio[0];
    ArrayList<ItemCardapio> itens = new ArrayList<>();

    public void adicionar(ItemCardapio item){
        itens.add(item);
    }
    public void remover(int indice){
        itens.remove(indice);
    }
    public void imprimir(double precoMinimo, double precoMaximo){
        for(ItemCardapio item : itens){
            if(item.precoEntreOsDois(precoMinimo, precoMaximo)){
                item.imprimir();
            }
        }
    }
}

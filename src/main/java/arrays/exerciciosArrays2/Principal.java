package arrays.exerciciosArrays2;

import java.util.ArrayList;
import java.util.Arrays;

public class Principal {
    public static void main(String[] args) {
        Cardapio cardapio = new Cardapio();

        ItemCardapio itemCardapio1 = new ItemCardapio();
        itemCardapio1.descricao = "Pizza de mussarela";
        itemCardapio1.preco = 35.00;

        ItemCardapio itemCardapio2 = new ItemCardapio();
        itemCardapio2.descricao = "Pizza de calabresa";
        itemCardapio2.preco = 55.00;

        cardapio.adicionar(itemCardapio1);
        cardapio.adicionar(itemCardapio2);

        cardapio.imprimir(0.0, 150.0);

    }

}

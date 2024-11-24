package construtores;

import java.util.Objects;

public class Produto {
    public static final int QUANTIDADE_PRODUTO = 100;

    String nome;
    int quantidade;

    Produto(){
        //está chamando o primeiro construtor(encadeamento)
        this("Sem nome");

        //está chamando o segundo construtor
        //this("Sem nome", 4);

        //this.nome = "Sem nome";
        //this.quantidade = QUANTIDADE_PRODUTO;
    }

    Produto(String nome){
        //encadeamento
        this(nome, QUANTIDADE_PRODUTO);

        //Objects.requireNonNull(nome, "Nome é obrigatório");

        //this.nome = nome;
        //this.quantidade = QUANTIDADE_PRODUTO;
    }

    //Sobrecarga de construtores
    Produto(String nome, int quantidade){
        Objects.requireNonNull(nome, "Nome é obrigatório");

        if(quantidade < 1){
            throw new IllegalArgumentException("A quantidade não pode ser menor do que 1");
        }

        this.nome = nome;
        this.quantidade = quantidade;
    }


}

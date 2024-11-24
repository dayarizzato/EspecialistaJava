package construtores.ExercicioConstrutores;

import java.util.Objects;

public class Participante {
    public static final int SALDO_PONTOS_INICIAL = 100;

    String nome;
    int saldoDePontos;

    Participante(String nome){
        Objects.requireNonNull("O nome é obrigatório");

        this.nome = nome;
        this.saldoDePontos = SALDO_PONTOS_INICIAL;
    }

    Participante(String nome, int saldoDePontos){
        this.nome = nome;
        this.saldoDePontos = saldoDePontos;

        if(saldoDePontos < 1){
            throw new IllegalArgumentException("Saldo insuficiente.");
        }
    }
}

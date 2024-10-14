package portaria;

public class Visitante {

    public static final int IDADE_MINIMA_ACESSO_PORTARIA = 16;

    String nome;
    int idade;

    boolean possuiIdadeMinima(){
        return idade < IDADE_MINIMA_ACESSO_PORTARIA;
    }

}

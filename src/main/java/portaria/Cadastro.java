package portaria;

public class Cadastro {

    public static final int TEMPO_EXPIRACAO_EM_MESES = 3;

    public void cadastro(Visitante visitante){
        this.cadastro(visitante);
    }

    public int cadastro(Visitante visitante, final int expirarTempoEmMeses){
        final int expirarTempoEmDias = expirarTempoEmMeses * 30;

        System.out.printf("O usuário %s tem o período de %d dias de acesso.",
                visitante.nome, expirarTempoEmDias);

        return 1;
    }
}

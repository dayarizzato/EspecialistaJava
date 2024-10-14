package portaria;

public class Principal {
    public static void main(String[] args) {
        var novoVisitante = new Visitante();
        novoVisitante.nome = "Maria";
        novoVisitante.idade = 12;

        Cadastro cadastro = new Cadastro();
        cadastro.cadastro(novoVisitante, 4);

    }
}

package construtores.ExercicioConstrutores;

public class Principal {
    public static void main(String[] args) {

        Participante participante = new Participante("Diego");
        Participante participante1  =  new Participante("Dayana", 10);

        System.out.println(participante.nome);
        System.out.println(participante.saldoDePontos);
        System.out.println("------------------------------");
        System.out.println(participante1.nome);
        System.out.println(participante1.saldoDePontos);

    }
}

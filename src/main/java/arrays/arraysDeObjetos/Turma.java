package arrays.arraysDeObjetos;

public class Turma {
    String nomeProfessora;
    String turma;
    Alunos[] aluno = new Alunos[0];

    public void imprimirAlunos(){
        for (Alunos alunos : aluno) {
            if(aluno != null) System.out.printf("%s (%d anos)%n", alunos.nome, alunos.idade);
        }
    }
}

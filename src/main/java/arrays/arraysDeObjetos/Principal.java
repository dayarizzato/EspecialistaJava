package arrays.arraysDeObjetos;

public class Principal {
    public static void main(String[] args) {
        Turma turma1 = new Turma();
        turma1.turma = "Maternal";
        turma1.nomeProfessora = "Maria";
        turma1.aluno = new Alunos[2];

        Alunos aluno1 = new Alunos();
        aluno1.nome = "João";
        aluno1.idade = 5;

        turma1.aluno[0] = aluno1;

        Alunos aluno2 = new Alunos();
        aluno2.nome = "Maria";
        aluno2.idade = 7;

        turma1.aluno[1] = aluno2;

        for(int i = 0; i < turma1.aluno.length; i++){
            if(turma1.aluno[i] != null){
                System.out.printf("%d - %s (%d anos)%n", i, turma1.aluno[i].nome, turma1.aluno[i].idade );
            }
        }
    }
}

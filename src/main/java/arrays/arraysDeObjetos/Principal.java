package arrays.arraysDeObjetos;

import java.util.ArrayList;

public class Principal {
    public static void main(String[] args) {
        Turma turma1 = new Turma();
        turma1.turma = "Maternal";
        turma1.nomeProfessora = "Maria";

        Alunos aluno1 = new Alunos();
        aluno1.nome = "João";
        aluno1.idade = 5;

        Alunos aluno2 = new Alunos();
        aluno2.nome = "Maria";
        aluno2.idade = 7;

        Alunos aluno3 = new Alunos();
        aluno3.nome = "Diego";
        aluno3.idade = 1;

        turma1.adicionar(aluno1);
        turma1.adicionar(aluno2);
        turma1.adicionar(aluno3);

        turma1.remover(1);

        turma1.imprimirAlunos();
    }
}

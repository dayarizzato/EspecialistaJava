package arrays.arraysDeObjetos;

import java.util.ArrayList;

public class Turma {
    String nomeProfessora;
    String turma;
    ArrayList<Alunos> alunos = new ArrayList<>();

    public void adicionar(Alunos alunos){
        this.alunos.add(alunos);
    }

    public void remover(int indice){
        alunos.remove(indice);
    }

    public void imprimirAlunos(){
        for (Alunos alunos : alunos) {
            if(this.alunos != null) System.out.printf("%s (%d anos)%n", alunos.nome, alunos.idade);
        }
    }
}

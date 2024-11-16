package arrays.arraysDeObjetos;

import java.util.ArrayList;

public class Principal2 {
    public static void main(String[] args) {
        ArrayList<String> alunos = new ArrayList<>();
        alunos.add("Leonardo");
        alunos.add("Laura");

        for(String aluno : alunos){
            System.out.println(aluno);
        }
    }
}

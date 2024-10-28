package arrays.iterandoComArrays;

import java.util.Arrays;

public class Principal {
    public static void main(String[] args) {
        double[] notas = {2.6,10,5,2};

        double media = Calculadora.calcular(notas);
        String nota = Arrays.toString(notas);
        System.out.println(nota);
        System.out.println(media);
    }
}
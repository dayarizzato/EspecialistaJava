package arrays.iterandoComArrays;

import java.util.Arrays;

public class Principal {
    public static void main(String[] args) {
        double[] notas = {2,4,6,8};

        double media = Calculadora.calcular(notas);
        String valorNotas = Arrays.toString(notas);
        System.out.println(valorNotas);
        System.out.println(media);
    }
}

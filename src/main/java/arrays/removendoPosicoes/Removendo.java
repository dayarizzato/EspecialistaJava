package arrays.removendoPosicoes;

import java.util.Arrays;

public class Removendo {
    public static void main(String[] args) {
        int[] numerosJogo = {2, 5, 55, 21, 62, 10, 43};
        int[] numerosNewJogo = new int[numerosJogo.length - 1];

        System.out.println(Arrays.toString(numerosJogo));
        System.out.println(Arrays.toString(numerosNewJogo));
    }
}

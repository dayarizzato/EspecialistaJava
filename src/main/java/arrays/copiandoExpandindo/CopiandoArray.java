package arrays.copiandoExpandindo;

import java.util.Arrays;

public class CopiandoArray {

    public static void main(String[] args) {
        int[] numerosJogo1 = {12, 34, 45, 21, 2};
        int[] numerosJogo2 = Arrays.copyOf(numerosJogo1, numerosJogo1.length);

        System.out.println(Arrays.toString(numerosJogo1));
        System.out.println(Arrays.toString(numerosJogo2));
    }
}

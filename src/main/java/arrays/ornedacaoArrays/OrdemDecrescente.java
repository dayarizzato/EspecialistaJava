package arrays.ornedacaoArrays;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;

public class OrdemDecrescente {
    public static void main(String[] args) {
        Integer[] numeros = {10, 45, 4, 2};

        Arrays.sort(numeros, Comparator.reverseOrder());

        System.out.println(Arrays.toString(numeros));
    }
}

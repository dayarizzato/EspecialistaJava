package arrays.removendoPosicoes;

import java.util.Arrays;

public class Removendo {
    public static void main(String[] args) {
        int[] numerosJogo = {2, 5, 55, 21, 62, 10, 43};
        int[] numerosNewJogo = new int[numerosJogo.length - 1];

        int indiceExclusao = 5;

        /*Copiar de um array para outro- Primeiro parametro pega o array de origem
        (de onde queremos copiar) -numerosJogo,
        o segundo parametro é a posicao inicial - 0,
        o array de destino no qual quero copiar os numeros - numerosnewJogo,
        proximo parametro é a proxima posicao do array de destino -0,
        especifico qual é a posicao sw cada elemento
        */

        System.arraycopy(numerosJogo, 0, numerosNewJogo, 0, indiceExclusao);

        System.arraycopy(numerosJogo, indiceExclusao + 1, numerosNewJogo, indiceExclusao,
                numerosNewJogo.length - indiceExclusao);

        System.out.println(Arrays.toString(numerosJogo));
        System.out.println(Arrays.toString(numerosNewJogo));

    }
}

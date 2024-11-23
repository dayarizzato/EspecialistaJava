package arrays.multidimensional;

import java.util.Arrays;

public class ArrayMultidimensional {
    public static void main(String[] args) {
        //linha, coluna
        String[][] cidades = new String[3][];

        cidades[0] = new String[3];
        cidades[0][0] = "Barueri";
        cidades[0][1] = "São Paulo";
        cidades[0][2] = "Cotia";

        cidades[1] = new String[2];
        cidades[1][0] = "Belo Horizonte";
        cidades[1][1] = "Porto Alegre";

        cidades[2] = new String[1];
        cidades[2][0] = "Bahia";

       for(String[] cidadePorEstado : cidades){
           for(String cidade : cidadePorEstado){
               System.out.println(cidade);
           }
       }

    }
}

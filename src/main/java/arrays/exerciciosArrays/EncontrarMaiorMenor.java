package arrays.exerciciosArrays;

public class EncontrarMaiorMenor {
    public static final Integer[] ARRAY = {45,3,1,200,9,4,7};

    public static void main(String[] args) {
        //O array inicia em 0
        int maior = 0;
        int menor = 0;
        int contador = 0;
        //Percorre o array
        for(Integer numero: ARRAY){
            if(contador == 0){
                menor = numero;
            }

            if(numero < menor){
                menor = numero;
            }
            if(numero > maior){
                maior = numero;
            }
            contador ++;
        }
        System.out.println(menor);
        System.out.println(maior);
    }


}

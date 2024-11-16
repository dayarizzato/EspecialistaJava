package arrays.exerciciosArrays;

public class ParesImpares {
    public static final Integer[] PARESIMPARES = {1,2,3,4,5,6};

    public static void main(String[] args) {
        int pares = 0;
        int impares = 0;

        for(Integer numero : PARESIMPARES){
            if(numero %2 == 0){
                System.out.printf("O número %d é par.%n", numero);
            }else{
                System.out.printf("O número %d é ímpar.%n" , numero);
            }
        }
    }
}

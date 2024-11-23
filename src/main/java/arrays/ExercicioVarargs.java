package arrays;
/*Implemente um método de uma classe para calcular a média de números do tipo double.
Este método deve exigir no mínimo 2 números para o cálculo, sendo ilimitada a quantidade máxima.
Use varargs para conseguir isso, usando as boas práticas que você aprendeu.*/


import java.util.Arrays;

public class ExercicioVarargs {
    public static void main(String[] args) {
        Double[] numeros = {10.0, 20.0, 20.0};
        Double media = calcularMedia(numeros);

        System.out.println(media);

        }
    public static Double calcularMedia(Double... numeros) {

        Double soma = 0.0;
        for(Double resultado : numeros){
            soma += resultado;
        }
        return soma / numeros.length;
    }
}

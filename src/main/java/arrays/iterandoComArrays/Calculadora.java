package arrays.iterandoComArrays;

public class Calculadora {
   public static double calcular(double numero[]){
        double total = 0;
        for(int i = 0; i < numero.length; i++){
            total += numero[i];
        }
        return total / numero.length;
    }
}

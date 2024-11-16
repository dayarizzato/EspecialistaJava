package arrays.exerciciosArrays;

public class Somar {
    public static final Integer[] SOMAR = {2,4,6,8};

    public static void main(String[] args) {
        int total = 0;

        for(Integer soma : SOMAR){
            total += soma;
        }
        System.out.println(total);
    }
}

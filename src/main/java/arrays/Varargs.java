package arrays;

public class Varargs {
    public static void main(String[] args) {
        imprimir("Dayana", "Diego");
        numero(2);
    }
    public static void imprimir(String... valor){
        for(String v : valor){
            System.out.println(v);
        }
    }
    public static void numero(Integer... numero){
        for(Integer n : numero){
            System.out.println(n);
        }
    }

}

package arrays.exerciciosArrays;

public class Compras {
    public static final String[] OBJETOS ={"TV", "Computador", "Celular"};

    public String obterObjetos(int obj){

        if(obj < 0 || obj > 3){
            return "objeto invalido";
        }
        return OBJETOS[obj - 1];
    }

    public static void main(String[] args) {
        Compras compras = new Compras();
        String objetosObtidos = compras.obterObjetos(2);

        System.out.println(objetosObtidos);
    }
}

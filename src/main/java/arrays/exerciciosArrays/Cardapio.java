package arrays.exerciciosArrays;

public class Cardapio {
    public static final String[] CARDAPIO = {"Pizza", "Lanche", "Comida"};

    public String buscarMenu(int produtos){
        if(produtos < 1 || produtos >= 3){
            return "produto inexistente";
        }
        return CARDAPIO[produtos + 1];
    }

    public static void main(String[] args) {
        Cardapio cardapio = new Cardapio();
        String mostrarCardapio = cardapio.buscarMenu(1);


        System.out.println(mostrarCardapio);
    }
}

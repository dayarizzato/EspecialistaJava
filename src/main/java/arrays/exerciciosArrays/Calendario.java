package arrays.exerciciosArrays;

import java.util.Arrays;

public class Calendario {
    public static final String[] MESES = {"Janeiro", "Fevereiro", "Março", "Abril", "Maio",
            "Junho","Julho","Agosto","Setembro","Outubro","Novembro","Dezembro"};

    public String buscarMes(int mesProcurado){
        if(mesProcurado < 1 || mesProcurado > 12){
            return "mes invalido";
        }
        return MESES[mesProcurado -1];

    }

    public static void main(String[] args) {
        Calendario calendario = new Calendario();
        String resultado = calendario.buscarMes(13);

        System.out.println(resultado);
    }

}

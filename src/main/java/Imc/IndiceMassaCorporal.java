package Imc;

public class IndiceMassaCorporal {

    double resultado;
    double peso;
    double altura;

    public boolean estaComSobrepeso(){
        return resultado >= 25.0 && resultado <=29.9;
    }

    public boolean estaComObesidade(){
        return resultado >= 30;
    }

    public boolean estaNoPesoIdeal(){
        return resultado >= 18.5 && resultado <= 24.9;
    }

    public boolean estaAbaixoDoPeso(){
        return resultado < 18.5;
    }
}


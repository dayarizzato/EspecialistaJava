package bibliotecaJavaDesafio;

public class Geometria {
    public static final double NUMERO_PI = 3.14159265358979323846;

    double comprimento;
    double largura;
    double raio;

    //metodo estatico
    public static Double calcularQuadrado(double comprimento, double largura){
        return comprimento * largura;
    }

    //public double calcQuad(){
    //    return this.largura * this.comprimento;
    //}

    public static Double calcularPi(double raio){
        return NUMERO_PI * (raio * raio);

    }
}

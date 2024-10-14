package bibliotecaJavaDesafio;

public class Principal {

    public static void main(String[] args) {
        Geometria medidaQuadrado = new Geometria();
        //medidaQuadrado.comprimento = 5;
        //medidaQuadrado.largura = 2;

        //metodo estatico
        double resultado = Geometria.calcularQuadrado(10,20);
        double areaCirculo = Geometria.calcularPi(13);

        //double resultado = medidaQuadrado.calcQuad();

        System.out.printf("A área de um quadrado é: %.2f", resultado);
        System.out.printf("A área do círculo é: %.2f", areaCirculo);

    }
}

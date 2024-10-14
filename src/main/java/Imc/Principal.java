package Imc;

public class Principal {
    public static void main(String[] args) {
        CalculadoraIMC calculadoraIMC = new CalculadoraIMC();
        //calculadoraIMC.peso = 49;
        //calculadoraIMC.altura = 1.61;

        Paciente maria = new Paciente();
        maria.peso = 200;
        maria.altura = 1.61;

        IndiceMassaCorporal imc = calculadoraIMC.calcular(maria);

        if(imc.estaComObesidade()){
            System.out.printf("Paciente com peso: %.2f e altura: %.2f está com obesidade. \n",imc.peso, imc.altura );
        } else if (imc.estaAbaixoDoPeso()) {
            System.out.printf("Paciente com peso: %.2f e altura: está com abaixo do peso. \n",imc.peso, imc.altura );
        }else if (imc.estaComSobrepeso()){
            System.out.printf("Paciente com peso: %.2f e altura: está com sobrepeso. \n",imc.peso, imc.altura );
        }else if(imc.estaNoPesoIdeal()){
            System.out.printf("Paciente com peso: %.2f e altura: está com peso ideal. \n",imc.peso, imc.altura );

        }

        System.out.printf("IMC: %.2f.", imc.resultado);
    }

}

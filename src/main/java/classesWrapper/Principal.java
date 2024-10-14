package classesWrapper;

import javax.sound.midi.Soundbank;

public class Principal {
    public static void main(String[] args) {
        Cliente cliente = new Cliente();
        //cliente.tipoCliente = Character.valueOf("ABC");
        cliente.idade = Integer.valueOf(34);
        //converter tipo int em short - wrapper
        Short idade = Short.valueOf(cliente.idade.shortValue());
        //conversao em tipo primitivo
        //short idade = cliente.idade.shortValue();
        cliente.nomeCliente = String.valueOf("José");
        cliente.diasParaEntrega = Integer.valueOf(10);
        cliente.valorFrete = Float.valueOf(10.90f);

        System.out.printf("Idade do cliente: %d anos.%n",cliente.idade);
        System.out.printf("Nome do(a) cliente: %s.%n", cliente.nomeCliente);
        System.out.printf("O prazo para entrega é: %d dias.%n", cliente.diasParaEntrega);
        System.out.printf("O valor do frete é: R$ %.2f.%n", cliente.valorFrete);

    }

}

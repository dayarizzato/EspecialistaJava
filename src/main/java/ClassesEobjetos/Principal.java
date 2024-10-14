package ClassesEobjetos;

public class Principal {
    public static void main(String[] args) {
        Carro carro1 = new Carro();
        carro1.marca = "BMW";
        carro1.modelo = "x6";
        carro1.cor = "Preto";
        carro1.anoFabricacao = 2022;

        //Instaciei uma nova pessoa para fazer o vinculo com a classe Pessoa
        Pessoa pessoa = new Pessoa();
        pessoa.nome = "Dayana";
        pessoa.cpf = "111.222.333-44";
        pessoa.anoNascimento = 1992;
        carro1.proprietario = pessoa;//faz o relacionamento entre as classes

        Carro carro2 = new Carro();
        carro2.marca = "Honda";
        carro2.modelo = "City";
        carro2.cor = "Azul";
        carro2.anoFabricacao = 2024;

        Pessoa pessoa2 = new Pessoa();
        pessoa2.nome = "Diego";
        pessoa2.cpf = "222.333.444-55";
        pessoa2.anoNascimento = 1987;
        carro2.proprietario = pessoa2;

        System.out.printf("Carro 1: %s%n", carro1.modelo);
        System.out.printf("Cor: %s%n", carro1.cor);
        System.out.printf("Marca: %s%n", carro1.marca);
        System.out.printf("Ano: %s%n", carro1.anoFabricacao);
        System.out.printf("Proprietário: %s%n", carro1.proprietario.nome);
        System.out.println();
        System.out.printf("Carro 2: %s%n", carro2.modelo);
        System.out.printf("Cor: %s%n", carro2.cor);
        System.out.printf("Marca: %s%n", carro2.marca);
        System.out.printf("Ano: %s%n", carro2.anoFabricacao);
        System.out.printf("Proprietário: %s%n", carro2.proprietario.nome);
    }
}

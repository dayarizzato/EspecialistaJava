package ExercicioVeterinaria;

public class Principal {
    public static void main(String[] args) {
        Dono dono = new Dono();
        dono.nome = "Pedro";
        dono.endereco = "Rua Luiz Scott";
        dono.telefone = "18-9999-9999";

        Cachorro cachorro1 = new Cachorro();
        cachorro1.nome = "Pitoco";
        cachorro1.raca = "Vira-lata";
        cachorro1.sexo = "Macho";
        cachorro1.idade = 4;
        cachorro1.dono = dono;

        Dono dono2 = new Dono();
        dono2.nome = "Larissa";
        dono2.endereco = "Rua das pipas";
        dono2.telefone = "17-2222-2222";

        Cachorro cachorro2 = new Cachorro();
        cachorro2.nome = "Pipoca";
        cachorro2.raca = "Poodle";
        cachorro2.sexo = "Fêmea";
        cachorro2.idade = 2;
        cachorro2.dono = dono2;



        System.out.printf("Cachorro: %s%n", cachorro1.nome);
        System.out.printf("Raça: %s%n", cachorro1.raca);
        System.out.printf("Sexo: %s%n", cachorro1.sexo);
        System.out.printf("Idade: %s%n", cachorro1.idade);
        System.out.printf("Dono: %s%n", cachorro1.dono.nome);

        System.out.println("-----------------------------------------------------------------------");

        System.out.printf("Cachorro: %s%n", cachorro2.nome);
        System.out.printf("Raça: %s%n", cachorro2.raca);
        System.out.printf("Sexo: %s%n", cachorro2.sexo);
        System.out.printf("Idade: %s%n", cachorro2.idade);
        System.out.printf("Dono: %s%n", cachorro2.dono.nome);

        Dono dono3 = new Dono();
        dono3.nome = "Bruna";
        dono3.endereco = "Rua das alegrias";
        dono3.telefone = "11-2222-3333";

        Gato gato = new Gato();
        gato.nome = "Xanim";
        gato.raca = "Tomba-lata";
        gato.sexo = "Fêmea";
        gato.idade = 2;
        gato.dono = dono3;

        Dono dono4 = new Dono();
        dono4.nome = "Joãozinho";
        dono4.endereco = "Rua do cais";
        dono4.telefone = "13-4433-5566";

        Gato gato2 = new Gato();
        gato2.nome = "Garfield";
        gato2.raca = "Siames";
        gato2.sexo = "Macho";
        gato2.idade = 8;
        gato2.dono = dono4;

        System.out.println("-----------------------------------------------------------------------");

        System.out.printf("Gato: %s%n", gato.nome);
        System.out.printf("Raça: %s%n", gato.raca);
        System.out.printf("Sexo: %s%n", gato.sexo);
        System.out.printf("Idade: %s%n", gato.idade);
        System.out.printf("Dono: %s%n", gato.dono.nome);

        System.out.println("-----------------------------------------------------------------------");

        System.out.printf("Gato: %s%n", gato2.nome);
        System.out.printf("Raça: %s%n", gato2.raca);
        System.out.printf("Sexo: %s%n", gato2.sexo);
        System.out.printf("Idade: %s%n", gato2.idade);
        System.out.printf("Dono: %s%n", gato2.dono.nome);
    }

}

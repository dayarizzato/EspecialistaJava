package aeronave;

public class Principal {
    public static void main(String[] args) {
        Aeronave aviaoGol = new Aeronave();
        aviaoGol.totalAssentos = 100;

        aviaoGol.ativar();
        aviaoGol.inativar();
        aviaoGol.reservarAssentos(10);

        System.out.printf("Total de assento restantes: %.2s. Gol: %s", aviaoGol.calcularAssentos(),
                aviaoGol.ativo ? "Ativo." : "Inativo.");

        Aeronave aviaoLatam = new Aeronave();
        aviaoLatam.totalAssentos = 120;

        aviaoLatam.ativar();
        aviaoLatam.inativar();
        aviaoLatam.reservarAssentos(50);

        System.out.printf("Total de assento restantes: %.2s. Latam: %s", aviaoLatam.calcularAssentos(),
                aviaoLatam.ativo ? "Ativo." : "Inativo.");
    }

}

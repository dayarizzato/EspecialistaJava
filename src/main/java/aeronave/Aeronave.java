package aeronave;

public class Aeronave {
    boolean ativo = false;
    boolean inativo;
    int totalAssentos;
    int totalAssentosReservados;

    public int calcularAssentos(){
        return  totalAssentos - totalAssentosReservados;
    }

    public void reservarAssentos(int numeroAssentos){
        if(ativo){
            totalAssentosReservados += numeroAssentos;
        }else{
            System.out.println("Aeronave desativada. Assentos indisponiveis.");
        }
    }

    public void ativar(){
        ativo = true;
    }

    public void inativar(){
        inativo = false;
    }
}

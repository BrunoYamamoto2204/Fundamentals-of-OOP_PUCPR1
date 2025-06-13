package Semana7.ExFixacao.ExFixacao3;

public class Microondas {
    public void ligar(boolean aberto) throws DoorNotClosedException{
        if (aberto) {
            throw new DoorNotClosedException("Porta do microondas está aberta.");
        }
        System.out.println("Microondas iniciou com sucesso.");
    }

    public static void main(String[] args) {
        System.out.println("-".repeat(40));
        Microondas microondas = new Microondas();

        try {
            microondas.ligar(true);
        } catch (DoorNotClosedException e) {
            e.printStackTrace();
        }

        System.out.println("-".repeat(40));
    }
}

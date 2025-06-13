package Semana5.ExFixacao.ExFixacao_3;

public class Main {
    public static void main(String[] args) {

        System.out.println("-".repeat(40));

        Casa casa = new Casa();
        System.out.println("Noite em uma casa: R$"+casa.precoPorNoite());

        Apartamento ap = new Apartamento();
        System.out.println("Noite em uma apartamento: R$"+ap.precoPorNoite());

        System.out.println("-".repeat(40));
    }
}

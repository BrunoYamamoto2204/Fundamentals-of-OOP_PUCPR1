package Semana6.ExFicacao.ExFixacao_4;

public class Main {
    public static void main(String[] args){
        ViagemPagavel uberX = new ViagemUberX(10);
        ViagemPagavel uberBlack = new ViagemUberBlack(10);

        System.out.printf("Calcular tarifa UberX: R$%.2f\n", uberX.calcularTarifa());
        System.out.printf("Calcular tarifa Uber Black: R$%.2f\n", uberBlack.calcularTarifa());
    }
}

package Semana6.ExFicacao.ExFixacao_4;

public class ViagemUberX implements  ViagemPagavel{
    private double distancia;

    public ViagemUberX(double distancia) {
        this.distancia = distancia;
    }

    public double calcularTarifa() {
        return this.distancia * 1.00;
    }
}

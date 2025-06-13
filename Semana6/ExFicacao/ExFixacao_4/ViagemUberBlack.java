package Semana6.ExFicacao.ExFixacao_4;

public class ViagemUberBlack implements ViagemPagavel{
    private double distancia;

    public ViagemUberBlack(double distancia) {
        this.distancia = distancia;
    }

    public double calcularTarifa() {
        return this.distancia * 1.50;
    }
}

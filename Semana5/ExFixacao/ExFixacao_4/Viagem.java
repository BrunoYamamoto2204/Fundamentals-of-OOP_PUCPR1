package Semana5.ExFixacao.ExFixacao_4;

public class Viagem {

    double precoNormal = 4.0;
    double precoMovimento = 5.0;

    protected double distancia;

    public Viagem (double distancia) {
        this.distancia = distancia;
    }

    public double calcularPreco () {
        return precoNormal * distancia;
    }
    public double calcularPreco (boolean movimento) {
        return precoMovimento * distancia;
    }
}

package Semana7.FormativaSemana7.src.modelo;

public class Apartamento extends Financiamento {

    private int numeroVagas;
    private int numeroAndar;

    public Apartamento(double valorImovel, int prazoFinanciamento, double taxaJurosAnual, int numeroVagas, int numeroAndar) {
        super(valorImovel, prazoFinanciamento, taxaJurosAnual);
        this.numeroVagas = numeroVagas;
        this.numeroAndar = numeroAndar;
    }

    public double pagamentoMensal(){
        double taxaMensal = (getTaxaJurosAnual()/100) / 12;
        int meses = getPrazoFinanciamento() * 12;

        return (getValorImovel() * taxaMensal * Math.pow(1 + taxaMensal, meses)) /
           (Math.pow(1 + taxaMensal, meses) - 1);
    }

    // Temporário
    public void info(){
        System.out.println("Vagas: " + numeroVagas);
        System.out.println("Nº Andar: " + numeroAndar);
    }
}

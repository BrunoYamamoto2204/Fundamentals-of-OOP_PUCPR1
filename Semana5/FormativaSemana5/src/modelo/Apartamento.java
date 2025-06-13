package Semana5.FormativaSemana5.src.modelo;

public class Apartamento extends Financiamento{

    public Apartamento(double valorImovel, int prazoFinanciamento, double taxaJurosAnual) {
        super(valorImovel, prazoFinanciamento, taxaJurosAnual);
    }

    public double pagamentoMensal(){
        double taxaMensal = (getTaxaJurosAnual()/100) / 12;
        int meses = getPrazoFinanciamento() * 12;

        return (getValorImovel() * taxaMensal * Math.pow(1 + taxaMensal, meses)) /
           (Math.pow(1 + taxaMensal, meses) - 1);
    }
}

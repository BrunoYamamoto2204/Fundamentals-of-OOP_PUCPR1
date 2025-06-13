package Somativa2_Semana8.src.modelo;

import Somativa2_Semana8.src.modelo.Financiamento;

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

    public void info(){
        System.out.println("Vagas: " + numeroVagas);
        System.out.println("Nº Andar: " + numeroAndar);
    }

    public String toString(){
        StringBuilder sb = new StringBuilder();

        sb.append("Valor do apartamento: " + String.format("%.2f", this.getValorImovel()) + "\n");
        sb.append("Valor do pagamento: " + String.format("%.2f", this.totalPagamento()) + "\n");
        sb.append("Valor dos juros(%): " + String.format("%.2f", this.getTaxaJurosAnual()) + "\n");
        sb.append("Valor do Prazo(Anos): " + this.getPrazoFinanciamento() + "\n");

        sb.append("Número de vagas: " + numeroVagas + "\n");
        sb.append("Número do apartamento: " + numeroAndar + "\n");

        return sb.toString();
    }
}

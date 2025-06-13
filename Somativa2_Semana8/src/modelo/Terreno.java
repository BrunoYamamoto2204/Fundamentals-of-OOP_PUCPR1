package Somativa2_Semana8.src.modelo;

import Somativa2_Semana8.src.modelo.Financiamento;

public class Terreno extends Financiamento {

    private String zona;

    public Terreno(double valorImovel, int prazoFinanciamento, double taxaJurosAnual, String zona) {
        super(valorImovel, prazoFinanciamento, taxaJurosAnual);
        this.zona = zona;
    }

    public double pagamentoMensal(){
        double base = (getValorImovel() / (getPrazoFinanciamento() * 12)) * (1 + ((getTaxaJurosAnual()/ 100.0) / 12));
        return base + (base * 0.02);
    }

    public void info(){
        System.out.println("Tipo zona: " + zona);
    }

    public String toString(){
        StringBuilder sb = new StringBuilder();

        sb.append("Valor do terreno: " + String.format("%.2f", this.getValorImovel()) + "\n");
        sb.append("Valor do pagamento: " + String.format("%.2f", this.totalPagamento()) + "\n");
        sb.append("Valor dos juros(%): " + String.format("%.2f", this.getTaxaJurosAnual()) + "\n");
        sb.append("Valor do Prazo(Anos): " + this.getPrazoFinanciamento() + "\n");

        sb.append("Tipo da zona: " + zona + "\n");

        return sb.toString();
    }
}

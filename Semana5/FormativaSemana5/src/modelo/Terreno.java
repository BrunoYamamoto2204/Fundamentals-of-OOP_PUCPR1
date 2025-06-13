package Semana5.FormativaSemana5.src.modelo;

public class Terreno extends Financiamento{

    public Terreno(double valorImovel, int prazoFinanciamento, double taxaJurosAnual) {
        super(valorImovel, prazoFinanciamento, taxaJurosAnual);
    }

    public double pagamentoMensal(){
        return super.pagamentoMensal() + (super.pagamentoMensal() * 0.02);
    }
}

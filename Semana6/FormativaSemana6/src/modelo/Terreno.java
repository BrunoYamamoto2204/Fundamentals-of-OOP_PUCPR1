package Semana6.FormativaSemana6.src.modelo;

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

    // Temporário
    public void info(){
        System.out.println("Tipo zona: " + zona);
    }
}

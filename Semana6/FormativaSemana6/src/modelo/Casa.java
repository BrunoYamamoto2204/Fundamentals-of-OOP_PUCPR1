package Semana6.FormativaSemana6.src.modelo;

public class Casa extends Financiamento {

    private double areaConstruida;
    private double tamanhoTerreno;

    public Casa(double valorImovel, int prazoFinanciamento, double taxaJurosAnual, double areaConstruida, double tamanhoTerreno) {
        super(valorImovel, prazoFinanciamento, taxaJurosAnual);
        this.areaConstruida = areaConstruida;
        this.tamanhoTerreno = tamanhoTerreno;
    }

    public double pagamentoMensal(){
        double base = (getValorImovel() / (getPrazoFinanciamento() * 12)) * (1 + ((getTaxaJurosAnual()/ 100.0) / 12));
        return base + 80;
    }

    // Temporário
    public void info(){
        System.out.println("Área Construida: " + areaConstruida);
        System.out.println("Tamanho Terreno: " + tamanhoTerreno);
    }
}

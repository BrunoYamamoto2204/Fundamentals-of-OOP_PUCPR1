package Semana7.FormativaSemana7.src.modelo;

public class Casa extends Financiamento {

    private double areaConstruida;
    private double tamanhoTerreno;

    public Casa(double valorImovel, int prazoFinanciamento, double taxaJurosAnual, double areaConstruida, double tamanhoTerreno) {
        super(valorImovel, prazoFinanciamento, taxaJurosAnual);
        this.areaConstruida = areaConstruida;
        this.tamanhoTerreno = tamanhoTerreno;
    }

    public void validarJurosMensais(double jurosMensal,double acrescimo) throws AumentoMaiorDoQueJurosException{

        if (acrescimo > jurosMensal / 2){
            throw new AumentoMaiorDoQueJurosException("AVISO: O aumento de R$80 é maior do que metade dos juros mensais da casa! Acréscimo ajustado p/ valor dos juros");
        }
    }

    public double pagamentoMensal() {

        double jurosMensal = getValorImovel() / (getPrazoFinanciamento() * 12) * ((getTaxaJurosAnual()/ 100.0) / 12);
        double acrescimo = 80;

        try{
            validarJurosMensais(jurosMensal, acrescimo);
        } catch (AumentoMaiorDoQueJurosException e){
            System.out.println(e.getMessage());
            acrescimo = jurosMensal;
        }

        double base = (getValorImovel() / (getPrazoFinanciamento() * 12)) * (1 + ((getTaxaJurosAnual()/ 100.0) / 12));
        return base + acrescimo;
    }

    // Temporário
    public void info(){
        System.out.println("Área Construida: " + areaConstruida);
        System.out.println("Tamanho Terreno: " + tamanhoTerreno);
    }
}

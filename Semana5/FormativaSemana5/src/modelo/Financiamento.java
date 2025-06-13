package Semana5.FormativaSemana5.src.modelo;

public class Financiamento
{
    // Atributos
    private double valorImovel;
    private int prazoFinanciamento; // Em anos
    private double taxaJurosAnual;

    // Construtores
    public Financiamento(double valorImovel, int prazoFinanciamento, double taxaJurosAnual){
        this.valorImovel = valorImovel;
        this.prazoFinanciamento = prazoFinanciamento;
        this.taxaJurosAnual = taxaJurosAnual;
    }

    // Método - get
    public double getValorImovel(){
        return this.valorImovel;
    }
    public int getPrazoFinanciamento(){
        return this.prazoFinanciamento;
    }
    public double getTaxaJurosAnual(){
        return this.taxaJurosAnual;
    }

    // Métodos
    public double pagamentoMensal(){
        return (this.valorImovel / (this.prazoFinanciamento * 12)) * (1 + ((this.taxaJurosAnual/ 100.0) / 12));
    }

    public double totalPagamento(){
        return pagamentoMensal() * this.prazoFinanciamento * 12;
    }

    public void visualizarDados(){
        System.out.println("-".repeat(40));
//        System.out.printf("Período do financiamento (anos): %d", this.prazoFinanciamento);
        System.out.printf("Valor mensal do financiamento: R$%.2f", pagamentoMensal());
        System.out.printf("\nValor do imóvel: R$%.2f", this.valorImovel);
        System.out.printf("\nValor total do financiamento (Juros anual: %.1f%%): R$%.2f", this.taxaJurosAnual,totalPagamento());
        System.out.println();
        System.out.println("-".repeat(40));
    }
}

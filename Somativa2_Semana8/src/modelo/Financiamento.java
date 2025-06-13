package Somativa2_Semana8.src.modelo;

import javax.swing.*;
import java.io.*;
import java.util.ArrayList;

public abstract class Financiamento implements Serializable {
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
    public abstract double pagamentoMensal();

    public double totalPagamento(){
        return pagamentoMensal() * this.prazoFinanciamento * 12;
    }

    public void visualizarDados(double pagamento){
        System.out.println("-".repeat(40));

        double total = pagamento * getPrazoFinanciamento() * 12;

        System.out.printf("Valor mensal do financiamento: R$%.2f", pagamento);
        System.out.printf("\nValor do imóvel: R$%.2f", getValorImovel());
        System.out.printf("\nValor total do financiamento (Juros anual: %.1f%%): R$%.2f", getTaxaJurosAnual(),total);
        System.out.println();
        System.out.println("-".repeat(40));
    }

    public abstract void info();

    public abstract String toString();

}

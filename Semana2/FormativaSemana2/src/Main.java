package Semana2.FormativaSemana2.src;

import java.util.Scanner;

class Financiamento
{
    // Atributos
    public double valorImovel;
    public int prazoFinanciamento; // Em anos
    public double taxaJurosAnual;

    // Construtores
    public Financiamento(double valorImovel, int prazoFinanciamento, double taxaJurosAnual){
        this.valorImovel = valorImovel;
        this.prazoFinanciamento = prazoFinanciamento;
        this.taxaJurosAnual =taxaJurosAnual;
    }

    // Métodos
    public double pagamentoMensal(){
        return (this.valorImovel / (this.prazoFinanciamento * 12)) * (1 + ((this.taxaJurosAnual/ 100.0) / 12));
    }

    public double totalPagamento(){
        return pagamentoMensal() * this.prazoFinanciamento * 12;
    }
}

class InterfaceUsuario
{
    Scanner sc = new Scanner(System.in);

    // Métodos
    public float digitarValorImovel(){
        System.out.print("Informe o valor do imóvel: R$");
        float valor = sc.nextFloat();

        return valor;
    }

    public int digitarPrazoFinanciamento(){
        System.out.print("Informe o prazo do financiamento (em anos): ");
        int financiamento = sc.nextInt();

        return financiamento;
    }

    public float digitarTaxaJurosAnual(){
        System.out.print("Informe a taxa de juros anual: ");
        float taxa = sc.nextFloat();

        return taxa;
    }
}

public class Main
{
    public static void main(String[] args)
    {
        InterfaceUsuario usuario = new InterfaceUsuario();
        double valor = usuario.digitarValorImovel();
        int prazo = usuario.digitarPrazoFinanciamento();
        float taxa = usuario.digitarTaxaJurosAnual();

        Financiamento financiamento = new Financiamento(valor, prazo, taxa);
        System.out.print(financiamento.pagamentoMensal());
    }
}
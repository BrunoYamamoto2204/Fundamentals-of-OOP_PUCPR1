package Semana6.FormativaSemana6.src.main;

import Semana6.FormativaSemana6.src.modelo.*;
import Semana6.FormativaSemana6.src.util.InterfaceUsuario;

import java.util.ArrayList;
import java.util.Scanner;

public class Main
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);

        InterfaceUsuario usuario = new InterfaceUsuario();
        ArrayList<Financiamento> listaDeFinanciamentos = new ArrayList<Financiamento>();

        System.out.println("=".repeat(20)+" Financiamento "+"=".repeat(20));

        // Padrão
        System.out.println("=".repeat(5)+" Geral "+"=".repeat(5));
        double valor = usuario.digitarValorImovel();
        int prazo = usuario.digitarPrazoFinanciamento();
        float taxa = usuario.digitarTaxaJurosAnual();

        // Casa
        System.out.println("=".repeat(5)+" Casa "+"=".repeat(5));
        System.out.print("\nÁrea do terreno(m²): ");
        double terreno = sc.nextDouble();
        System.out.print("\nÁrea do area construida(m²): ");
        double construido = sc.nextDouble();

        listaDeFinanciamentos.add(new Casa(valor, prazo, taxa,construido,terreno));

        // Apartamento
        System.out.println("=".repeat(5)+" Apartamento "+"=".repeat(5));
        System.out.print("\nNúmero de Vagas: ");
        int vagas = sc.nextInt();
        System.out.print("\nNúmero do Apartamento: ");
        int numApartamento = sc.nextInt();
        sc.nextLine();

        listaDeFinanciamentos.add(new Apartamento(valor, prazo, taxa, vagas, numApartamento));

        // Terreno
        System.out.println("=".repeat(5)+" Terreno "+"=".repeat(5));
        System.out.print("\nTipo de zona(Residencial | Comercial): ");
        String zona = sc.nextLine();

        listaDeFinanciamentos.add(new Terreno(valor, prazo, taxa,zona));

        System.out.println("=".repeat(55));

        System.out.println("\n"+"-".repeat(20)+" Dados do financiamento "+"-".repeat(20));
        System.out.println();

        // Visualizando os financiamentos
        double totalImovel = 0;
        double totalFinanciamento = 0;

        int numFinanciamento = 1;
        for (Financiamento financiamento : listaDeFinanciamentos){
            System.out.println("Financiamento "+numFinanciamento);
            financiamento.visualizarDados();
            financiamento.info();

            numFinanciamento += 1;
            totalImovel += financiamento.getValorImovel();
            totalFinanciamento += financiamento.totalPagamento();

            System.out.println();
        }

        System.out.println("=".repeat(20)+" Resultado "+"=".repeat(20));
        System.out.printf("Total de todos os imóveis: R$%.2f",totalImovel);
        System.out.printf("\nTotal de todos os financiamento: R$%.2f",totalFinanciamento);
        System.out.print("\n"+"=".repeat(51));

    }
}
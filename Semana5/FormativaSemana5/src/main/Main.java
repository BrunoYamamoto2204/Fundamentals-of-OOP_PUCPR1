package Semana5.FormativaSemana5.src.main;

import Semana5.FormativaSemana5.src.modelo.*;
import Semana5.FormativaSemana5.src.util.InterfaceUsuario;

import java.util.ArrayList;

public class Main
{
    public static void main(String[] args)
    {
        InterfaceUsuario usuario = new InterfaceUsuario();
        ArrayList<Financiamento> listaDeFinanciamentos = new ArrayList<Financiamento>();

        System.out.println("=".repeat(20)+" Financiamento "+"=".repeat(20));

        // Casas
        double valor = usuario.digitarValorImovel();
        int prazo = usuario.digitarPrazoFinanciamento();
        float taxa = usuario.digitarTaxaJurosAnual();
        listaDeFinanciamentos.add(new Casa(valor, prazo, taxa));
        listaDeFinanciamentos.add(new Casa(500000, 12, 10));

        // Apartamento
        listaDeFinanciamentos.add(new Apartamento(500000, 10, 10));
        listaDeFinanciamentos.add(new Apartamento(1000000, 20, 10));

        // Terreno
        listaDeFinanciamentos.add(new Terreno(500000, 10, 10));

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
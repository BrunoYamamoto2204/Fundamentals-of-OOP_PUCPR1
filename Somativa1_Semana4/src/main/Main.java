package Somativa1_Semana4.src.main;

import Somativa1_Semana4.src.modelo.Financiamento;
import Somativa1_Semana4.src.util.InterfaceUsuario;

import java.util.ArrayList;

public class Main
{
    public static void main(String[] args)
    {
        ArrayList<Financiamento> listaDeFinanciamentos = new ArrayList<Financiamento>();
        InterfaceUsuario usuario = new InterfaceUsuario();

        // Criando os financiamentos
        System.out.println("-".repeat(20)+" Adicionando financiamento "+"-".repeat(20));
        System.out.println();

        for (int i = 1; i <= 4; i++){
            System.out.println("=".repeat(20)+" Financiamento "+"=".repeat(20));


            double valor = usuario.digitarValorImovel();
            int prazo = usuario.digitarPrazoFinanciamento();
            float taxa = usuario.digitarTaxaJurosAnual();
            Financiamento financiamento = new Financiamento(valor, prazo, taxa);

            System.out.println("=".repeat(55));
            System.out.println();

            listaDeFinanciamentos.add(financiamento);
        }

        // Mostrar os dados dos financiamentos
        System.out.println("-".repeat(20)+" Dados do financiamento "+"-".repeat(20));
        System.out.println();

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
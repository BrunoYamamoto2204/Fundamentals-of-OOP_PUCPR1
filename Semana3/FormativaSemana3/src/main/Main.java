package Semana3.FormativaSemana3.src.main;

import Semana3.FormativaSemana3.src.modelo.Financiamento;
import Semana3.FormativaSemana3.src.util.InterfaceUsuario;

public class Main
{
    public static void main(String[] args)
    {
        InterfaceUsuario usuario = new InterfaceUsuario();

        double valor = usuario.digitarValorImovel();
        int prazo = usuario.digitarPrazoFinanciamento();
        float taxa = usuario.digitarTaxaJurosAnual();

        Financiamento financiamento = new Financiamento(valor, prazo, taxa);
        financiamento.visualizarDados();
    }
}
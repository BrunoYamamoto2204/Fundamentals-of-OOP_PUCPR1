package Semana6.FormativaSemana6.src.util;

import java.util.Scanner;

public class InterfaceUsuario
{
    Scanner sc = new Scanner(System.in);

    // Métodos
    public float digitarValorImovel(){
        System.out.print("Informe o valor do imóvel: R$");
        float valor = sc.nextFloat();

        while(true)
        {
            if (valor > 0) {
                return valor;
            } else {
                System.out.print("[-] Inválido! Número negativo não é permitido.\n");
                System.out.print("\nInforme novamente o valor do imóvel: R$");
                valor = sc.nextInt();
            }
        }
    }

    public int digitarPrazoFinanciamento(){
        System.out.print("\nInforme o prazo do financiamento (em anos): ");
        int financiamento = sc.nextInt();

        while(true)
        {
            if (financiamento > 0 && financiamento < 35) {
                return financiamento;
            }
            else {
                System.out.print("[-] Inválido! Valor negativo ou muito grande.\n");
                System.out.print("\nInforme novamente o prazo do financiamento (em anos): ");
                financiamento = sc.nextInt();
            }
        }
    }

    public float digitarTaxaJurosAnual(){
        System.out.print("\nInforme a taxa de juros anual: ");
        float taxa = sc.nextFloat();

        while (true)
        {
            if (taxa > 0 && taxa <= 50) {
                return taxa;
            }
            else {
                System.out.print("[-] Inválido! Valor negativo ou muito grande.\n");
                System.out.print("\nInforme novamente a taxa de juros anual: ");
                taxa = sc.nextFloat();
            }
        }
    }

}

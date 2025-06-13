package Semana7.FormativaSemana7.src.util;

import java.util.Scanner;

public class InterfaceUsuario
{
    Scanner sc = new Scanner(System.in);

    // Métodos
   public float digitarValorImovel() {
       while (true) {
           try {
               System.out.print("Informe o valor do imóvel: R$");
               float valor = Float.parseFloat(sc.nextLine());

               if (valor <= 0) {
                   System.out.println("[-] Valor deve ser maior que 0.\n");
               } else {
                   return valor;
               }
           } catch (Exception e) {
               System.out.println("[-] Valor inválido.\n");
           }
       }
   }

    public int digitarPrazoFinanciamento(){
        while(true)
        {
            try {
                System.out.print("\nInforme o prazo do financiamento (em anos): ");
                int financiamento = Integer.parseInt(sc.nextLine());

                if (financiamento > 0 && financiamento < 35) {
                    return financiamento;
                } else {
                    System.out.print("[-] Inválido! Valor negativo ou muito grande.\n");
                }
            } catch (Exception e){
                System.out.println("[-] Valor inválido.");
            }
        }
    }

    public float digitarTaxaJurosAnual(){
        while (true)
        {
            try {
                System.out.print("\nInforme a taxa de juros anual: ");
                float taxa = Float.parseFloat(sc.nextLine());

                if (taxa > 0 && taxa <= 50) {
                    return taxa;
                } else {
                    System.out.print("[-] Inválido! Valor negativo ou muito grande.\n");
                }
            } catch (Exception e){
                System.out.println("[-] Valor inválido.");
            }
        }
    }
}

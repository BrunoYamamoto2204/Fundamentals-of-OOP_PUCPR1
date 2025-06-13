
package Semana1;

import java.util.Scanner;

public class ExFixacao_8
{
    public static void main(String[] args)
    {
        System.out.println("-".repeat(40));
        Scanner sc = new Scanner(System.in);

        System.out.print("Digte um número: ");
        int n = sc.nextInt();

        for (int i = 1; i <= n; i++){
           for (int i2 = 1; i2 <= i; i2++) {
               System.out.print("*");
           }

           // Não pula espaço no último
           if (i == n){
               break;
           }
           else{
               System.out.println();
           }
        }

        System.out.println();
        System.out.println("-".repeat(40));
    }
}

package Semana1;

import java.util.Scanner;

public class ExFixacao_5
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);

        System.out.println("-".repeat(40));

        System.out.print("Digite um ano: ");
        int ano = sc.nextInt();

        if (ano % 4 == 0 && ano % 100 != 0){
            System.out.printf("%d é um ano bissexto",ano);
        }
        else if (ano % 4 == 0 && ano % 100 == 0 && ano % 400 == 0){
            System.out.printf("%d é um ano bissexto",ano);
        }
        else{
            System.out.printf("%d não é um ano bissexto",ano);
        }

        System.out.println();
        System.out.println("-".repeat(40));
    }
}

package Semana1;

import java.util.Scanner;

public class ExFixacao_2
{
    public static void main(String[] args)
    {
        System.out.println("-".repeat(40));

        Scanner sc = new Scanner(System.in);

        System.out.print("Digite um número: ");
        int num = sc.nextInt();

        if (num < 0)
        {
            System.out.print("O número é negativo");
        }
        else if (num == 0)
        {
            System.out.print("O número é 0");
        }
        else
        {
            System.out.print("O número é positivo");
        }

        System.out.println();
        System.out.println("-".repeat(40));
    }
}

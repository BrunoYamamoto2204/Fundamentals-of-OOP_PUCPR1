package Semana1;

import java.util.Scanner;
import java.util.Locale;

public class ExFixacao_1
{
    public static void main(String[] args)
    {
        System.out.println("-".repeat(40));

        Locale.setDefault(new Locale("en"));
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite 3 números decimais: ");
        System.out.print("Número 1: ");
        double n1 = scanner.nextDouble();

        System.out.print("Número 1: ");
        double n2 = scanner.nextDouble();

        System.out.print("Número 1: ");
        double n3 = scanner.nextDouble();

        double media = (n1+n2+n3) / 3;
        System.out.printf("Média: %.2f",media);

        System.out.println();
        System.out.println("-".repeat(40));
    }
}

package Semana1;

import java.util.Locale;
import java.util.Scanner;

public class ExFixacao_7
{
    public static void main(String[] args)
    {
        Locale.setDefault(new Locale("en"));
        Scanner sc = new Scanner(System.in);

        System.out.println("-".repeat(40));

        System.out.print("Temperatura em Celsius(°C): ");
        double cels = sc.nextDouble();
        double fah = 1.8 * cels + 32;

        if (fah < 32){
            System.out.printf("%.1f°F: Está frio", fah);
        }
        else if (fah >= 32 && fah <= 80){
            System.out.printf("%.1f°F: Está moderado", fah);
        }
        else {
            System.out.printf("%.1f°F: Está quente", fah);
        }

        System.out.println();
        System.out.println("-".repeat(40));
    }
}

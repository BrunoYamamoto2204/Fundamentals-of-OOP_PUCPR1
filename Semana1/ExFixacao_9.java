package Semana1;

import java.util.Scanner;

public class ExFixacao_9 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("-".repeat(40));

        String[] unidadesRomanas = {"", "I", "II", "III", "IV", "V", "VI", "VII", "VIII", "IX"};
        String[] dezenasRomanas = {"", "X", "XX", "XXX", "XL", "L", "LX", "LXX", "LXXX", "XC"};
        String[] centenasRomanas = {"", "C", "CC", "CCC", "CD", "D", "DC", "DCC", "DCCC", "CM"};
        String[] milharesRomanas = {"", "M", "MM", "MMM"};

        System.out.print("Digite um número inteiro entre 1 e 4000: ");
        int numero = scanner.nextInt();

        if (numero < 1 || numero > 4000) {
            System.out.println("Número inválido. Por favor, tente novamente.");
        } else {
            String unidades = unidadesRomanas[numero % 10];
            String dezenas = dezenasRomanas[(numero / 10) % 10];
            String centenas = centenasRomanas[(numero / 100) % 10];
            String milhares = milharesRomanas[(numero / 1000) % 10];

            String numeroRomano = milhares + centenas + dezenas + unidades;
            System.out.println("Número romano equivalente: " + numeroRomano);
        }

        System.out.println();
        System.out.println("-".repeat(40));
    }
}
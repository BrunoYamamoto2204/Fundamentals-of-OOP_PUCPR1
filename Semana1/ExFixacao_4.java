package Semana1;
import java.util.Scanner;

public class ExFixacao_4
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);

        System.out.println("-".repeat(40));

        System.out.print("Digite um número: ");
        int num = sc.nextInt();

        System.out.println("Tabuada: ");
        for (int c = 1; c < 11; c++){
            System.out.print(num * c + " ");
        }

        System.out.println();
        System.out.println("-".repeat(40));
    }
}

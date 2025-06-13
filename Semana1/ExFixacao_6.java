package Semana1;

import java.util.Scanner;

public class ExFixacao_6
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);

        System.out.println("-".repeat(40));

        System.out.print("Digite um número: ");
        int num = sc.nextInt();

        boolean primo = true;

        if (num == 1){
            System.out.print("1 não é primo");
        }
        else{
            for (int i = 2; i < num; i++) {
                if (num % i == 0) {
                    primo = false;
                    break;
                }
            }
        }

        if (primo){
            System.out.printf("%d é primo",num);
        }
        else{
            System.out.printf("%d não é primo",num);
        }

        System.out.println();
        System.out.println("-".repeat(40));
    }
}

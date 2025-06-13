package Semana1;

public class ExFixacao_3 {
    public static void main(String[] args)
    {
        System.out.println("-".repeat(40));

        int n = 0;
        do{
            if (n % 3 == 0){
                System.out.println(n);
            }
            n += 3;
        } while (n <= 30);

        System.out.println();
        System.out.println("-".repeat(40));
    }
}

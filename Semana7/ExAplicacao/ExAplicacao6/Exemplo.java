package Semana7.ExAplicacao.ExAplicacao6;

public class Exemplo {
    static int realizarConta(int x, int y) {
        return y / x;
    }

    public static void main(String[] args) {
        try {
            int z = realizarConta(0, 10);
            System.out.println(z);
        } catch (ArithmeticException e) {
            System.out.println("Mostrando o getMessage(): ");
            System.out.println(e.getMessage());

            System.out.println("\nMostrando o getCause(): ");
            System.out.println(e.getCause());

            System.out.println("\nMostrando o printStackTrace(): ");
            e.printStackTrace();
        }
    }
}


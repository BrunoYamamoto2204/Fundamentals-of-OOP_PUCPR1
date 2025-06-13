package Semana7.ExAplicacao.ExAplicacao2;

public class Exemplo {
    static int realizarConta(int x, int y) {
        return y / x;
    }

    public static void main(String[] args) {
        try {
            int z = realizarConta(0, 10);
            System.out.println(z);
        } catch (ArithmeticException e) {
            System.out.println("Divisão por zero");
        }
        System.out.println("FIM");
    }
}
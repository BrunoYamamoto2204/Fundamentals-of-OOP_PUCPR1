package Semana6.ExAplicacao.ExAplicacao4;

public class Circulo extends Forma implements Imprimivel{

    private static final double PI = 3.1415;
    protected double raio;

    public Circulo(double raio) {
        this.raio = raio;
    }

    public double getRaio() {
        return raio;
    }

    @Override
    public double getArea() {
        return Math.pow(PI * raio, 2);
    }
    public double getPerimetro() {
        return 2 * PI * raio;
    }

    public void imprimir() {
        System.out.printf("Perímetro: %.2f", getPerimetro());
        System.out.printf("Área: %.2f", getArea());
    }
}

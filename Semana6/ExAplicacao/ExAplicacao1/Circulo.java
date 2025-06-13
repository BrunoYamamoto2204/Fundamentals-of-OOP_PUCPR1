package Semana6.ExAplicacao.ExAplicacao1;

public class Circulo extends Forma{
    private static final double PI = 3.1415;
    public double raio;

    public Circulo(double raio) {
        this.raio = raio;
    }

    public double getRaio() {
        return this.raio;
    }

    @Override
    public double getArea() {
        return 2 * this.PI * this.raio;
    }

    public double getPerimetro() {
        return Math.pow(PI * this.raio, 2);
    }
}

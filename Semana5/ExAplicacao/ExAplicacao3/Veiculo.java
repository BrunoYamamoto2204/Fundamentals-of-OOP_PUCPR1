package Semana5.ExAplicacao.ExAplicacao3;

public class Veiculo {
    protected String marca;
    String motor;

    public Veiculo(String marca, String motor) {
        this.marca = marca;
        this.motor = motor;
    }

    public String getMarca() {
        return marca;
    }

    public String getMotor() {
        return motor;
    }
}

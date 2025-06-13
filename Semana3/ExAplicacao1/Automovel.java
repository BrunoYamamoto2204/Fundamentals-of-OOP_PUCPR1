package Semana3.ExAplicacao1;

public class Automovel {
    public String marca;
    protected String modelo;
    private String placa;

    public Automovel(String marca, String modelo, String placa) {
        this.marca = marca;
        this.modelo = modelo;
        this.placa = placa;
    }

    public String getPlaca() {
        return this.placa;
    }
}
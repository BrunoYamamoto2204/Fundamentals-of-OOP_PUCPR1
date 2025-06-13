package Semana6.ExAplicacao.ExAplicacao3;

public abstract class Funcionario {

    protected double salarioBase;

    public Funcionario(double salarioBase) {
        this.salarioBase = salarioBase;
    }

    public double getSalarioBase() {
        return this.salarioBase + getGratificacao();
    }
    protected abstract double getGratificacao();
}

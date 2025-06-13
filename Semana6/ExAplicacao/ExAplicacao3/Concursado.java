package Semana6.ExAplicacao.ExAplicacao3;

public class Concursado extends Funcionario{

    public int anosTrabalhando;

    public Concursado(double salarioBase, int anosTrabalhando) {
        super(salarioBase);
        this.anosTrabalhando = anosTrabalhando;
    }

    @Override
    public double getGratificacao() {
       int anos = this.anosTrabalhando / 5;
       return (this.salarioBase * 0.02) * anos;
    }
}

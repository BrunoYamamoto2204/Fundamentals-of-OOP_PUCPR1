package Semana6.ExAplicacao.ExAplicacao3;

public class Temporario extends Funcionario{
    public int mesesContrato;

    public Temporario(double salarioBase, int mesesContrato) {
        super(salarioBase);
        this.mesesContrato = mesesContrato;
    }

    @Override
    public double getGratificacao() {
        return 100 * this.mesesContrato;
    }
}

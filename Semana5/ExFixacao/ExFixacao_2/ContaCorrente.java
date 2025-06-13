package Semana5.ExFixacao.ExFixacao_2;

public class ContaCorrente extends ContaBancaria{

    private double limiteDeCredito;

    public ContaCorrente (String numeroDaConta, double saldo, double limiteDeCredito) {
        super(numeroDaConta, saldo);
        this.limiteDeCredito = limiteDeCredito;
    }

    public void sacar(double valor) {
        if (valor > saldo + limiteDeCredito) {
            System.out.println("Saldo insuficiente para saque.");
        } else {
            this.saldo -= valor;
        }
    }

    public double getLimiteDeCredito () {
        return this.limiteDeCredito;
    }
}

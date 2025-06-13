package Semana5.ExFixacao.ExFixacao_2;

public class ContaBancaria {

    private String numeroDaConta;
    protected double saldo;

    public ContaBancaria (String numeroDaConta, double saldo) {
        this.numeroDaConta = numeroDaConta;
        this.saldo = saldo;
    }

    public String getNumeroDaConta () {
        return this.numeroDaConta;
    }

    public void saque (double valor) {
        if (valor > saldo) {
            System.out.print("Saldo insuficiente!");
        }
        else {
            this.saldo -= valor;
        }
    }

    public void deposito (double valor) {
        if (valor < 0) {
           System.out.print("Valor Inválido!");
        }
        else {
            this.saldo += valor;
        }
    }

}

package Semana7.ExAplicacao.ExAplicacao9;

public class ContaCorrente {
    protected double saldo;

    public ContaCorrente(double saldo){
        this.saldo = saldo;
    }

    public void retirar(double valor) throws ContaCorrenteException{
        if (saldo <= valor){
            throw new SaldoIsuficienteException(String.format("Saldo R$%.2f insuficiente para sacar R$%.2f ",saldo,valor));
        }
        else {
            saldo -= valor;
        }
    }

    public double getSaldo(){
        return saldo;
    }
}

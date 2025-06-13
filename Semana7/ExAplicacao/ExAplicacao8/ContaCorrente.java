package Semana7.ExAplicacao.ExAplicacao8;

public class ContaCorrente {
    private double saldo;

    public ContaCorrente(double saldo){
        this.saldo = saldo;
    }

    public void sacar(double valor) throws SaldoInsuficienteException {
        if (saldo - valor <= 0) {
            throw new SaldoInsuficienteException(String.format(
                    "O saldo %.2f é insuficiente para sacar o valor %.2f",
                    saldo, valor)
            );
        }
        this.saldo -= valor;
    }

    public static void main(String[] args) {
        ContaCorrente conta = new ContaCorrente(100);

        try{
            conta.sacar(200);
        } catch(SaldoInsuficienteException e){
            System.out.println("Deu um erro, hein.");
        }
    }
}

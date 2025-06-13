package Semana5.ExFixacao.ExFixacao_2;

public class Main {
    public static void main(String[] args) {

        System.out.println("-".repeat(40));

        ContaCorrente conta = new ContaCorrente("12345-6", 1000, 500);
        System.out.println("Saldo inicial: " + conta.saldo);
        System.out.println("Limite de crédito: " + conta.getLimiteDeCredito());
        System.out.println();

        double deposito = 500.0;
        double saque = 1500.0;

        System.out.println("Depositando: " + deposito);
        conta.deposito(deposito);
        System.out.println("Saldo após depósito: " + conta.saldo);
        System.out.println();

        System.out.println("Sacando: " + saque);
        conta.sacar(saque);
        System.out.println("Saldo após saque: " + conta.saldo);
        System.out.println();

        System.out.println("Sacando: " + saque);
        conta.sacar(saque);
        System.out.println("Saldo após saque exceder o limite: " + conta.saldo);
        System.out.println();

        System.out.print("-".repeat(40));
    }
}

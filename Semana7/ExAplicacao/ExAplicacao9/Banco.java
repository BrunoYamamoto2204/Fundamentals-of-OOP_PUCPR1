package Semana7.ExAplicacao.ExAplicacao9;

public class Banco {
    // Método só serve para usar o método de retirar da ContaCorrente
    private static void sacar(ContaCorrente conta, double valor) throws ContaCorrenteException {
        conta.retirar(valor);
    }

    public static void main(String[] args) {
        System.out.println("-".repeat(40));

        ContaCorrente cc = new ContaCorrente(1000);

        try{
            sacar(cc, 1200);
        } catch (ContaCorrenteException e) {
            System.out.println("Erro: " + e.getMessage());
        } finally {
            System.out.printf("Saldo Conta: R$%.2f",cc.saldo);
        }

        System.out.println();
        System.out.println("-".repeat(40));
    }
}

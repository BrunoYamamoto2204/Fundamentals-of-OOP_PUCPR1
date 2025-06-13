package Semana7.ExFixacao.ExFixacao2;

import java.util.ArrayList;
import java.util.Arrays;

public class Pagamento {

    ArrayList<String>metodos_disponiveis = new ArrayList<>(Arrays.asList("Débito", "Crédito", "PIX"));

    public void processarPagamento(String metodo, double valor, double saldo) throws InvalidPaymentMethodException, InsufficientFundsException{
        if (!metodos_disponiveis.contains(metodo)) {
            throw new InvalidPaymentMethodException("Método de pagamento inválido.");
        }
        if (valor > saldo) {
            throw new InsufficientFundsException("Saldo insuficiente!");
        }
    }

    public static void main(String[] args) {

        System.out.println("-".repeat(40));
        Pagamento pagamento = new Pagamento();

        try {
            pagamento.processarPagamento("PIX", 30, 20);
        }
        catch (InsufficientFundsException | InvalidPaymentMethodException e) {
            e.printStackTrace();
        } finally {
            System.out.println("Tentativa de processamento concluída.");
        }
         System.out.println("-".repeat(40));
    }
}

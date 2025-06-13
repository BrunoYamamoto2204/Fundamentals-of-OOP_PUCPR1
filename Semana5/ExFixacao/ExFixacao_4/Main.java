package Semana5.ExFixacao.ExFixacao_4;

public class Main {
    public static void main(String[] args) {

        System.out.println("-".repeat(40));

        Viagem viagem = new Viagem(1.1);

        double viagemNormal = viagem.calcularPreco();
        double viagemMovimentada = viagem.calcularPreco(true);

        System.out.printf("Viagem sem movimento de horário: R$"+viagemNormal);
        System.out.printf("\nViagem com movimento de horário: R$"+viagemMovimentada);

        System.out.println();
        System.out.println("-".repeat(40));
    }
}

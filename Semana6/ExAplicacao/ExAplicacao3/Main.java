package Semana6.ExAplicacao.ExAplicacao3;

public class Main {
    public static void main(String[] args){
        var joao = new Concursado(4000, 5);
        var jose = new Temporario(2000, 12);
        var maria = new Concursado(2400,34);
        var pedro = new Temporario(1200, 10);

        System.out.printf("Salário: R$%.2f\n", joao.getSalarioBase());
        System.out.printf("Salário: R$%.2f\n", jose.getSalarioBase());
        System.out.printf("Salário: R$%.2f\n", maria.getSalarioBase());
        System.out.printf("Salário: R$%.2f", pedro.getSalarioBase());
    }
}

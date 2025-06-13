package Semana3.ExFixacao_1;

class DadosConta
{
    private int numeroDaConta;
    private String agencia;
    private float saldo;
    private String senha;

    public DadosConta(int numeroDaConta, String agencia, float saldo, String senha){
        this.numeroDaConta = numeroDaConta;
        this.agencia = agencia;
        this.saldo = saldo;
        this.senha = senha;
    }

    public int getNumeroDaConta(){
        return this.numeroDaConta;
    }

    public String getAgencia(){
        return this.agencia;
    }

    public float getSaldo(){
        return this.saldo;
    }

    public void setSenha(String senha){
        System.out.println("\nSenha alterada");
        this.senha = senha;
    }
}

public class ContaBancaria{
    public static void main(String[] args){
        DadosConta conta = new DadosConta(1234, "Agência X", 10000, "senha1234");
        System.out.printf("Num conta: %d", conta.getNumeroDaConta());
        System.out.printf("\nAgência: %s", conta.getAgencia());
        System.out.printf("\nSaldo: %f", conta.getSaldo());

        conta.setSenha("outrasenha1234");
    }
}
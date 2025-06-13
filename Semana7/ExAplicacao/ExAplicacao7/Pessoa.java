package Semana7.ExAplicacao.ExAplicacao7;

public class Pessoa {
    private int idade;
    private String nome;

    public Pessoa(int idade, String nome){
        setIdade(idade);
        this.nome = nome;
    }

    public void setIdade(int idade) {
        if (idade <= 0 || idade >= 130) {
            throw new IllegalArgumentException("Idade inválida: " + idade);
        }
        this.idade = idade;
    }

    public static void main(String[] args) {
        System.out.println("Tentando criar uma pessoa com 20 anos...");
         Pessoa ze = new Pessoa(20, "Zé");

         System.out.println("Tentando criar uma pessoa com -10 anos...");
         Pessoa joao = new Pessoa(-10, "João");
    }
}

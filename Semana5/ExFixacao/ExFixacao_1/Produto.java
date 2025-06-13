package Semana5.ExFixacao.ExFixacao_1;

public class Produto {

    // Atributos
    protected int idProduto;
    protected String nome;
    protected double preco;

    // Construtor
    public Produto (int idProduto, String nome, double preco) {
        this.idProduto = idProduto;
        this.nome = nome;
        this.preco = preco;
    }

    // Métodos
    public String imprimir (){
        return String.format("ID: %d, Nome: %s, Salário: R$%.2f",idProduto,nome,preco);
    }
}

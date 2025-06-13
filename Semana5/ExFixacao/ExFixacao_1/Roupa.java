package Semana5.ExFixacao.ExFixacao_1;

public class Roupa extends Produto{

    // Atributos
    protected String tamanho;

    // Construtor
    public Roupa (int idProduto, String nome, double preco, String tamanho) {
        super(idProduto, nome, preco);
        this.tamanho = tamanho;
    }

    // Métodos
    public String imprimir() {
        return String.format(super.imprimir() + ", Tamanho: %s",tamanho);
    }
}

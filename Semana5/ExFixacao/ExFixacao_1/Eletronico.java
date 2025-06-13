package Semana5.ExFixacao.ExFixacao_1;

public class Eletronico extends Produto{

    // Atributos
    protected int voltagem;

    // Construtor
    public Eletronico (int idProduto, String nome, double preco, int voltagem) {
        super(idProduto, nome, preco);
        this.voltagem = voltagem;
    }

    // Métodos
    public String imprimir() {
        return String.format(super.imprimir() + ", Voltagem: %d",voltagem);
    }
}

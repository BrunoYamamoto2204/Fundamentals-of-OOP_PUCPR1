package Semana5.ExFixacao.ExFixacao_1;

public class Livro extends Produto{

    // Atributos
    protected int paginas;

    // Construtor
    public Livro (int idProduto, String nome, double preco, int paginas) {
        super(idProduto,nome,preco);
        this.paginas = paginas;
    }

    // Métodos
    public String imprimir() {
        return String.format(super.imprimir() + ", Páginas: %d",paginas);
    }
}

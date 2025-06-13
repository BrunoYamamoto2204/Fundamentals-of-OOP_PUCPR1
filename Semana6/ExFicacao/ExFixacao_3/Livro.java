package Semana6.ExFicacao.ExFixacao_3;

public class Livro extends Produto{
    protected int NumPaginas;

    public Livro (String nome, double preco, int NumPaginas){
        super(nome, preco);
        this.NumPaginas = NumPaginas;
    }

    public void info() {
        System.out.printf("Livro: %s\n", getNome());
        System.out.printf("Preço: %.2f\n", getPreco());
        System.out.printf("Numero de página: %d\n", NumPaginas);
    }
}

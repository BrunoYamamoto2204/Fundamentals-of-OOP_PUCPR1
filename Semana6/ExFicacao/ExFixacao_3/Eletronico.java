package Semana6.ExFicacao.ExFixacao_3;

public class Eletronico extends Produto{
    protected int voltagem;

    public Eletronico (String nome, double preco, int voltagem){
        super(nome, preco);
        this.voltagem = voltagem;
    }

    public void info() {
        System.out.printf("Eletronico: %s\n", getNome());
        System.out.printf("Preço: %.2f\n", getPreco());
        System.out.printf("Voltagem: %d V\n", voltagem);
    }
}

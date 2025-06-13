package Semana6.ExFicacao.ExFixacao_1;

public abstract class ConteudoNetflix {
    protected String titulo;
    protected int duracao;

    public ConteudoNetflix(String titulo, int duracao) {
        this.titulo = titulo;
        this.duracao = duracao;
    }

    public abstract void reproduzir();
}

package Semana6.ExFicacao.ExFixacao_5;

public abstract class PublicacaoInstagram {
    protected String autor;
    protected String data;

    public PublicacaoInstagram(String autor, String data) {
        this.autor = autor;
        this.data = data;
    }

    public abstract void renderizar();
}

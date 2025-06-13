package Semana5.ExFixacao.ExFixacao_6;

public class Perfume extends Produto{

    private String fragrancia;

    public Perfume (String nome, String fragrancia) {
        super(nome);
        this.fragrancia = fragrancia;
    }

    public String getFragrancia() {
        return fragrancia;
    }
}

package Semana6.ExFicacao.ExFixacao_1;

public class Main {
    public static void main(String[] args) {
        ConteudoNetflix filme = new Filme("Filme 1", 120);
        ConteudoNetflix serie = new Serie("Serie 1", 140);

        filme.reproduzir();
        serie.reproduzir();
    }
}

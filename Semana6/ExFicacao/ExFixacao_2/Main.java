package Semana6.ExFicacao.ExFixacao_2;

public class Main {
    public static void main(String[] args) {
        Midia musica = new Musica();
        Midia podcast = new Podcast();

        musica.play();
        musica.pause();
        musica.next();
        musica.previous();

        System.out.println();

        podcast.play();
        podcast.pause();
        podcast.next();
        podcast.previous();
    }
}

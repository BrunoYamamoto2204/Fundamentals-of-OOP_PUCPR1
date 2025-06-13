package Semana6.ExFicacao.ExFixacao_2;

public class Podcast implements Midia{
    @Override
    public void play() {
        System.out.println("Tocando Podcast...");
    }
    public void pause() {
        System.out.println("Pausando Podcast...");
    }
    public void next() {
        System.out.println("Avançar Podcast...");
    }
    public void previous() {
        System.out.println("Voltar Podcast...");
    }
}

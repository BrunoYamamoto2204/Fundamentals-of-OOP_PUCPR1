package Semana6.ExFicacao.ExFixacao_2;

public class Musica implements Midia{
    @Override
    public void play() {
        System.out.println("Tocando Música...");
    }
    public void pause() {
        System.out.println("Pausando Música...");
    }
    public void next() {
        System.out.println("Avançar Múscica...");
    }
    public void previous() {
        System.out.println("Voltar Música...");
    }
}

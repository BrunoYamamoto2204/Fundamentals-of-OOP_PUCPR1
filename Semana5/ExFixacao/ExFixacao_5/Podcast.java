package Semana5.ExFixacao.ExFixacao_5;

public class Podcast extends Midia{

    protected String locutor;

    public Podcast (String nome, String duracao,String locutor) {
        super(nome, duracao);
        this.locutor = locutor;
    }

    public void play() {
       System.out.println("Ouvindo podcast ("+duracao+")"+" - "+nome+" | "+locutor);
   }
}

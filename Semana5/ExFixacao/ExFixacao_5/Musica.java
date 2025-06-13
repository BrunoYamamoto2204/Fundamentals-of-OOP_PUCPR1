package Semana5.ExFixacao.ExFixacao_5;

public class Musica extends Midia{

    protected String cantor;

    public Musica (String nome, String duracao,String cantor) {
        super(nome, duracao);
        this.cantor = cantor;
    }

    public void play() {
       System.out.println("Ouvindo Música ("+duracao+")"+" - "+nome+" | "+cantor);
   }
}

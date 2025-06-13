package Semana5.ExFixacao.ExFixacao_5;

import java.util.ArrayList;

public class Midia {

    protected String nome;
    protected String duracao;

    public Midia (String nome, String duracao) {
        this.nome = nome;
        this.duracao = duracao;
    }

   public void play() {
       System.out.println("Tocando"+"("+duracao+")"+": "+nome);
   }
}

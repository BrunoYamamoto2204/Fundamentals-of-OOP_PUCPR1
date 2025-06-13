package Semana2.ExFixacao_5;

public class Episodio5
{
    public String titulo;
    public int duracao;

    public Episodio5(String titulo, int duracao){
        this.titulo = titulo;
        this.duracao = duracao;
    }

    public void imprimirDados(){
        System.out.printf("Episódio: %s",titulo);
        System.out.printf("\nDuração: %d min",duracao);
    }
}

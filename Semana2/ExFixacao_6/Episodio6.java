package Semana2.ExFixacao_6;

public class Episodio6
{
    public String titulo;
    public int duracao;

    public Episodio6(String titulo, int duracao){
        this.titulo = titulo;
        this.duracao = duracao;
    }

    public void imprimirDados(){
        System.out.printf("Episódio: %s",titulo);
        System.out.printf("\nDuração: %d min",duracao);
    }
}

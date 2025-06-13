package Semana2.ExFixacao_4;

public class Episodio4
{
    public String titulo;
    public int duracao;

    public Episodio4(String titulo, int duracao){
        this.titulo = titulo;
        this.duracao = duracao;
    }

    public void imprimirDados(){
        System.out.printf("Episódio: %s",titulo);
        System.out.printf("\nDuração: %d min",duracao);
    }

    public static void main(String[] args)
    {
        System.out.println("-".repeat(40));

        Episodio4 ep1 = new Episodio4("Episódio 1", 90);
        Episodio4 ep2 = new Episodio4("Episódio 2", 92);
        Episodio4 ep3 = new Episodio4("Episódio 3", 91);
        Episodio4 ep4 = new Episodio4("Episódio 4", 93);
        Episodio4 ep5 = new Episodio4("Episódio 5", 95);

        System.out.print("Nada a imprimir");

        System.out.println();
        System.out.println("-".repeat(40));
    }
}

package Semana2.ExFixacao_5;

import java.util.ArrayList;
import java.util.List;

public class Serie5
{
    public String nome;
    List<Episodio5> episodios = new ArrayList<>();

    public Serie5(String nome){
        this.nome = nome;
    }

    public void imprimirDados(){
        System.out.printf("Série: %s",nome);
        System.out.println("\n");

        for(Episodio5 ep:episodios){
            System.out.println("=".repeat(40));
            ep.imprimirDados();
            System.out.println();
            System.out.println("=".repeat(40));

            System.out.println();
        }
    }

    public static void main(String[] args)
    {
        System.out.println("-".repeat(40));

        Episodio5 ep1 = new Episodio5("Episódio 1", 90);
        Episodio5 ep2 = new Episodio5("Episódio 2", 92);
        Episodio5 ep3 = new Episodio5("Episódio 3", 91);
        Episodio5 ep4 = new Episodio5("Episódio 4", 93);
        Episodio5 ep5 = new Episodio5("Episódio 5", 95);


        Serie5 serie = new Serie5("Série legal");
        serie.episodios.add(ep1);
        serie.episodios.add(ep2);
        serie.episodios.add(ep3);
        serie.episodios.add(ep4);
        serie.episodios.add(ep5);

        serie.imprimirDados();

        System.out.println("-".repeat(40));
    }
}

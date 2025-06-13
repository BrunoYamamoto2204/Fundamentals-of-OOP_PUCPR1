package Semana2.ExFixacao_6;

import java.util.ArrayList;
import java.util.List;

public class Serie6
{
    public String nome;
    List<Episodio6> episodios = new ArrayList<>();

    public Serie6(String nome){
        this.nome = nome;
    }

    public void adicionarEpisodio(Episodio6 episodio){
        episodios.add(episodio);
    }

    public void imprimirDados(){
        System.out.printf("Série: %s",nome);
        System.out.println("\n");

        for(Episodio6 ep:episodios){
            System.out.println("=".repeat(40));
            ep.imprimirDados();
            System.out.println();
            System.out.println("=".repeat(40));

            System.out.println();
        }
    }
}

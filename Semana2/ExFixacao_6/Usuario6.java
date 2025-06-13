package Semana2.ExFixacao_6;

import java.util.ArrayList;
import java.util.List;

public class Usuario6
{
    public String nome;
    public String email;
    public String senha;
    public ArrayList<Serie6> seriesAssistidas;

    public Usuario6(String nome, String email, String senha){
        this.nome = nome;
        this.email = email;
        this.senha = senha;
        this.seriesAssistidas = new ArrayList<>();
    }

    public void imprimirDados(){
        System.out.printf("\nNome: %s",nome);
        System.out.printf("\nEmail: %s",email);
        System.out.println();
        System.out.println("-".repeat(40));

        for (Serie6 serie : this.seriesAssistidas){
            serie.imprimirDados();
        }
    }

    public boolean verificarSenha(String senha){
        return senha.equals(this.senha);
    }

    public void adicionarSerieAoHistorico(Serie6 serie){
        seriesAssistidas.add(serie);
    }

    public static void main(String[] args)
    {
        System.out.print("-".repeat(40));

        // Criando objetos Episódio
        Episodio6 ep1 = new Episodio6("Episódio 1", 90);
        Episodio6 ep2 = new Episodio6("Episódio 2", 92);
        Episodio6 ep3 = new Episodio6("Episódio 3", 91);
        Episodio6 ep4 = new Episodio6("Episódio 4", 93);
        Episodio6 ep5 = new Episodio6("Episódio 5", 95);

        // Criando objetos Série e
        Serie6 serie = new Serie6("Série legal");

        // Criando objeto Usuário
        Usuario6 usuario = new Usuario6("João", "joao@gmail.com", "senhaSegura");

        // Adicionando os episódios à série
        serie.adicionarEpisodio(ep1);
        serie.adicionarEpisodio(ep2);
        serie.adicionarEpisodio(ep3);
        serie.adicionarEpisodio(ep4);
        serie.adicionarEpisodio(ep5);

        // Adicionar Série na lista de histórico
        usuario.adicionarSerieAoHistorico(serie);

        // Mostrar dados do usuário
        usuario.imprimirDados();

        System.out.println("-".repeat(40));
    }
}

package Semana5.ExFixacao.ExFixacao_5;

import java.util.ArrayList;

public class Playlist {

    ArrayList<Midia> playlist;

    public Playlist() {
        this.playlist = new ArrayList<Midia>();
    }

    public void AdicionarMidia (Midia musica) {
        this.playlist.add(musica);
    }

    public void TocarPlaylist() {
        System.out.println("Tocando playlist: ");
        for (Midia midia : playlist) {
            midia.play();
        }
    }
}

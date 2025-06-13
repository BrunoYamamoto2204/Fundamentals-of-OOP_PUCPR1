package Semana5.ExFixacao.ExFixacao_5;

public class Main {
    public static void main(String[] args) {

        System.out.println("-".repeat(40));

        Playlist playlist = new Playlist();

        playlist.AdicionarMidia(new Musica("Money Trees", "6:26","Kendrick Lamar"));
        playlist.AdicionarMidia(new Musica("Father Stretch My Hands Pt.1", "2:15","Kenye West"));
        playlist.AdicionarMidia(new Musica("It Ain't Me", "3:40","Selena Gomez"));

        playlist.AdicionarMidia(new Podcast("Podcast legal", "1:00:00", "Jonson"));
        playlist.AdicionarMidia(new Podcast("Podcast muito legal", "1:30:00", "Jabilson"));

        playlist.TocarPlaylist();

        System.out.println("-".repeat(40));
    }
}

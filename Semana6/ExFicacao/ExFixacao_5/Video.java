package Semana6.ExFicacao.ExFixacao_5;

public class Video extends PublicacaoInstagram{
    public Video(String autor, String data) {
        super(autor, data);
    }

    public void renderizar() {
        System.out.printf("%s - @%s Postou um vídeo\n", data, autor);
    }
}

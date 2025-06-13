package Semana6.ExFicacao.ExFixacao_5;

public class Main {
    public static void main(String[] args) {
        PublicacaoInstagram video = new Video("Autor1", "08/04/2025");
        PublicacaoInstagram foto = new Foto("Autor2", "08/04/2025");

        video.renderizar();
        System.out.println();
        foto.renderizar();
    }
}

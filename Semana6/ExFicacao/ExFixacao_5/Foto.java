package Semana6.ExFicacao.ExFixacao_5;

public class Foto extends PublicacaoInstagram{

    public Foto(String autor, String data) {
        super(autor, data);
    }

    public void renderizar() {
        System.out.printf("%s - @%s Postou uma Foto\n", data, autor);
    }
}

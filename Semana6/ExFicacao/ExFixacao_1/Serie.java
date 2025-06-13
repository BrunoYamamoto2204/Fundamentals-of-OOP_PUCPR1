package Semana6.ExFicacao.ExFixacao_1;

public class Serie extends ConteudoNetflix{
    public Serie (String titulo, int duracao) {
        super (titulo, duracao);
    }

    public void reproduzir() {
        System.out.printf("Reproduzindo Serie: %s\n",titulo);

        int horas = duracao / 60;
        int minutos = duracao - (horas * 60);
        System.out.printf("Duração: %d:%d h\n\n",horas,minutos);
    }
}

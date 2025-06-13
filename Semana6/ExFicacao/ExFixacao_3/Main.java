package Semana6.ExFicacao.ExFixacao_3;

public class Main {
    public static void main(String[] arsg) {
        var livro = new Livro("Livro A", 90.0, 210);
        var eletronico = new Eletronico("Geladeira", 1500, 220);

        livro.info();

        System.out.println();

        eletronico.info();
    }
}

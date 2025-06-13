package Semana8.ExAplicacao.ExAplicacao5;

public class Gato extends Mamifero {
    private static final long serialVersionUID = 1L;

    public Gato(String nome, int idade, String dono){
        super(nome, idade, dono);
    }

    public String soar() {
        return "Faz miados";
    }
}

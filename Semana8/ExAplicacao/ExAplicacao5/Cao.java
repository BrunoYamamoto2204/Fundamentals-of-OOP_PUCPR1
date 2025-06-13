package Semana8.ExAplicacao.ExAplicacao5;

public class Cao extends Mamifero {

    private static final long serialVersionUID = 1L;

    public Cao(String nome, int idade, String dono){
        super(nome, idade, dono);
    }

    public String soar() {
        return "Faz latidos";
    }

}

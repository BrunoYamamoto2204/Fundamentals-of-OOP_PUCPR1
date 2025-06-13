package Semana8.ExAplicacao.ExAplicacao5;

//complete o código aqui

import java.io.Serializable;

public abstract class Mamifero implements Serializable {

    private static final long serialVersionUID = 1L;
    protected String nome;
    protected int idade;
    protected String dono;
    protected String especie;

    public Mamifero(String nome, int idade, String dono) {
        this.nome = nome;
        this.idade = idade;
        this.dono = dono;
    }
    public String toString() {
        String retorno = "";
        retorno += "Nome: " + this.nome + "\n";
        retorno += "Idade: "    + this.idade    + " anos\n";
        retorno += "Dono: "     + this.dono     + "\n";
        retorno += "Espécie: "  + this.especie  + "\n";
        retorno += "Barulho: "  + soar()        + "\n";
        return retorno;
    }

    public abstract String soar();
}
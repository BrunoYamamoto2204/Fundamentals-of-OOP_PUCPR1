package Semana8.ExFixacao.ExFixacao1;

import java.io.Serializable;

public class Aluno implements Serializable {

    protected String nome;
    protected String curso;
    protected int idade;

    public Aluno(String nome, String curso, int idade) {
        this.nome = nome;
        this.curso = curso;
        this.idade = idade;
    }

    public String toString() {
        String retorno = "";
        retorno += "Nome: " + nome + "\n";
        retorno += "Curso: " + curso + "\n";
        retorno += "Idade: " + idade + "\n";

        return retorno;
    }
}

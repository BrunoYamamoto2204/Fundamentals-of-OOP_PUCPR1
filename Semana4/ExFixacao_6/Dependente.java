package Semana4.ExFixacao_6;

public class Dependente {

    public String nome;

    public Dependente ( String nome){
        this.nome = nome;
    }

    public void imprimir() {
        System.out.printf("Dependente: %s\n",this.nome);
    }
}

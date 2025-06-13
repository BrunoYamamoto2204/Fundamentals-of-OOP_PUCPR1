package Semana4.ExFixacao_6;

import java.util.ArrayList;

public class Contribuinte {

    public String nome;
    public ArrayList<Dependente> dependentes;

    public Contribuinte(String nome){
        this.nome = nome;
        this.dependentes = new ArrayList<Dependente>();
    }

    public void ligarDependente(Dependente dependente){
        dependentes.add(dependente);
    }
    public void imprimir() {
        System.out.printf("Contribuinte: %s\n",this.nome);
        imprimirDependentes();
    }
    public void imprimirDependentes() {
        for (Dependente dependente : dependentes) {
            dependente.imprimir();
        }
    }

    public int numeroDependentes() {
        return dependentes.size();
    }
}

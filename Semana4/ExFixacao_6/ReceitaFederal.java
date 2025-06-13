package Semana4.ExFixacao_6;

public class ReceitaFederal {
    public static void main(String[] args){

       System.out.println("-".repeat(40));

       Contribuinte jonson = new Contribuinte("Jonson");
       Dependente jose = new Dependente("José");
       Dependente jerson = new Dependente("Jerson");

       jonson.ligarDependente(jose);
       jonson.ligarDependente(jerson);

       jonson.imprimir();
       System.out.printf("Número de contribuintes: %d", jonson.numeroDependentes());

       System.out.println();
       System.out.print("-".repeat(40));
    }
}

package Semana3.ExFixacao_7;

public class Main {
    public static void main(String[] args){

        System.out.println("-".repeat(40));
        VagaLinkedin vaga = new VagaLinkedin("Empresa X", "Estagiário", "Descricao X");

        System.out.println("Dados atuais:");
        System.out.printf("Empresa: %s", vaga.getEmpresa());
        System.out.printf("\nPosição: %s", vaga.getPosicao());
        System.out.printf("\nDescrição: %s", vaga.getDescricao());

        vaga.setEmpresa("Empresa Y");
        vaga.setPosicao("Gerente");
        vaga.setDescricao("Descricao Y");

        System.out.println("\n\nDados atuais:");
        System.out.printf("Empresa: %s", vaga.getEmpresa());
        System.out.printf("\nPosição: %s", vaga.getPosicao());
        System.out.printf("\nDescrição: %s", vaga.getDescricao());

        System.out.println();
        System.out.println("-".repeat(40));
    }
}

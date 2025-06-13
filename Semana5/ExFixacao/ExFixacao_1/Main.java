package Semana5.ExFixacao.ExFixacao_1;

public class Main {
    public static void main(String[] args) {
        System.out.println("-".repeat(40));

        // Produto
        System.out.printf("Class Produto:\n");
        Produto p = new Produto(1, "Pc", 2000.42);
        System.out.printf(p.imprimir()+"\n\n");

        // Livro
        System.out.println("Class Livro:");
        Produto l = new Livro(1, "Pc", 2000.42, 230);
        System.out.printf(l.imprimir());
        System.out.println("\n");

        // Eletronico
        System.out.println("Class Eletronico:");
        Produto e = new Eletronico(1, "Pc", 2000.42, 220);
        System.out.printf(e.imprimir());
        System.out.println("\n");

        // Roupa
        System.out.println("Class Roupa:");
        Produto r = new Roupa(1, "Pc", 2000.42, "G");
        System.out.printf(r.imprimir());

        System.out.println();
        System.out.println("-".repeat(40));
    }
}

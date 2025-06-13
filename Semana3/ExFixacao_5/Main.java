package Semana3.ExFixacao_5;

public class Main {
    public static void main(String[] args){
        System.out.println("-".repeat(40));

        String string = "Valorant";
        String[] letras = string.split("");

        String resultado = "";

        for (int i = letras.length - 1; i >= 0; i--){
            resultado += string.charAt(i);
        }

        System.out.println("Palavra: " + string);
        System.out.print("Palavra invertida: " + resultado);

        System.out.println();
        System.out.println("-".repeat(40));
    }
}

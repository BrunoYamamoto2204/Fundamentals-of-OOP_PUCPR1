package Semana3.ExFixacao_3;

import java.util.ArrayList;
import java.util.List;

public class Main
{
    public static void main(String[] args)
    {
        System.out.println("-".repeat(40));

        String string1 = "o senhor dos anéis";
        String[] letras = string1.split("");
        String Resultado = "";

        boolean maiusculo = false;
        boolean primeiraPalavra = true;

        for (String s : letras) {
            if (s.equals(" ")){
                maiusculo = true;
                Resultado += " ";
                continue;
            }
            if (maiusculo || primeiraPalavra){
                s = s.toUpperCase();
                maiusculo = false;
                primeiraPalavra = false;
            }
            Resultado += s;
        }

        System.out.print(Resultado);

        System.out.println();
        System.out.println("-".repeat(40));
    }
}

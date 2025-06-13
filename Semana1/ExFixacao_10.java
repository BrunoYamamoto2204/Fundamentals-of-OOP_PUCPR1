package Semana1;
import java.util.Random;
import java.util.Scanner;

public class ExFixacao_10
{
    public static void main(String[] args)
    {
        Scanner sc= new Scanner(System.in);
        Random random = new Random();

        System.out.println("-".repeat(40));

        String[] palavras = {
            "computador",
            "programacao",
            "javascript",
            "elefante",
            "astronauta",
            "bicicleta",
            "guitarra",
            "banana",
            "tornado",
            "dinossauro"
        };

        int tentativas = 6;
        int acertou = 0;
        String erros = "";

        int n = random.nextInt(0,10);
        String palavra = (palavras[n]);

        // Cria a forca
        char[] forca = new char[palavra.length()];
        for (int i = 0; i < palavra.length(); i++){
            forca[i] = '_';
        }
        System.out.println(forca);

        while (acertou < palavra.length() && tentativas > 0) {
            System.out.println("Tentativas: " + tentativas);
            System.out.println("Erros: " + erros);

            System.out.print("Letra: ");
            char esc = sc.nextLine().charAt(0);

            // Identifica se há a letra
            boolean temLetra = false;
            for (int i = 0; i < palavra.length(); i++) {
                if (palavra.charAt(i) == esc) {
                    forca[i] = esc;
                    acertou += 1;
                    temLetra = true;
                }
            }

            // Valor e contagem dos erros
            if (!temLetra){
                erros += esc;
                tentativas -= 1;
            }

            if (tentativas == 0){
                System.out.println("\nVocê perdeu!");
                System.out.print("Palavra: " + palavra);
                break;
            }
            if (acertou == palavra.length()){
                System.out.println("\nVocê ganhou!");
                System.out.print("Palavra: " + palavra);
                break;
            }

            System.out.println();
            System.out.println(forca);
        }

        System.out.println();
        System.out.println("-".repeat(40));
    }
}

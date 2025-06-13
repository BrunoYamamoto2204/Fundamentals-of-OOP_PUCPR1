package Somativa2_Semana8.src.main;

import Somativa2_Semana8.src.modelo.*;
import Somativa2_Semana8.src.util.InterfaceUsuario;

import javax.swing.*;
import java.io.*;
import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    // Recupera os dados dos alunos
    public static ArrayList<Financiamento> lerFinanciamentos(){
        ArrayList<Financiamento> listaFinanciamentos = new ArrayList<>();

        try {
            ObjectInputStream inputStream = new ObjectInputStream(new FileInputStream("Somativa2_Semana8/lista.dados"));

            while (true) {
                try {
                    Object obj = inputStream.readObject();
                    listaFinanciamentos.add((Financiamento) obj);
                } catch (EOFException e){
                    break;
                }
            }

        } catch(FileNotFoundException ex) {
            System.out.println("Arquivo não disponível");
        } catch (ClassNotFoundException | IOException ex) {
            ex.printStackTrace();
        }

        return listaFinanciamentos;
    }

    // Salva os dados dos alunos
    public static void salvarFinanciamentos(ArrayList<Financiamento> financiamentos){
        ObjectOutputStream outputStream;

        try{
            outputStream = new ObjectOutputStream(new FileOutputStream("Somativa2_Semana8/lista.dados"));

            for (int i = 0; i < financiamentos.size(); i++) {
                outputStream.writeObject(financiamentos.get(i));
            }

        } catch(FileNotFoundException ex) {
            System.out.println("Arquivo não disponível");
        } catch (IOException ex) {
            ex.printStackTrace();
        }
    }

    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);

        InterfaceUsuario usuario = new InterfaceUsuario();
        ArrayList<Financiamento> listaDeFinanciamentos = new ArrayList<Financiamento>();

        System.out.println("=".repeat(20)+" Financiamento "+"=".repeat(20));

        // Padrão
        System.out.println();
        System.out.println("=".repeat(5)+" Geral "+"=".repeat(5));
        double valor = usuario.digitarValorImovel();
        int prazo = usuario.digitarPrazoFinanciamento();
        float taxa = usuario.digitarTaxaJurosAnual();

        // Casa
        System.out.println();
        System.out.println("=".repeat(5)+" Casa "+"=".repeat(5));
        System.out.print("\nÁrea do terreno(m²): ");
        double terreno = sc.nextDouble();
        System.out.print("\nÁrea do area construida(m²): ");
        double construido = sc.nextDouble();

        listaDeFinanciamentos.add(new Casa(valor, prazo, taxa,construido,terreno));

        // Apartamento
        System.out.println();
        System.out.println("=".repeat(5)+" Apartamento "+"=".repeat(5));
        System.out.print("\nNúmero de Vagas: ");
        int vagas = sc.nextInt();
        System.out.print("\nNúmero do Apartamento: ");
        int numApartamento = sc.nextInt();
        sc.nextLine();

        listaDeFinanciamentos.add(new Apartamento(valor, prazo, taxa, vagas, numApartamento));

        // Terreno
        System.out.println();
        System.out.println("=".repeat(5)+" Terreno "+"=".repeat(5));
        System.out.print("Tipo de zona(Residencial | Comercial): ");
        String zona = sc.nextLine();

        listaDeFinanciamentos.add(new Terreno(valor, prazo, taxa,zona));

        System.out.println("=".repeat(55));

        System.out.println("\n"+"-".repeat(20)+" Dados do financiamento "+"-".repeat(20));
        System.out.println();

        // Visualizando os financiamentos
        double totalImovel = 0;
        double totalFinanciamento = 0;

        FileWriter escritor = null;
        try {
            escritor = new FileWriter("Somativa2_Semana8/resgistros.txt", true);
            ArrayList<Financiamento> listaRegistrada = lerFinanciamentos();

            int numFinanciamento = 1;
            for (Financiamento financiamento : listaDeFinanciamentos) {
                listaRegistrada.add(financiamento);

                System.out.println("Financiamento " + numFinanciamento);

                double pagamento = financiamento.pagamentoMensal();
                financiamento.visualizarDados(pagamento);
                financiamento.info();

                escritor.write(financiamento.toString() + "\n\n");

                numFinanciamento += 1;
                totalImovel += financiamento.getValorImovel();
                totalFinanciamento += pagamento * financiamento.getPrazoFinanciamento() * 12;

                System.out.println();
            }

            // Salvar após adicionar os novos objetos junto dos já registrados
            salvarFinanciamentos(listaRegistrada);

            escritor.write("-".repeat(30) + "\n");

        } catch (Exception e) {
            System.out.print(e.getMessage());
        } finally {
            try {
                if (escritor != null) {
                    escritor.close();
                }
            } catch (IOException e) {
                e.printStackTrace();
            }
        }

        System.out.println("=".repeat(20)+" Resultado "+"=".repeat(20));
        System.out.printf("Total de todos os imóveis: R$%.2f",totalImovel);
        System.out.printf("\nTotal de todos os financiamento: R$%.2f",totalFinanciamento);
        System.out.print("\n"+"=".repeat(51));

        System.out.println("\n\n== Registros dos dados dos objetos ==\n");
        ArrayList<Financiamento> conferirFinanciamentos = lerFinanciamentos();
        for (Financiamento f : conferirFinanciamentos) {
            System.out.println(f.toString());
            System.out.println("-".repeat(40));
        }

    }
}
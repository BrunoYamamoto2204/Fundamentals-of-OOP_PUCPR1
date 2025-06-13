package Semana8.ExFixacao.ExFixacao1;

import javax.swing.*;
import java.io.*;
import java.util.ArrayList;

public class Sistema {

    private ArrayList<Aluno> alunos = new ArrayList<Aluno>();

    public Sistema(){
        this.alunos = lerAlunos();
    }

    public String[] leValores(String[] categorias) {
        String[] valores = new String[3];

        for (int i = 0; i < 3; i++) {
            valores[i] = JOptionPane.showInputDialog("Entre com " + categorias[i] + ": ");
        }

        return valores;
    }

    public int valorInteiro(String s){
        int inteiro;

        while (true) {
            try {
                inteiro = Integer.parseInt(s);
                return inteiro;
            } catch (Exception e){
                s = JOptionPane.showInputDialog(null, "Valor incorreto. Digite novamente: ");
            }
        }
    }

    public Aluno leAluno() {
        String[] valores = new String[3];
        String[] categorias = {"Nome", "Curso", "Idade"};
        valores = leValores(categorias);

        int idade = valorInteiro(valores[2]);

        Aluno aluno = new Aluno(valores[0], valores[1], idade);
        JOptionPane.showMessageDialog(null, "Aluno " + valores[0] + " salvo com sucesso!");
        return aluno;
    }

    public void salvarAluno(ArrayList<Aluno> alunos){
        ObjectOutputStream outputStream;

        try{
            outputStream = new ObjectOutputStream(new FileOutputStream("Semana8/ExFixacao/ExFixacao1/alunos.dados"));

            for (int i = 0; i < alunos.size(); i++) {
                outputStream.writeObject(alunos.get(i));
            }

        } catch(FileNotFoundException ex) {
            JOptionPane.showMessageDialog(null, "Arquivo não disponível");
        } catch (IOException ex) {
            ex.printStackTrace();
        }
    }

    public ArrayList<Aluno> lerAlunos(){
        ArrayList<Aluno> alunosLista = new ArrayList<>();

        try {
            ObjectInputStream inputStream = new ObjectInputStream(new FileInputStream("Semana8/ExFixacao/ExFixacao1/alunos.dados"));

            while (true) {
                try {
                    Object obj = inputStream.readObject();
                    alunosLista.add((Aluno) obj);
                } catch (EOFException e){
                    break;
                }
            }

        } catch(FileNotFoundException ex) {
            JOptionPane.showMessageDialog(null, "Arquivo não disponível");
        } catch (ClassNotFoundException | IOException ex) {
            ex.printStackTrace();
        }

        return alunosLista;
    }

    public void menu(){
        int opc;
        String resposta;

        do {
            String menu = "Gerenciar cadastros\n\n" +
                    "Opções:\n" +
                    "1. Adicionar Aluno\n" +
                    "2. Exibir Alunos\n" +
                    "3. Limpar Alunos\n" +
                    "9. Sair";

            resposta = JOptionPane.showInputDialog(menu + "\n\n");
            opc = valorInteiro(resposta);

            if(opc == 1) {
                alunos.add(leAluno());
                salvarAluno(alunos);
            }

            if(opc == 2){
                ArrayList<Aluno> listaAlunos = lerAlunos();

                StringBuilder leitura = new StringBuilder();
                for (int a = 0; a < listaAlunos.size(); a++){
                    leitura.append(listaAlunos.get(a).toString() + "------------------\n");
                }

                JOptionPane.showMessageDialog(null, leitura);
            }

            if(opc == 3){
                alunos.clear();
                JOptionPane.showMessageDialog(null, "Alunos deletados!");
                salvarAluno(alunos);
            }

            if(opc == 9){
                JOptionPane.showMessageDialog(null, "Programa Finalizado!");
                break;
            }

        } while (opc != 9);
    }

    public static void main(String[] args){
        Sistema sistema = new Sistema();
        sistema.menu();
    }
}

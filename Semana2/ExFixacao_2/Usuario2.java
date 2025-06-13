package Semana2.ExFixacao_2;

import java.util.Objects;
import java.util.Scanner;

public class Usuario2
{
    public String nome;
    public String email;
    public String senha;

    public Usuario2(String nome, String email, String senha){
        this.nome = nome;
        this.email = email;
        this.senha = senha;
    }

    public void imprimirDados(){
        System.out.printf("\nNome: %s",nome);
        System.out.printf("\nEmail: %s",email);
        System.out.println();
    }

    public boolean verificarSenha(String senha){
        return senha.equals(this.senha);
    }

    public static void main(String[] args)
    {
        System.out.println("-".repeat(40));

        System.out.print("Nada a imprimir");

        System.out.println();
        System.out.println("-".repeat(40));
    }
}

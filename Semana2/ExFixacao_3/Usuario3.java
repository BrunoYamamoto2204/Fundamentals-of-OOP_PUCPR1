package Semana2.ExFixacao_3;

import java.util.Objects;
import java.util.Scanner;

public class Usuario3
{
    public String nome;
    public String email;
    public String senha;

    public Usuario3(String nome, String email, String senha){
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
        Scanner sc = new Scanner(System.in);

        System.out.println("-".repeat(40));

        Usuario3 usuario = new Usuario3("João","joao@gmail.com","SenhaSegura123");

        System.out.println("Senha correta:");
        System.out.print(usuario.verificarSenha("SenhaSegura123"));

        System.out.println("\nSenha incorreta:");
        System.out.print(usuario.verificarSenha("SenhaSegura000"));


        System.out.println();
        System.out.println("-".repeat(40));
    }
}

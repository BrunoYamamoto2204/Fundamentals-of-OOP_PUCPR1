package Semana2.ExFixacao_5;

import java.util.Scanner;

public class Usuario5
{
    public String nome;
    public String email;
    public String senha;

    public Usuario5(String nome, String email, String senha){
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

}

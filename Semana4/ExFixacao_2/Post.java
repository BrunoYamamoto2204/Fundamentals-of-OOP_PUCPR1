package Semana4.ExFixacao_2;

import java.util.ArrayList;

class Post {

    public String texto;
    public int quantidadeDeCurtidas;
    public int quantidadeDeCompartilhamentos;

    public Post(String texto){
        this.texto = texto;
        this.quantidadeDeCurtidas = 0;
        this.quantidadeDeCompartilhamentos = 0;
    }

    public void curtir(){
        this.quantidadeDeCurtidas ++;
    }

    public void compartilhar(){
        this.quantidadeDeCompartilhamentos ++;
    }

    public String toString() {
        return

        "Post: " + texto +
        "\nCurtidas: " + quantidadeDeCurtidas +
        "\nCompartilhamento: " + quantidadeDeCompartilhamentos + "\n";
    }
}

class Usuario {
    private ArrayList<Post> listaPosts;

    public Usuario(){
        this.listaPosts = new ArrayList<Post>();
    }

    public void postar(String texto){
        Post post = new Post(texto);
        this.listaPosts.add(post);
    }

    public void curtirPost(int index){
        listaPosts.get(index).curtir();
    }

    public void compartilharPost(int index){
        listaPosts.get(index).compartilhar();
    }

    public String toString() {
        for (int i = 0; i < listaPosts.size(); i++) {
            System.out.println("=".repeat(40));
            System.out.println("Post "+ i);
            System.out.println("=".repeat(40));
            System.out.println(listaPosts.get(i));
            System.out.println("=".repeat(40));
            System.out.println();
        }
        return "";
    }

    public static void main(String[] args) {
        Usuario usuario = new Usuario();
        usuario.postar("Primeiro post!");
        usuario.postar("Segundo post!");
        usuario.postar("Terceiro post!");

        usuario.curtirPost(0);
        usuario.compartilharPost(1);
        usuario.curtirPost(2);
        usuario.compartilharPost(2);


        System.out.print(usuario);
    }
}
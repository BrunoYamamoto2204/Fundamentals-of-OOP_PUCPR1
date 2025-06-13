package Semana3.ExFixacao_4;

class Post{
    private String imagemURL;
    private String descricao;
    private int quantidadeLikes;

    public Post(String imagemURL, String descricao, int quantidadeLikes){
        this.imagemURL = imagemURL;
        this.descricao = descricao;
        this.quantidadeLikes = quantidadeLikes;
    }

    // set
    public void setImagemURL(String novaImagem){
        this.imagemURL = novaImagem;
    }
    public void setDescricao(String novadescricao){
        this.descricao = novadescricao;
    }
    public void setNovaquantidadeLikes(int novaquantidadeLikes){
        this.quantidadeLikes = novaquantidadeLikes;
    }

    // get
    public String getImagemURL(){
        return this.imagemURL;
    }
    public String getDescricao(){
        return this.descricao;
    }
    public int getNovaquantidadeLikes(){
        return this.quantidadeLikes;
    }
}

public class PostInstagram
{
    public static void main(String[] args){
        System.out.println("-".repeat(40));

        Post post = new Post("Imagem 1", "Descricao 1", 1000);

        System.out.println("Dados atuais:");
        System.out.printf("Imagem: %s", post.getImagemURL());
        System.out.printf("\nDescrição: %s", post.getDescricao());
        System.out.printf("\nQuantidade de likes: %d", post.getNovaquantidadeLikes());

        post.setImagemURL("Imagem 2");
        post.setDescricao("Descricao 2");
        post.setNovaquantidadeLikes(3000);

        System.out.println("\n\nDados modificados:");
        System.out.printf("Imagem atualizada: %s", post.getImagemURL());
        System.out.printf("\nDescrição atualizada: %s", post.getDescricao());
        System.out.printf("\nQuantidade de likes atualizada: %d", post.getNovaquantidadeLikes());

        System.out.println();
        System.out.println("-".repeat(40));
    }
}



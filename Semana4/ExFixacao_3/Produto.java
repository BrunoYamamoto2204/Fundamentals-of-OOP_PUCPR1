package Semana4.ExFixacao_3;

import java.util.ArrayList;
import java.util.Objects;

class Produto {

    public String nome;
    public float preco;
    public int quantidadeEmEstoque;
    public int quantidadeComprada;

    public Produto(String nome, float preco){
        this.nome = nome;
        this.preco = preco;
        this.quantidadeEmEstoque = 0;
        this.quantidadeComprada = 0;
    }

    public void addEstoque(int n){
        this.quantidadeEmEstoque += n;
    }

    public void removerEstoque(int n){
        this.quantidadeEmEstoque -= n;
        this.quantidadeComprada += n;
    }

    public String toString(){
        return nome+"\n"+"Quantidade em estoque: "+quantidadeEmEstoque;
    }
}

class CarrinhoDeCompras {
    // Atributos
    private ArrayList<Produto> carrinho;

    // Construtor
    public CarrinhoDeCompras (){
        this.carrinho = new ArrayList<Produto>();
    }

    // Métodos
    public void addCarrinho(Produto produto, int qntd) {
        carrinho.add(produto);
        produto.removerEstoque(qntd);
    }
    public void removerCarrinho(Produto produto, int qntd){
        carrinho.remove(produto);
        produto.addEstoque(qntd);
    }
    public float totalCarrinho(){
        float total = 0;
        for(Produto p: carrinho){
            total += p.preco;
        }

        return total;
    }

    public String toString(){
        String result = "Carrinho:\n";
        for (int c = 0; c < carrinho.size(); c++){
            result += "- " + carrinho.get(c).nome + ": "+ carrinho.get(c).quantidadeComprada + "\n";
        }

        return result;
    }

    public static void main(String[] args){

        System.out.println("-".repeat(20) + " Criando itens " + "-".repeat(20));

        Produto banana = new Produto("Banana", 12.50f);
        Produto PcGamer = new Produto("Pc com um i9 de 13a Geração, RTX 4090, 128Gb RAM e SSD 3tb", 20000.50f);
        Produto Pao = new Produto("Pão", 5.50f);

        System.out.println("\n"+banana);
        System.out.println("\n"+PcGamer);
        System.out.println("\n"+Pao);

        System.out.println("-".repeat(20) + " Adicionando estoque " + "-".repeat(20));

        banana.addEstoque(10);
        PcGamer.addEstoque(5);
        Pao.addEstoque(99);

        System.out.println("\n"+banana);
        System.out.println("\n"+PcGamer);
        System.out.println("\n"+Pao);

        System.out.println("-".repeat(20) + " Add Carrinho " + "-".repeat(20));
        CarrinhoDeCompras carrinho = new CarrinhoDeCompras();

        carrinho.addCarrinho(banana, 5);
        carrinho.addCarrinho(PcGamer, 1);
        carrinho.addCarrinho(Pao, 9);

        System.out.println(carrinho);

        System.out.println("\n"+banana);
        System.out.println("\n"+PcGamer);
        System.out.println("\n"+Pao);
    }
}

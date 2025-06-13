package Semana5.ExFixacao.ExFixacao_6;

public class Main {
    public static void main(String[] args) {

        System.out.println("-".repeat(40));

        CarrinhoDeCompras carrinho = new CarrinhoDeCompras();

        carrinho.adicionarCarrinho(new Maquiagem("Batom", "Vermelho"));
        carrinho.adicionarCarrinho(new Maquiagem("Base", "Cor de pele"));
        carrinho.adicionarCarrinho(new Maquiagem("Delineado", "Preto"));

        carrinho.adicionarCarrinho(new Perfume("Perfume A", "Amadeirado"));
        carrinho.adicionarCarrinho(new Perfume("Perfume B", "Floral"));
        carrinho.adicionarCarrinho(new Perfume("Perfume C", "Oriental"));

        Produto p1 =  carrinho.getProduto(1);

        if (p1 instanceof Maquiagem) {
            Maquiagem maquiagem = (Maquiagem) p1;
            System.out.println("Nome: "+maquiagem.getName());
            System.out.println("Cor: "+maquiagem.getCor());
        }

        if (p1 instanceof Perfume) {
            Perfume perfume = (Perfume) p1;
            System.out.println("Nome: "+perfume.getName());
            System.out.println("Fragância: "+perfume.getFragrancia());
        }

        System.out.print("-".repeat(40));
    }
}

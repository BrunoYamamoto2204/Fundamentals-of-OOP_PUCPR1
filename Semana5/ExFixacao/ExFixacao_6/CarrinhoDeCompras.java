package Semana5.ExFixacao.ExFixacao_6;

import java.util.ArrayList;

public class CarrinhoDeCompras {

    protected ArrayList<Produto> carrinho;

    public CarrinhoDeCompras() {
        this.carrinho = new ArrayList<Produto>();
    }

    public void adicionarCarrinho (Produto p) {
        carrinho.add(p);
    }

    public Produto getProduto (int index) {
        return carrinho.get(index);
    }
}

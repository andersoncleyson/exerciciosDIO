package javacore.collections.set.Map.tests;

import javacore.collections.set.Map.domain.EstoqueProdutos;
import javacore.collections.set.Map.domain.Produto;

import java.util.HashMap;
import java.util.Locale;
import java.util.Map;

public class EstoqueProdutosTest01 {
    public static void main(String[] args) {
        EstoqueProdutos produtos = new EstoqueProdutos();

        produtos.adicionarProduto(1234566L, new Produto("Café", 20, 15.00));
        produtos.adicionarProduto(1234577L, new Produto("Leite", 15, 9.25));
        produtos.adicionarProduto(1234588L, new Produto("Sal", 30, 6.40));
        produtos.adicionarProduto(1234599L, new Produto("Feijão", 16, 12.00));
        produtos.adicionarProduto(1234511L, new Produto("Açucar", 25, 6.50));
        produtos.adicionarProduto(1234522L, new Produto("Trigo", 35, 8.40));

        produtos.exibirProdutos();
        System.out.println("------------------------");
        produtos.calcularValorTotalEstoque();
        System.out.println("===== PRODUTO MAIS CARO =====");
        System.out.println(produtos.obterProdutoMaisCaro());
        System.out.println("===== PRODUTO MAIS BARATO ====");
        System.out.println(produtos.obterProdutoMaisBarato());
        produtos.obterProdutoMaiorQuantidadeValorTotalNoEstoque();
    }
}

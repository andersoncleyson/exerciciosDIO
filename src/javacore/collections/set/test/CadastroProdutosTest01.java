package javacore.collections.set.test;

import javacore.collections.set.Ordenacao.CadastroProdutos;

public class CadastroProdutosTest01 {
    public static void main(String[] args) {
        CadastroProdutos produtos = new CadastroProdutos();

        produtos.adicionarProduto(123456, "Chocolate", 5.00, 3);
        produtos.adicionarProduto(123457, "Refrigerante", 10.00, 1);
        produtos.adicionarProduto(123458, "Monster", 10.00, 1);
        produtos.adicionarProduto(123459, "Tekitos", 7.00, 2);

        System.out.println(produtos.exibirProdutosPorNome());
        System.out.println(produtos.exibirProdutosPorPreco());

    }
}

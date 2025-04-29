package javacore.collections.set.Map.domain;

import java.util.HashMap;
import java.util.Map;

public class EstoqueProdutos {
    Map<Long, Produto> produtos;

    public EstoqueProdutos() {
        this.produtos = new HashMap<>();
    }

    public void adicionarProduto(Long codigo, Produto produto){
        produtos.put(codigo, produto);
    }

    public void exibirProdutos(){
        for(Map.Entry<Long, Produto> entry: produtos.entrySet()){
            Long cod = entry.getKey();
            Produto produto = entry.getValue();
            System.out.println(cod + " = " + produto);
        }
    }

    public void calcularValorTotalEstoque(){
        Double valorTotalEstoque = 0.0;
        for(Map.Entry<Long, Produto> entry: produtos.entrySet()){
            Double valorProduto = entry.getValue().getPreco() * entry.getValue().getQuantidade();
            valorTotalEstoque += valorProduto;
        }

        System.out.println("Valor total do estoque: R$" + valorTotalEstoque);
    }

    public Produto obterProdutoMaisCaro(){
        Produto produtoMaisCaro = null;
        double maiorPreco = Double.MIN_VALUE;
        if (!produtos.isEmpty()){
            for (Produto p: produtos.values()){
                if(p.getPreco() > maiorPreco){
                    maiorPreco = p.getPreco();
                    produtoMaisCaro = p;
                }
            }
        }

        return produtoMaisCaro;

    }

    public Produto obterProdutoMaisBarato(){
        Produto produtoMaisBarato = null;
        double menorPreco = Double.MAX_VALUE;
        if (!produtos.isEmpty()){
            for (Produto p: produtos.values()){
                if(p.getPreco() < menorPreco){
                    menorPreco = p.getPreco();
                    produtoMaisBarato = p;
                }
            }
        }

        return produtoMaisBarato;


    }

    public void obterProdutoMaiorQuantidadeValorTotalNoEstoque(){
        int quantidadeTotal = 0;
        if (!produtos.isEmpty()){
            for (Produto p: produtos.values()){
                quantidadeTotal += p.getQuantidade();
            }
        }

        System.out.println(quantidadeTotal);

    }

}

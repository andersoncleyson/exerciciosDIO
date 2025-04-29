package javacore.collections.set.Map.domain;

public class Produto {
    private String nome;
    private Double preco;
    private Integer quantidade;

    public Produto(){}

    public Produto(String nome, Integer quantidade, Double preco) {
        this.nome = nome;
        this.quantidade = quantidade;
        this.preco = preco;
    }

    public String getNome() {
        return nome;
    }

    public Double getPreco() {
        return preco;
    }

    public Integer getQuantidade() {
        return quantidade;
    }

    @Override
    public String toString() {
        return "nome: " + nome + " --- " +
                "preco: " + preco + " --- " +
                "quantidade: " + quantidade;
    }
}

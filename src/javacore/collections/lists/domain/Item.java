package javacore.collections.lists.domain;

public class Item {
    private String nome;
    private double price;
    private int quant;

    public Item(String nome, double price, int quant) {
        this.nome = nome;
        this.price = price;
        this.quant = quant;
    }

    public String getNome() {
        return nome;
    }

    public double getPrice() {
        return price;
    }

    public int getQuant() {
        return quant;
    }

    public double valorTotal(){
        double total = this.price * this.quant;
        return total;
    }

    @Override
    public String toString() {
        return nome +
                ", preço = R$" + String.format("%.2f", price) +
                ", quantidade = " + quant;
    }
}

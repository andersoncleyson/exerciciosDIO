package javacore.collections.lists.domain;

import java.util.ArrayList;
import java.util.List;

public class CarrinhoCompras {
    private List<Item> listItens;

    public CarrinhoCompras() {
        this.listItens = new ArrayList<>();
    }

    public void adicionarItem(String name, double price, int quant) {
        listItens.add(new Item(name, price, quant));
    }

    public void removerItem(Item item) {
        List<Item> itemsToDelete = new ArrayList<>();
        for(Item itemDelete: listItens){
            if (itemDelete.getNome().equalsIgnoreCase(item.getNome())){
                itemsToDelete.add(itemDelete);
            }
        }

        listItens.removeAll(itemsToDelete);
    }

    public void calcularValorTotal(){
        double total = 0;
        for(Item item: listItens) {
            total += item.valorTotal();
        }
        System.out.printf("Total = R$ %.2f" , total);
    }

    public void exibirItens(){
        int itemN = 0;
        for(Item item: listItens) {
            System.out.printf("%d ", (itemN += 1));
            System.out.println(item);
        }
    }


}

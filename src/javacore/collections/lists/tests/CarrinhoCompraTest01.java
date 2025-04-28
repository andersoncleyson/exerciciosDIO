package javacore.collections.lists.tests;

import javacore.collections.lists.domain.CarrinhoCompras;
import javacore.collections.lists.domain.Item;

import java.util.List;

public class CarrinhoCompraTest01 {
    public static void main(String[] args) {

        CarrinhoCompras carrinhoCompras = new CarrinhoCompras();

        carrinhoCompras.adicionarItem("Manteiga", 5.50, 1);
        carrinhoCompras.adicionarItem("Café", 10.0, 2);
        carrinhoCompras.adicionarItem("Feijão", 10.0, 1);
        carrinhoCompras.adicionarItem("Arroz", 7.0, 1);
        carrinhoCompras.adicionarItem("Monster", 10.0, 1);

        carrinhoCompras.exibirItens();

        carrinhoCompras.calcularValorTotal();
        System.out.println();
        System.out.println();

        carrinhoCompras.removerItem(new Item("Café", 10.0, 2));

        carrinhoCompras.exibirItens();
        carrinhoCompras.calcularValorTotal();


    }
}

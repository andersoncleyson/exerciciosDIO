package javacore.collections.lists.pesquisa.tests;

import javacore.collections.lists.pesquisa.domain.OrdenacaoPessoas;

public class OrdenacaoPessoaTest01 {
    public static void main(String[] args) {
        OrdenacaoPessoas pessoas = new OrdenacaoPessoas();

        pessoas.adicionarPessoa("Anderson", 27, 1.70);
        pessoas.adicionarPessoa("Elliot", 28, 1.77);
        pessoas.adicionarPessoa("Angela", 27, 1.75);
        pessoas.adicionarPessoa("Darlene", 26, 1.74);

        System.out.println("======= LISTA POR ALTURA =======");
        System.out.println(pessoas.ordenarPorAltura());

        System.out.println("======= LISTA POR IDADE ========");
        System.out.println(pessoas.ordenarPorIdade());


    }
}

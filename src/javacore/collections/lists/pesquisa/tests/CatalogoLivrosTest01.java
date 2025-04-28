package javacore.collections.lists.pesquisa.tests;

import javacore.collections.lists.pesquisa.domain.CatalogoLivros;

public class CatalogoLivrosTest01 {
    public static void main(String[] args) {
        CatalogoLivros catalogoLivros = new CatalogoLivros();

        catalogoLivros.adicionarLivro("Neuromancer", "William Gibson", 1984);
        catalogoLivros.adicionarLivro("Cosmos", "Carl Sagan", 1980);
        catalogoLivros.adicionarLivro("Monalisa Overdrive", "William Gibson", 1980);
        catalogoLivros.adicionarLivro("Norwegian Wood", "Haruki Murakami", 1987);
        catalogoLivros.adicionarLivro("Pálido Ponto Azul", "Carl Sagan", 1980);

        System.out.println("|+|+|+|- LIVROS -|+|+|+|");
        catalogoLivros.listarLivros();

        System.out.println();
        System.out.println("----- Resultado da pesquisa por autor -----");
        catalogoLivros.pesquisaPorAutor("William Gibson");

        System.out.println();
        System.out.println("----- Resultado da pesquisa por Livro -----");
        catalogoLivros.pesquisaPorTitulo("Norwegian Wood");

        System.out.println();
        System.out.println("----- Resultado da pesquisa por Ano -----");
        catalogoLivros.pesquisaPorIntervaloAnos(1980, 1984);

    }
}

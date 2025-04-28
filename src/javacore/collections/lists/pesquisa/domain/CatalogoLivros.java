package javacore.collections.lists.pesquisa.domain;

import javax.xml.catalog.Catalog;
import java.util.ArrayList;
import java.util.List;

public class CatalogoLivros {

    private List<Livro> livroList;

    public CatalogoLivros(){
        this.livroList = new ArrayList<>();
    }

    public void adicionarLivro(String titulo, String autor, int anoPublicacao){
        livroList.add(new Livro(titulo, autor, anoPublicacao));
    }

    public void pesquisaPorAutor(String autor){
        List<Livro> livroPorAutor = new ArrayList<>();
        for(Livro nomeAutor: livroList){
            if(nomeAutor.getAutor().equalsIgnoreCase(autor)){
                livroPorAutor.add(nomeAutor);
            }
        }

        for(Livro pesquisaResultado: livroPorAutor){
            System.out.println(pesquisaResultado);
        }

    }

    public void pesquisaPorIntervaloAnos(int anoInicial, int anoFinal){
        List<Livro> livroPorAno = new ArrayList<>();
        for(Livro livroAno: livroList){
            if(livroAno.getAnoPublicacao() >= anoInicial && livroAno.getAnoPublicacao() <= anoFinal){
                livroPorAno.add(livroAno);
            }
        }

        for(Livro livroAno: livroPorAno){
            System.out.println(livroAno);
        }
    }

    public void pesquisaPorTitulo(String titulo){
        List<Livro> livroPorTitulo = new ArrayList<>();
        for(Livro nomeTitulo: livroList){
            if(nomeTitulo.getAutor().equalsIgnoreCase(titulo)){
                livroPorTitulo.add(nomeTitulo);
            }
        }

        for(Livro pesquisaResultado: livroPorTitulo){
            System.out.println(pesquisaResultado);
        }
    }

    public void listarLivros(){
        for (Livro lista: livroList){
            System.out.println(lista);
        }
    }
}

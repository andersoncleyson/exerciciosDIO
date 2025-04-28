package javacore.collections.lists.pesquisa.tests;

import javacore.collections.lists.pesquisa.domain.SomaNumeros;

import java.util.Random;

public class SomaNumerosTest01 {
    public static void main(String[] args) {
        Random gerador = new Random();

        SomaNumeros numeros = new SomaNumeros();

        for (int i = 0; i < 20; i++){
            numeros.adicionarNumero(gerador.nextInt(26));
        }

        System.out.println("====== NÚMEROS DA LISTA ======");
        numeros.exibirNumeros();
        System.out.println();
        System.out.println();
        numeros.calcularSoma();
        numeros.encontrarMaiorNumero();
        numeros.encontrarMenorNumero();


    }
}

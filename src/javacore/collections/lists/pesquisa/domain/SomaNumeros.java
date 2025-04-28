package javacore.collections.lists.pesquisa.domain;

import java.util.ArrayList;
import java.util.List;

public class SomaNumeros {
    List<Integer> numeros;

    public SomaNumeros() {
        this.numeros = new ArrayList<>();
    }

    public void adicionarNumero(int n){
        numeros.add(n);
    }

    public void calcularSoma(){
        int somaNumeros = 0;
        for (Integer numero: numeros){
            somaNumeros += numero;
        }

        System.out.printf("Soma dos números: %d\n", somaNumeros);
    }

    public void encontrarMaiorNumero(){
        int maiorNumero = 0;

        for (Integer numero: numeros){
            if (numero > maiorNumero){
                maiorNumero = numero;
            }
        }
        System.out.printf("Maior número: %d\n", maiorNumero);
    }

    public void encontrarMenorNumero(){
        int menorNumero = 0;
        for (Integer numero: numeros){
            if(numero < menorNumero){
                menorNumero = numero;
            }
        }

        System.out.printf("Menor número: %d\n", menorNumero);

    }

    public void exibirNumeros(){
        for(Integer numero: numeros) {
            System.out.printf("%d ", numero);
        }
    }
}

package javacore.collections.set.test;

import javacore.collections.set.domain.ConjuntoConvidados;

public class ConjuntoConvidadosTest01 {
    public static void main(String[] args) {
        ConjuntoConvidados convidados = new ConjuntoConvidados();

        convidados.adicionarConvidado("Anderson", 123456);
        convidados.adicionarConvidado("Darlene", 234564);
        convidados.adicionarConvidado("Elliot", 234789);
        convidados.adicionarConvidado("Shayla", 235456);
        convidados.adicionarConvidado("Angela", 235456);

        System.out.println("====== NÚMERO DE CONVIDADOS ======");
        System.out.println(convidados.contarConvidados());
        System.out.println("====== CONVIDADOS ========");
        convidados.exibirConvidados();

        convidados.removerConvidadoPorCodigoConvite(235456);

        System.out.println("====== NÚMERO DE CONVIDADOS ======");
        System.out.println(convidados.contarConvidados());
        System.out.println("====== CONVIDADOS ========");
        convidados.exibirConvidados();


    }
}

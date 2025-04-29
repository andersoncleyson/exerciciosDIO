package javacore.collections.set.Map.tests;

import javacore.collections.set.Map.domain.AgendaContatos;

import java.sql.SQLOutput;

public class AgendaContatoTest01 {
    public static void main(String[] args) {
        AgendaContatos agenda = new AgendaContatos();

        agenda.adicionarContato("Shayla", 98542342);
        agenda.adicionarContato("Leon", 98541222);
        agenda.adicionarContato("Jessica", 98544578);
        agenda.adicionarContato("Gaby", 98548956);

        agenda.exibirContatos();
        System.out.println();
        System.out.println("====== RESULTADO PESQUISA POR NOME =====");
        System.out.println(agenda.pesquisarPorNome("Jessica"));
        System.out.println();
        System.out.println("====== REMOVENDO CONTATO ======");
        agenda.removerContato("Shayla");
        System.out.println();
        agenda.exibirContatos();
    }
}

package javacore.collections.set.test;

import javacore.collections.set.Pesquisa.AgendaContatos;

public class AgendaContatosTest01 {
    public static void main(String[] args) {
        AgendaContatos contatos = new AgendaContatos();

        contatos.adicionarContato("Anderson", 99154765);
        contatos.adicionarContato("Shayla", 99154578);
        contatos.adicionarContato("Leon", 99151235);
        contatos.adicionarContato("Olivia", 99151245);

        contatos.exibirContatos();
        System.out.println("================");
        contatos.pesquisarPorNome("Olivia");
        System.out.println(contatos.atulizarNumeroContato("Shayla", 99154579));
        System.out.println("===============");
        contatos.exibirContatos();
    }
}

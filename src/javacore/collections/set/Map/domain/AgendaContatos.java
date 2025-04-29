package javacore.collections.set.Map.domain;

import java.util.HashMap;
import java.util.Map;

public class AgendaContatos {

    private Map<String, Integer> agendaContatoMap;

    public Map<String, Integer> getAgendaContatoMap() {
        return agendaContatoMap;
    }

    public AgendaContatos() {
        this.agendaContatoMap = new HashMap<>();
    }

    public void adicionarContato(String nome, Integer telefone){
        agendaContatoMap.put(nome, telefone);
    }

    public void removerContato(String nome){
        System.out.printf("Excluindo %s\n", nome);
        if(!agendaContatoMap.isEmpty()){
            agendaContatoMap.remove(nome);
        }
    }

    public void exibirContatos(){
        for(Map.Entry<String, Integer> entry: agendaContatoMap.entrySet()){
            String nome = entry.getKey();
            Integer numero = entry.getValue();
            System.out.println(nome + ": " + numero);
        }
    }

    public Map.Entry<String, Integer> pesquisarPorNome(String nome){
        if (agendaContatoMap.containsKey(nome)){
            return Map.entry(nome, agendaContatoMap.get(nome));
        }

        return null;
    }

    @Override
    public String toString() {
        return "AgendaContatos{" +
                "agendaContatoMap=" + agendaContatoMap +
                '}';
    }
}

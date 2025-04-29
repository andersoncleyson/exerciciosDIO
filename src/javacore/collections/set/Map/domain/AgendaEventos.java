package javacore.collections.set.Map.domain;

import java.time.LocalDate;
import java.util.*;

public class AgendaEventos {
    Map<LocalDate, Evento> evento;

    public AgendaEventos() {
        this.evento = new TreeMap<>();
    }

    public void adicionarEvento(LocalDate data, String nome, String atracao){
        evento.put(data, new Evento(nome, atracao));
    }

    public void exibirAgenda(){
        for(Map.Entry<LocalDate, Evento> entry: evento.entrySet()){
            LocalDate data = entry.getKey();
            Evento evento = entry.getValue();
            System.out.println("Data: " + data + " Evento: " + evento);
        }
    }

    public void obterProximoEvento() {
        //Set<LocalDate> dataSet = evento.keySet();
        //Collection<Evento> values = evento.values();

        LocalDate dataAtual = LocalDate.now();
        Map<LocalDate, Evento> eventosTreeMap = new TreeMap<>(evento);
        for(Map.Entry<LocalDate, Evento> entry: eventosTreeMap.entrySet()){
            if(entry.getKey().isEqual(dataAtual) || entry.getKey().isAfter(dataAtual)){
                System.out.println("O próximo evento: " + entry.getValue() + " acontecerá nada data " + entry.getKey());
                break;
            }
        }
    }

}

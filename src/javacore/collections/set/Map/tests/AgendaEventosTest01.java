package javacore.collections.set.Map.tests;

import javacore.collections.set.Map.domain.AgendaEventos;
import javacore.collections.set.Map.domain.Evento;

import java.time.LocalDate;
import java.time.Month;

public class AgendaEventosTest01 {
    public static void main(String[] args) {
        AgendaEventos agendaEventos = new AgendaEventos();

        agendaEventos.adicionarEvento(LocalDate.of(2025, Month.APRIL, 30), "Evento 1", "Atração 1");
        agendaEventos.adicionarEvento(LocalDate.of(2024, Month.AUGUST, 24), "Evento 2", "Atração 2");
        agendaEventos.adicionarEvento(LocalDate.of(2023, Month.SEPTEMBER, 20), "Evento 3", "Atração 3");
        agendaEventos.adicionarEvento(LocalDate.of(2022, Month.JULY, 7), "Evento 4", "Atração 4");

        agendaEventos.exibirAgenda();
        agendaEventos.obterProximoEvento();



    }
}

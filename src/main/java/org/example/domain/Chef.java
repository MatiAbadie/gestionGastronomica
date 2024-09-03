package org.example.domain;

import java.util.List;
import java.util.UUID;
import java.util.ArrayList; // import the ArrayList class
import org.example.domain.EventoGastronomico;

public class Chef {
    private UUID id;
    private String nombre;
    private String especialidad;
    private List<EventoGastronomico> eventos;

    public Chef(String nombre, String especialidad, List<EventoGastronomico> eventos) {

        this.id = UUID.randomUUID();
        this.nombre = nombre;
        this.especialidad = especialidad;
        this.eventos = eventos;

    }
    //Metodos getters y setters

    public UUID getId() {
        return id;
    }

    public void setId(UUID id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getEspecialidad() {
        return especialidad;
    }

    public void setEspecialidad(String especialidad) {
        this.especialidad = especialidad;
    }

    public List<EventoGastronomico> getEventos() {
        return this.eventos;
    }

    public void setEventos(List<EventoGastronomico> eventos) {
        this.eventos = eventos;
    }
}

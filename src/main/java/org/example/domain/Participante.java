package org.example.domain;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

public class Participante {
    private UUID id;
    private String nombre;
    private String apellido;
    private List<String> interesesCulinarios;
    private List<EventoGastronomico> historialEventos;

    public Participante(String nombre, String apellido, List<String> interesesCulinarios) {

        this.id = UUID.randomUUID();
        this.nombre = nombre;
        this.apellido = apellido;
        this.interesesCulinarios = interesesCulinarios;
        this.historialEventos = new ArrayList<>();


    }

    //Metdodos getters u setters


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

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public List<String> getInteresesCulinarios() {
        return interesesCulinarios;
    }

    public void setInteresesCulinarios(List<String> interesesCulinarios) {
        this.interesesCulinarios = interesesCulinarios;
    }

    public List<EventoGastronomico> getHistorialEventos() {
        return historialEventos;
    }

    public void setHistorialEventos(List<EventoGastronomico> historialEventos) {
        this.historialEventos = historialEventos;
    }
}

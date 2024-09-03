package org.example.domain;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

public class Organizador {
    private UUID id;
    private String nombre;
    private List<EventoGastronomico> eventos;

    public Organizador(String nombre) {
        this.id = UUID.randomUUID();
        this.nombre = nombre;
        this.eventos = new ArrayList<>();
    }


    //Metodos para gestionar eventos:

    // Método para agregar un evento
    public void agregarEvento(EventoGastronomico evento) {
        if (evento != null && !eventos.contains(evento)) {
            eventos.add(evento); // Añade el evento a la lista
            System.out.println("Evento agregado exitosamente.");
        } else {
            System.out.println("El evento no es válido o ya está agregado.");
        }
    }

    // Método para eliminar un evento
    public void eliminarEvento(EventoGastronomico evento) {
        if (eventos.remove(evento)) {
            System.out.println("Evento eliminado exitosamente."); // Elimina el evento de la lista
        } else {
            System.out.println("El evento no se encontró en la lista.");
        }
    }

    // Método para actualizar un evento
    public void actualizarEvento(EventoGastronomico evento, String nuevoNombre, String nuevaDescripcion, int nuevaCapacidad) {
        if (eventos.contains(evento)) {
            evento.setNombre(nuevoNombre); // Actualiza el nombre del evento
            evento.setDescripcion(nuevaDescripcion); // Actualiza la descripción del evento
            evento.setCapacidad(nuevaCapacidad); // Actualiza la capacidad del evento
            System.out.println("Evento actualizado exitosamente.");
        } else {
            System.out.println("El evento no se encontró en la lista.");
        }
    }

    // Método para listar todos los eventos gestionados
    public void listarEventos() {
        if (eventos.isEmpty()) {
            System.out.println("No hay eventos gestionados.");
        } else {
            for (EventoGastronomico evento : eventos) {
                System.out.println(evento.getNombre() + " - " + evento.getDescripcion());
            }
        }
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

    public List<EventoGastronomico> getEventos() {
        return eventos;
    }

    public void setEventos(List<EventoGastronomico> eventos) {
        this.eventos = eventos;
    }
}

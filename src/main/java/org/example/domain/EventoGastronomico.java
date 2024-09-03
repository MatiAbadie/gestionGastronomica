package org.example.domain;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

public class EventoGastronomico {
    private UUID id;
    private String nombre;
    private String descripcion;
    private LocalDateTime fechaHora;
    private String ubicacion;
    private int capacidad;
    private Chef chef;
    private List<Participante> participantes;

    //Constructores:

    public EventoGastronomico(String nombre, String descripcion, LocalDateTime fechaHora,
                              String ubicacion, int capacidad, Chef chef) {
        this.id = UUID.randomUUID();
        this.nombre = nombre;
        this.descripcion = descripcion;
        this.fechaHora = fechaHora;
        this.ubicacion = ubicacion;
        this.capacidad = capacidad;
        this.chef = chef;
        this.participantes = new ArrayList<>();
    }

    // Métodos para agregar participantes, verificar capacidad, etc.

    // Método para agregar un participante al evento
    public boolean agregarParticipante(Participante participante) {
        if (participantes.size() < capacidad) { // Verifica si hay espacio disponible
            if (!participantes.contains(participante)) { // Verifica que el participante no esté ya inscrito
                participantes.add(participante); // Añade el participante a la lista
                System.out.println("Participante agregado exitosamente.");
                return true;
            } else {
                System.out.println("El participante ya está registrado en el evento.");
                return false;
            }
        } else {
            System.out.println("El evento ha alcanzado su capacidad máxima.");
            return false;
        }
    }

    // Método para verificar si el evento tiene espacio disponible
    public boolean tieneEspacio() {
        return participantes.size() < capacidad;
    }

    // Método para eliminar un participante del evento
    public boolean eliminarParticipante(Participante participante) {
        if (participantes.remove(participante)) { // Remueve al participante si está registrado
            System.out.println("Participante eliminado del evento.");
            return true;
        } else {
            System.out.println("El participante no está registrado en el evento.");
            return false;
        }
    }

    // Método para listar los participantes del evento
    public void listarParticipantes() {
        if (participantes.isEmpty()) {
            System.out.println("No hay participantes inscritos en este evento.");
        } else {
            System.out.println("Participantes inscritos:");
            for (Participante participante : participantes) {
                System.out.println(participante.getNombre() + " " + participante.getApellido());
            }
        }
    }

    // Métodos getters y setters


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

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public LocalDateTime getFechaHora() {
        return fechaHora;
    }

    public void setFechaHora(LocalDateTime fechaHora) {
        this.fechaHora = fechaHora;
    }

    public String getUbicacion() {
        return ubicacion;
    }

    public void setUbicacion(String ubicacion) {
        this.ubicacion = ubicacion;
    }

    public int getCapacidad() {
        return capacidad;
    }

    public void setCapacidad(int capacidad) {
        this.capacidad = capacidad;
    }

    public Chef getChef() {
        return chef;
    }

    public void setChef(Chef chef) {
        this.chef = chef;
    }

    public List<Participante> getParticipantes() {
        return participantes;
    }

    public void setParticipantes(List<Participante> participantes) {
        this.participantes = participantes;
    }

    @Override
    public String toString() {
        return "EventoGastronomico{" +
                "Id='" + id +
                "  nombre='" + nombre +
                "\n" +
                '}';
    }
}

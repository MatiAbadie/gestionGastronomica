package org.example.domain;

import java.util.UUID;

public class Reseña {
    private UUID id;
    private Participante participante;
    private EventoGastronomico evento;
    private int calificacion;
    private String comentario;

    public Reseña(Participante participante, EventoGastronomico evento, int calificacion, String comentario) {
        this.id = UUID.randomUUID();
        this.participante = participante;
        this.evento = evento;
        this.calificacion = calificacion;
        this.comentario = comentario;

    }

    //Metodos getters y setters:

    public UUID getId() {
        return id;
    }

    public void setId(UUID id) {
        this.id = id;
    }

    public Participante getParticipante() {
        return participante;
    }

    public void setParticipante(Participante participante) {
        this.participante = participante;
    }

    public EventoGastronomico getEvento() {
        return evento;
    }

    public void setEvento(EventoGastronomico evento) {
        this.evento = evento;
    }

    public int getCalificacion() {
        return calificacion;
    }

    public void setCalificacion(int calificacion) {
        this.calificacion = calificacion;
    }

    public String getComentario() {
        return comentario;
    }

    public void setComentario(String comentario) {
        this.comentario = comentario;
    }
}

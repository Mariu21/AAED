package com.sanvalero.aaed.domain;
import java.util.Objects;

import java.util.Objects;

import java.util.Objects;

public class Vuelo {
    String nvuelo;
    String origen;
    String destino;
    String fecha;
    String horario;
    float km;
    int escala ;
    



    public Vuelo(String nvuelo, String origen,String destino, String fecha,
                 String horario, float km, int escala) {

        this.nvuelo=nvuelo;
        this.origen=origen;
        this.destino=destino;
        this.fecha=fecha;
        this.horario=horario;
        this.km=km;
        this.escala=escala;
    }


    public String getNvuelo() {
        return nvuelo;
    }

    public void setNvuelo(String nvuelo) {
        this.nvuelo = nvuelo;
    }

    public String getOrigen() {
        return origen;
    }

    public void setOrigen(String origen) {
        this.origen = origen;
    }

    public String getDestino() {
        return destino;
    }

    public void setDestino(String destino) {
        this.destino = destino;
    }

    public String getFecha() {
        return fecha;
    }

    public void setFecha(String fecha) {
        this.fecha = fecha;
    }

    public String getHorario() {
        return horario;
    }

    public void setHorario(String horario) {
        this.horario = horario;
    }

    public float getKm() {
        return km;
    }

    public void setKm(float km) {
        this.km = km;
    }

    public int getEscala() {
        return escala;
    }

    public void setEscala(int escala) {
        this.escala = escala;
    }





    @Override
    public String toString() {
        return "Vuelo{" +
                "Nº Vuelo='" + nvuelo + '\'' +
                ", Origen='" + origen + '\'' +
                ", Destino='" + destino + '\'' +
                ", Fecha del vuelo='" + fecha + '\'' +
                ", Hora de salida='" + horario + '\'' +
                ", Distancia'" + km + " km" + '\'' +
                ", Nº Escalas='" + escala + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }

        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }


        final Vuelo other = (Vuelo) obj;
        if (!Objects.equals(this.nvuelo, other.nvuelo)) {
            return false;
        }
        return true;
    }



    @Override
    public int hashCode() {
        return nvuelo.hashCode();
    }


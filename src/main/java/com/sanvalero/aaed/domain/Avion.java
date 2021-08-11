package com.sanvalero.aaed.domain;

import java.util.Objects;

public class Avion {
    String modelo;
    String numSerie;
    String compania;
    int asiento;
    float combustible;
    float pesoavion;




    public Avion(String modelo, String numSerie, String compania, int asiento,
                 float combustible, float pesoavion) {
        this.modelo = modelo;
        this.numSerie = numSerie;
        this.compania = compania;
        this.asiento = asiento;
        this.combustible = combustible;
        this.pesoavion = pesoavion;

    }


    public String getModelo() {

        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public String getNumSerie() {
        return numSerie;
    }

    public void setNumSerie(String numSerie) {
        this.numSerie = numSerie;
    }

    public String getCompania() {
        return compania;
    }

    public void setCompania(String compania) {
        this.compania = compania;

    }


    public int getAsiento() {
        return asiento;
    }

    public void setAsiento(int asiento) {
        this.asiento = asiento;
    }


    public float getCombustible() {
        return combustible;
    }

    public void setCombustible(float combustible) {
        this.combustible = combustible;

    }

    public float getPesoavion() {
        return pesoavion;
    }

    public void setPesoavion(float pesoavion) {
        this.pesoavion = pesoavion;

    }

    @Override
    public String toString() {
        return String.valueOf("Avion{" +
                "Modelo='" + modelo + '\'' +
                "Número de serie='" + numSerie + '\'' +
                ", Compañia='" + compania + '\'' +
                ", Nº asientos='" + asiento + '\'' +
                ", Combustible='" + combustible + " litros" + '\'' +
                ", peso='" + pesoavion + " kg" + '\'' +
                '}');
    }

    @Override
    public int hashCode() {
        return numSerie.hashCode();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Avion)) return false;
        Avion avion = (Avion) o;
        return Objects.equals(getNumSerie(), avion.getNumSerie());
    }

}

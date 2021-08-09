package com.sanvalero.aaed.domain;

import java.util.Objects;

public class Avion {
    String modelo;
    String numSerie;
    String compania;
    int asiento;
    float combustible;
    float pesoavion;



    public Avion(String modelo, String numSerie,String compania, int asiento,
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

    public Avion setModelo(String modelo) {
        this.modelo = modelo;
        return null;
    }

    public String getNumSerie() {
        return numSerie;
    }

    public Avion setNumSerie(String numSerie) {
        this.numSerie = numSerie;
        return null;
    }


    public String getCompania() {
        return compania;
    }

    public Avion setCompania(String compania) {
        this.compania = compania;
        return null;
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

    public Avion setCombustible(float combustible) {
        this.combustible = combustible;
        return null;
    }

    public float getPesoavion() {
        return pesoavion;
    }

    public Avion setPesoavion(float pesoavion) {
        this.pesoavion = pesoavion;
        return null;
    }



    @Override
    public String toString() {
        return String.valueOf("Avion{" +
                "Modelo='" + modelo + '\'' +
                "Número de serie='" + numSerie + '\'' +
                ", Compañia='" + compania + '\'' +
                ", Nº asientos='" + asiento + '\'' +
                ", Combustible='" + combustible + " litros" +'\'' +
                ", peso='" + pesoavion + " kg" + '\'' +
                '}');
    }

    @Override
    public int hashCode() {
        return modelo.concat(compania).concat(numSerie).hashCode();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Avion other = (Avion) obj;
        if (!Objects.equals(this.modelo, other.modelo)) {
            return false;
        }
        if (!Objects.equals(this.numSerie, other.numSerie)) {
            return false;
        }
        return true;
    }

}

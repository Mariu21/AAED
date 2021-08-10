package com.sanvalero.aaed.domain;
import java.util.Objects;

import java.util.Objects;

public class Pasajero {
    String nombre;
    String apellido;
    int edad;
    String dni;
    String email;
    int equipaje;
    float pesoequipaje;

   
    Vuelo vuelo;

    public Pasajero() {

    }

    public Pasajero(String nombre, String apellido, int edad, String dni,
                    String email, int equipaje, float pesoequipaje) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.edad = edad;
        this.dni = dni;
        this.email = email;
        this.equipaje = equipaje;
        this.pesoequipaje = pesoequipaje;


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

    public String getDni() {
        return dni;
    }

    public void setDni(String dni) {
        this.dni = dni;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public int getEquipaje() {
        return equipaje;
    }

    public void setEquipaje(int equipaje) {
        this.equipaje = equipaje;
    }

    public float getPesoequipaje() {
        return pesoequipaje;
    }

    public void setPesoequipaje(float pesoequipaje) {
        this.pesoequipaje = pesoequipaje;
    }

    public Avion getAvion() {
        return avion;
    }

    public void setAvion(Avion avion) {
        this.avion = avion;
    }

    public Vuelo getVuelo() {
        return vuelo;
    }

    public void setVuelo(Vuelo vuelo) {
        this.vuelo = vuelo;
    }


    @Override
    public String toString() {
        return "Pasajero{"
                + "Nombre='" + nombre + '\''
                + ", Apellidos='" + apellido + '\''
                + ", DNI='" + dni + '\''
                + ", Email='" + email + '\''
                + ", Nº de maletas='" + equipaje + '\''
                + ", Peso del equipaje=" + pesoequipaje + "litros"
                + '}';
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }

        final Pasajero other = (Pasajero) obj;
        if (!Objects.equals(this.dni, other.dni)) {
            return false;
        }
        return true;
    }




    @Override
    public int hashCode() {


    String nombre;
    String apellido;
    int edad;
    String dni;
    String email;
    int equipaje;
    float pesoequipaje;

    Avion avion;
    Vuelo vuelo;

    public Pasajero() {

    }

    public Pasajero(String nombre, String apellido, int edad, String dni,
                    String email, int equipaje, float pesoequipaje) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.edad = edad;
        this.dni = dni;
        this.email = email;
        this.equipaje = equipaje;
        this.pesoequipaje = pesoequipaje;


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

    public String getDni() {
        return dni;
    }

    public void setDni(String dni) {
        this.dni = dni;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public int getEquipaje() {
        return equipaje;
    }

    public void setEquipaje(int equipaje) {
        this.equipaje = equipaje;
    }

    public float getPesoequipaje() {
        return pesoequipaje;
    }

    public void setPesoequipaje(float pesoequipaje) {
        this.pesoequipaje = pesoequipaje;
    }

    public Avion getAvion() {
        return avion;
    }

    public void setAvion(Avion avion) {
        this.avion = avion;
    }

    public Vuelo getVuelo() {
        return vuelo;
    }

    public void setVuelo(Vuelo vuelo) {
        this.vuelo = vuelo;
    }


    @Override
    public String toString() {
        return "Pasajero{"
                + "Nombre='" + nombre + '\''
                + ", Apellidos='" + apellido + '\''
                + ", DNI='" + dni + '\''
                + ", Email='" + email + '\''
                + ", Nº de maletas='" + equipaje + '\''
                + ", Peso del equipaje=" + pesoequipaje + "litros"
                + '}';
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }

        final Pasajero other = (Pasajero) obj;
        if (!Objects.equals(this.dni, other.dni)) {
            return false;
        }
        return true;
    }


    @Override
    public int hashCode() {

        return dni.hashCode();
    }


package com.sanvalero.aaed.domain;


import java.util.Objects;

public class Pasajero {
    String nombre;
    String apellido;
    int edad;
    String dni;
    String email;
    int equipaje;
    float pesoequipaje;





    public Pasajero(String nombre, String apellido, int edad, String dni, String email, int equipaje, float pesoequipaje) {
     this.nombre= nombre;
     this.apellido = apellido;
     this.edad = edad;
     this.dni= dni;
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

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
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



    @Override
    public String toString() {
        return "Pasajero{"+
                "Nombre='" + nombre + '\''+
                ", Apellidos='" + apellido + '\''+
                ", Edad" +
                "='" + edad + '\''+
                ", DNI='" + dni + '\''+
                ", Email='" + email + '\''+
                ", Nº de maletas='" + equipaje + '\''+
                ", Peso del equipaje=" + pesoequipaje + "litros"+
                '}';
    }


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Pasajero)) return false;
        Pasajero pasajero = (Pasajero) o;
        return Objects.equals(getDni(), pasajero.getDni());
    }

    @Override
    public int hashCode() {
        return dni.hashCode();
    }

}

package com.sanvalero.aaed;

import com.sanvalero.aaed.domain.Pasajero;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class PasajeroTest {

    @Test

    void registrarPsajero() {
        String nombre = "Pepe";
        String apellido = "Sánchez Sánchez";
        int edad = 35;
        String dni = "25215468G";
        String email = "gidjs@gmail";
        int equipaje= 2;
        float pesoequipaje= 20F;

        Pasajero testPasajero = new Pasajero(nombre, apellido, edad, dni, email, equipaje, pesoequipaje);


        assertEquals(testPasajero.getNombre(), nombre);
        assertEquals(testPasajero.getApellido(), apellido);
        assertEquals(testPasajero.getEdad(), edad);
        assertEquals(testPasajero.getDni(), dni);
        assertEquals(testPasajero.getEmail(), email);
        assertEquals(testPasajero.getEquipaje(), equipaje);
        assertEquals(testPasajero.getPesoequipaje(), pesoequipaje);
    }


    @Test


    void testEqualsPasajero() {

        String nombre = "Pepe";
        String apellido = "Sánchez Sánchez";
        int edad = 35;
        String dni = "25215468G";
        String email = "gidjs@gmail";
        int equipaje= 2;
        float pesoequipaje= 20F;




        Pasajero testPasajero = new Pasajero(nombre, apellido, edad,dni, email, equipaje, pesoequipaje);

        Pasajero otroTestPasajero = new Pasajero(nombre, apellido, edad,dni, email, equipaje, pesoequipaje);

        assertEquals(testPasajero, otroTestPasajero);



    }


}

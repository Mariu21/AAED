package com.sanvalero.aaed;

import com.sanvalero.aaed.domain.Pasajero;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;

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

    public void testEqualsPasajero(){

       Pasajero testP1 = new Pasajero("Pepe", "Garcia Sánchez", 35, "25215468G",
                "gidjs@gmail", 2, 20F);

       Pasajero testP2 = new Pasajero("Pepe", "Garcia Pérez", 35, "28215468P",
                "dfeff@gmail", 2, 20F);
       Pasajero testP3 = new Pasajero("Pepe", "Garcia Pérez", 83, "28215472P",
                "dwdwd@gmail", 1, 5F);

        assertEquals(testP1, testP2);
        assertNotEquals(testP1, testP3);


    }


}

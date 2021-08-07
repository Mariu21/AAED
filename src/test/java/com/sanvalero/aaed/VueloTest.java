package com.sanvalero.aaed;

import com.sanvalero.aaed.domain.Vuelo;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class VueloTest {
    @Test
     void registrarVuelo() {
        String nvuelo = "Pepe";
        String origen= "Zaragoza";
        String destino= "Mallorca";
        String fecha="15/08/2021" ;
        String horario="10:30h" ;
        float km = 68.4F;
        int escala= 0;

        Vuelo testVuelo = new Vuelo (nvuelo, origen, destino, fecha,
                horario, km, escala);


        assertEquals(testVuelo.getNvuelo(), nvuelo);
        assertEquals(testVuelo.getOrigen(), origen);
        assertEquals(testVuelo.getDestino(), destino);
        assertEquals(testVuelo.getFecha(), fecha);
        assertEquals(testVuelo.getHorario(), horario);
        assertEquals(testVuelo.getKm(), km);
        assertEquals(testVuelo.getEscala(), escala);
    }




}

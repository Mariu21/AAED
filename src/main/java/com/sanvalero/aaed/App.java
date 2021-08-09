package com.sanvalero.aaed;
import com.sanvalero.aaed.domain.Avion;
import com.sanvalero.aaed.domain.Pasajero;
import com.sanvalero.aaed.domain.Vuelo;

import java.util.ArrayList;
import java.util.Scanner;

public class App {
    private boolean salir = false;
    private final Scanner teclado;

    ArrayList<Avion> avionArraytList = new ArrayList<>();
    ArrayList<Pasajero> pasajeroArrayList = new ArrayList<>();
    ArrayList<Vuelo> vueloArrayList = new ArrayList<>();

    public App() {
        teclado = new Scanner(System.in);
        menuPrincipal();
    }

    public void menuPrincipal() {

        do {
            System.out.println("*********************************");
            System.out.println("********  MENU PRINCIPAL ********");
            System.out.println("*********************************");
            System.out.println("1. Registrar");
            System.out.println("2. Mostrar");
            System.out.println("3. Salir");
            System.out.println("Elija una opción: ");

            String opcion = teclado.nextLine();
            switch (opcion) {

                case ("1"):
                    menuRegistrar();
                    System.out.println("\n");
                    break;

                case ("2"):
                    menuMostrar();
                    System.out.println("\n");
                    break;

                case ("3"):
                    System.out.println("¡Hasta pronto!");
                    salir = true;
                    break;
                default:
                    System.out.println("No es correcta ");
                    System.out.println("Elija de nuevo una opción: ");

            }

        } while (!salir);
    }

    private void menuRegistrar() {

        while (true) {
            System.out.println("");
            System.out.println("******** REGISTRAR ********");
            System.out.println("*********************************");

            System.out.println("REGISTRA UNA OPCIÓN: ");
            System.out.println("1. Pasajero");
            System.out.println("2. Avión");
            System.out.println("3. Vuelo");
            System.out.println("4. Volver al menú principal");
            System.out.println("Elija una opción: ");

            String opcion = teclado.nextLine();

            switch (opcion) {

                case ("1"):
                    registrarPasajero();
                    System.out.println("\n");
                    break;

                case ("2"):
                    registrarAvion();
                    System.out.println("\n");
                    break;
                case ("3"):
                    registrarVuelo();
                    System.out.println("\n");
                    break;

                case ("4"):
                    menuPrincipal();
                    break;
            }

        }

    }

    private void registrarPasajero() {

        Scanner sc = new Scanner(System.in);
        System.out.println("Introduce los siguientes datos del pasajero: ");
        //Nombre
        System.out.println("Nombre: ");
        String nombre = sc.nextLine();
        //Apellidos
        System.out.println("Apellidos: ");
        String apellido = sc.nextLine();
        //Edad
        System.out.println("Edad: ");
        int edad = sc.nextInt();
        //DNI
        System.out.println("DNI: ");
        String dni = sc.nextLine();
        //Email
        System.out.println("Email: ");
        String email = sc.nextLine();
        //Número de maletas
        System.out.println("Introduce el número de maletas: ");
        int equipaje = sc.nextInt();
        //Peso de equipaje
        System.out.println("Introduce el peso del equipaje aprox.: ");
        float pesoequipaje = sc.nextFloat();


        Pasajero pasajero = new Pasajero(nombre, apellido, edad, dni, email,
                equipaje, pesoequipaje);

        pasajeroArrayList.add(pasajero);

        System.out.println("Los datos se han guardado correctamente.");

    }

    private void registrarAvion() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Introduce los siguientes datos del avión: ");
        //Modelo del avión
        System.out.println("Modelo: ");
        String modelo = sc.nextLine();
        //Número de serie del avión
        System.out.println("Número de serie: ");
        String numSerie = sc.nextLine();
        //Compañía aréa
        System.out.println("Compañia aérea: ");
        String compania = sc.nextLine();
        //Número total de asientos
        System.out.println("Número total de asientos: ");
        int asiento = sc.nextInt();
        //Litros de combustible
        System.out.println("Litros de combustible: ");
        float combustible = sc.nextFloat();
        //Peso total del avión
        System.out.println("Peso en Kg del avión: ");
        float pesoavion = sc.nextFloat();

        Avion avion = new Avion(modelo, numSerie, compania, asiento, combustible, pesoavion);

        avionArraytList.add(avion);

        System.out.println("Los datos se han guardado correctamente.");

    }

    private void registrarVuelo() {

        Scanner sc = new Scanner(System.in);
        System.out.println("Introduce los siguientes datos del vuelo: ");
        //Número de vuelo
        System.out.println("Número de vuelo: ");
        String nvuelo = sc.nextLine();
        //Ciudad de origen del vuelo
        System.out.println("Ciudad origen: ");
        String origen = sc.nextLine();
        //Ciudad de destino del vuelo
        System.out.println("Ciudad destino: ");
        String destino = sc.nextLine();
        //Fecha salida de vuelo
        System.out.println("Fecha del vuelo: ");
        String fecha = sc.nextLine();
        //Hora de salida
        System.out.println("Hora de salida: ");
        String horario = sc.nextLine();
        //Distancia a recorrer(km)
        System.out.println("Distancia (km): ");
        float km = sc.nextFloat();
        //Número de escalas
        System.out.println("Número de escalas: ");
        int escala = sc.nextInt();

        Vuelo vuelo = new Vuelo(nvuelo, origen, destino, fecha, horario, km, escala);

        vueloArrayList.add(vuelo);

        System.out.println("Los datos han sido guardados correctamente.");

    }





}

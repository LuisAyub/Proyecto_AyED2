/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ayed2_proyecto_parte1;

/**
 *
 * @author Luigi PC
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Administracion alasUcu = new Administracion();
        alasUcu.cargarDatos("./src/ayed2_proyecto_parte1/Aerolineas.csv","./src/ayed2_proyecto_parte1/Aeropuertos.csv","./src/ayed2_proyecto_parte1/vuelos_test.csv");
        alasUcu.obtenerCaminos("JFK", "LAX");
        System.out.println(" ------------------ ");
        alasUcu.obtenerCaminos("MIA", "");
        System.out.println(" ------------------ ");
        alasUcu.obtenerCaminos("", "MIA");
        System.out.println(" ------------------ ");
        alasUcu.obtenerCaminos("06N", "MIA");
    }
    
}

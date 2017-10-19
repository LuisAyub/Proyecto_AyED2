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
        String[] aerolineas = ManejadorArchivosGenerico.leerArchivo("./src/ayed2_proyecto_parte1/Aerolineas.csv", false);
        Administracion alasUcu = new Administracion();
        for (String a: aerolineas){
            String[] datos = a.split(",");
            alasUcu.cargarAerolineas(datos[0], datos[1]);
        }
        alasUcu.cargarAeropuertos("./src/ayed2_proyecto_parte1/Aeropuertos.csv");
        alasUcu.cargarVuelos("./src/ayed2_proyecto_parte1/vuelos_test.csv");
        alasUcu.cargarGrafos();
        alasUcu.obtenerCaminos("JFK", "LAX");
    }
    
}

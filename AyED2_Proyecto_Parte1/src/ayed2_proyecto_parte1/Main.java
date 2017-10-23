package ayed2_proyecto_parte1;

/**
 * Clase que se encarga de iniciar el programa, y de cargar las estructuras de
 * datos.
 * @author Luis Ayub
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Administracion alasUcu = new Administracion();
        alasUcu.cargarDatos("./src/ayed2_proyecto_parte1/Aerolineas.csv",
                "./src/ayed2_proyecto_parte1/Aeropuertos.csv",
                "./src/ayed2_proyecto_parte1/vuelos_test.csv");
        TVuelos v = alasUcu.obtenerCaminos("LAX", "JFK");
        System.out.println(alasUcu.imprimirVuelos(v));
//        System.out.println(" ------------------ ");
//        alasUcu.obtenerCaminos("MIA", "");
//        System.out.println(" ------------------ ");
//        alasUcu.obtenerCaminos("", "MIA");
//        System.out.println(" ------------------ ");
//        alasUcu.obtenerCaminos("06N", "MIA");
    }
    
}

package ayed2_proyecto_parte1;
import java.util.Collection;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.Map;

/**
 * Clase que contiene todas las funciones solicitadas.
 * @author Luis Ayub
 */
public class Administracion {
    private Map<Comparable,Aerolinea> aerolineas;
    private Collection<TVertice> aeropuertos;
    
    /**
     * Constructor de la clase, se encarga de inicializar las variables de 
     * clase aerolineas y aeropuertos.
     */
    public Administracion(){
        aerolineas = new HashMap();
        aeropuertos = new LinkedList();
    }
    
    /**
     * Metodo que se encarga de cargar los datos de las aerolineas, aeropuertos,
     * y vuelos a realizar.
     * @param ruta1 ruta donde se encuentra los datos de las aerolineas.
     * @param ruta2 ruta donde se encuentra los datos de los aeropuertos.
     * @param ruta3 ruta donde se encuentra los datos de los vuelos.
     */
    
    public void cargarDatos(String ruta1, String ruta2, String ruta3) {
        cargarAerolineas(ruta1);
        cargarAeropuertos(ruta2);
        cargarVuelos(ruta3);
        cargarGrafos();
    }
    
    private void cargarAerolineas(String ruta){
        String[] datosAerolineas = ManejadorArchivosGenerico.leerArchivo(ruta, false);
        for (String aero: datosAerolineas){
            String[] datos = aero.split(",");
            Aerolinea a = new Aerolinea(datos[0],datos[1]);
            aerolineas.put(datos[0],a);
        }
    }
    
    private void cargarAeropuertos(String ruta){
        String[] listaAeropuertos = ManejadorArchivosGenerico.leerArchivo(ruta, false);
        for (String d: listaAeropuertos){
            String[] datos = d.split(",");
            TVertice v = new TVertice(datos[0]);
            aeropuertos.add(v);
        } 
    }
    
    private void cargarVuelos(String ruta){
        String[] conexiones = ManejadorArchivosGenerico.leerArchivo(ruta, false);
        for (String d: conexiones){
            String[] datos = d.split(",");
            if (aerolineas.containsKey(datos[0])){
                TArista vuelo = new TArista(datos[1], datos[2], Double.parseDouble(datos[3]));
                aerolineas.get(datos[0]).getVuelos().add(vuelo);
            }
        }
    }
    
    private void cargarGrafos(){
        for (Aerolinea a : aerolineas.values()){
            a.setGrafo(aeropuertos, a.getVuelos());
        }
    }
    
    /**
     * Metodo que se encarga en obtener todos los caminos que van desde el 
     * origen al destino indicados.
     * @param origen Etiqueta del primer vertice del camino.
     * @param destino Etiqueta del vertice final del camino.
     * @return Retorna un TVuelos con todos los vuelos desde el origen al 
     * destino.
     */
    
    public TVuelos obtenerCaminos(Comparable origen, Comparable destino){
        if (!origen.equals("") && !destino.equals("")){
            TVuelos caminosTotal = new TVuelos();
            for (Aerolinea a: aerolineas.values()){
                TVuelos caminos = a.getGrafo().todosLosCaminos(origen, destino, a.getNombre());
                caminosTotal.getCaminos().addAll(caminos.getCaminos());
            }
            if (caminosTotal.getCaminos().size() > 0){
                return caminosTotal;
            }
            else{
                System.out.println("No hay vuelos disponibles entre " + origen + " y " + destino + ".");
            }
        }
        else{
            System.out.println("Uno de los atributos se encuentra vacio.");
        }
        return null;
    }

    /**
     * Metodo que se encarga de imprimir los vuelos de una clase TVuelos, y 
     * tambien imprime el de menor costo.
     * @param vuelosTotal TVuelos a imprimir.
     */
    
    public void imprimirVuelos(TVuelos vuelosTotal) {
        for (TVuelo c: vuelosTotal.getCaminos()){
            c.imprimirEtiquetasConsola();
        }
        System.out.println(" ------------------------ ");
        System.out.println("El vuelo de menor costo es: ");
        vuelosTotal.obtenerMenor().imprimirEtiquetasConsola();
    }
}

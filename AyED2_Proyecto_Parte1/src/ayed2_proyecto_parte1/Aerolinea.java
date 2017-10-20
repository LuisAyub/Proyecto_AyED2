package ayed2_proyecto_parte1;
import java.util.Collection;
import java.util.LinkedList;

/**
 * Clase que contiene los datos de una aerolinea.
 * @author Luis Ayub
 */

class Aerolinea {
    private Collection<TArista> vuelos;
    private IGrafoDirigido grafo;
    private Comparable etiqueta;
    private String nombre;

    /**
     * Constructor de la clase, se encarga de asignarle valores a la etiqueta y
     * al nombre, tambien inicializa la variable vuelos.
     * @param etiqueta Etiqueta del aerolinea.
     * @param nombre Nombre del aeropuerto.
     */
    
    public Aerolinea(Comparable etiqueta, String nombre){
        this.etiqueta = etiqueta;
        this.nombre = nombre;
        vuelos = new LinkedList();
    }

    /**
     * Metodo de retorna la variable etiqueta.
     * @return retorna la etiqueta de la aerolinea.
     */
    public Comparable getEtiqueta() {
        return etiqueta;
    }

    /**
     * Metodo que se encarga de asignar un Cadena de caracteres a la etiqueta.
     * @param etiqueta Cadena de caracteres a asignar.
     */
    public void setEtiqueta(Comparable etiqueta) {
        this.etiqueta = etiqueta;
    }

    /**
     * Metodo de retorna la variable nombre.
     * @return retorna la nombre de la aerolinea.
     */
    public String getNombre() {
        return nombre;
    }

    /**
     * Metodo que se encarga de asignar un Cadena de caracteres al nombre.
     * @param nombre Cadena de caracteres a asignar.
     */
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    /**
     * Metodo de retorna la variable vuelos.
     * @return Retorna una coleccion de aristas.
     */
    public Collection<TArista> getVuelos() {
        return vuelos;
    }

    /**
     * Metodo que se encarga de asignar una colecion a la variable vuelos.
     * @param vuelos Coleccion a asignar.
     */
    public void setVuelos(Collection<TArista> vuelos) {
        this.vuelos = vuelos;
    }

    /**
     * Metodo que retorna la variable grafo.
     * @return Retorna un grafo dirigido.
     */
    public IGrafoDirigido getGrafo() {
        return grafo;
    }

    /**
     * Metodo que se encarga de asignar y crear un grafo dirigido utilizando
     * los vertices y aristas dadas.
     * @param vertices Vertices del grafo a crear.
     * @param aristas Aristas del grafo a crear.
     */
    public void setGrafo(Collection<TVertice> vertices, Collection<TArista> aristas) {
        this.grafo = new TGrafoDirigido(vertices, aristas);
    }
   
}

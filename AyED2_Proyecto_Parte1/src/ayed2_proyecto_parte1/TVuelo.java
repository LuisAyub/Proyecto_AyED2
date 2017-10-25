package ayed2_proyecto_parte1;


import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedList;

/**
 * Clase que contiene un camino de un grafo, desde un origen hasta un destino
 * predeterminado.
 * @author Luis Ayub
 */
public class TVuelo {

    private final TVertice origen;
    private String aerolinea;
    private Collection<Comparable> otrosVertices;
    private double costoTotal = 0.0d;

    /**
     * Metodo que imprime en consola la lista de etiquetas, llamando al metodo
     * imprimirEtiqueta().
     */
    public void imprimirEtiquetasConsola() {
        System.out.println(imprimirEtiquetas());
    }

    /**
     * Metodo que devuelve una cadena de caracteres con las etiquetas que se 
     * encuentra dentro del camino.
     * @return Una cadena de caracteres con las etiquetas de los vertices en el
     * camino.
     */
    public String imprimirEtiquetas() {
        int escalas = getOtrosVertices().size() - 1;
        StringBuilder sb = new StringBuilder();
        sb.append("Aerolinea: " + getAerolinea());
        sb.append(" // " + getOrigen().getEtiqueta());
        for (Comparable adyacente : getOtrosVertices()) {
            sb.append(" -> " + adyacente);
        }
        sb.append(" // Costo: " + costoTotal);
        if (escalas > 0){
            sb.append(" // Escalas: " + escalas); 
        }
        else{
            sb.append(" // Directo"); 
        }
        return sb.toString();
    }

    /**
     * Metodo constructor de la clase, el cual asigna un vertice y una aerolinea
     * a las variables de clase correspondientes.
     * @param v Vertice de origen.
     * @param aerolinea aerolinea a la cual pertenece el vuelo.
     */
    public TVuelo(TVertice v, String aerolinea) {
        this.origen = v;
        this.aerolinea = aerolinea;
        this.otrosVertices = new LinkedList();
    }

    /**
     * Metodo constructor de la clase, el cual asigna un vertice a las variables
     * de clase correspondientes.
     * @param v Vertice de origen.
     */
    public TVuelo(TVertice v) {
        this.origen = v;
        this.otrosVertices = new LinkedList();
    }
    
    /**
     * Metodo que se encarga de agregar una adyacencia al camino.
     * @param adyacenciaActual Adyacencia a agregar.
     * @return True si se pudo agregar al camino, en caso contrario False.
     */
    public boolean agregarAdyacencia(TAdyacencia adyacenciaActual) {
        if (adyacenciaActual.getDestino() != null) {
            setCostoTotal((Double) getCostoTotal() + ((Number) adyacenciaActual.getCosto()).doubleValue());
            return getOtrosVertices().add(adyacenciaActual.getDestino().getEtiqueta());
        }
        return false;
    }

    /**
     * Metodo que se encarga de eliminar una adyacencia al camino.
     * @param adyacenciaActual Adyacencia a eliminar.
     * @return True si se pudo eliminar del camino, en caso contrario False.
     */
    public boolean eliminarAdyacencia(TAdyacencia adyacenciaActual) {
        if (getOtrosVertices().contains(adyacenciaActual.getDestino().getEtiqueta())) {
            setCostoTotal((Double) getCostoTotal() - ((Number) adyacenciaActual.getCosto()).doubleValue());
            return getOtrosVertices().remove(adyacenciaActual.getDestino().getEtiqueta());
        }
        return false;
    }

    /**
     * Metodo que devuelve la variable origen.
     * @return Retorna el vertice origen.
     */
    public TVertice getOrigen() {
        return origen;
    }

    /**
     * Metodo que retorna la coleccion de las etiquetas de los vertices.
     * @return La coleccion de las etiquetas de los vertices.
     */
    public Collection<Comparable> getOtrosVertices() {
        return otrosVertices;
    }

    /**
     * Metodo que se encarga de asignar una coleccion de etiquetas de los 
     * vertices a la variable otrosVertices.
     * @param otrosVertices Coleccion de etiquetas de los vertices.
     */
    public void setOtrosVertices(Collection<Comparable> otrosVertices) {
        this.otrosVertices = otrosVertices;
    }

    /**
     * Metodo que retorna el valor de la variable costoTotal.
     * @return Valor de la variable costoTotal.
     */
    public Double getCostoTotal() {
        return costoTotal;
    }

    /**
     * Metodo que se encarga de asignarle un valor a la variable costoTotal.
     * @param costoTotal Valor a asignar.
     */
    public void setCostoTotal(Double costoTotal) {
        this.costoTotal = costoTotal;
    }

    /**
     * Metodo que se encarga de copiar la clase TVuelo.
     * @return Una copia de la clase TVuelo.
     */
    public TVuelo copiar() {
        TVertice origen = new TVertice(this.getOrigen().getEtiqueta());
        TVuelo copia = new TVuelo(origen, this.getAerolinea());
        copia.setCostoTotal(this.getCostoTotal());
        origen.getAdyacentes().addAll(this.getOrigen().getAdyacentes());
        copia.getOtrosVertices().addAll(this.getOtrosVertices());

        return copia;
    }

    /**
     * Metodo que se encarga de imprimir la lista de etiquetas de vertices desde
     * una clave dada por parametro.
     * @param clave Etiqueta del vertice del cual comenzara a imprimir
     * @return Una cadena de caracteres con todos los vertices, empezando desde
     * la etiqueta dada por paramentro.
     */
    public String imprimirDesdeClave(Comparable clave) {
        StringBuilder sb = new StringBuilder();
        boolean start = false;
        Collection<Comparable> listaDefinitiva = new LinkedList<Comparable>();
        listaDefinitiva.add(this.getOrigen().getEtiqueta());
        listaDefinitiva.addAll(this.getOtrosVertices());

        for (Iterator<Comparable> iterator = listaDefinitiva.iterator(); iterator.hasNext();) {
            Comparable next = iterator.next();
            if (next.compareTo(clave) == 0) {
                start = true;
            }
            if (start) {
                sb.append(" " + next + " ");
            }
        }
        return sb.toString();
    }

    /**
     * Metodo que retorna la variable aerolinea.
     * @return Cadena de caracteres que contiene la variable aerolinea.
     */
    public String getAerolinea() {
        return aerolinea;
    }

}

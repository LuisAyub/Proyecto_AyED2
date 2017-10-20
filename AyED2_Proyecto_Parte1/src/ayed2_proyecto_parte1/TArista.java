package ayed2_proyecto_parte1;

/**
 * Clase que contiene los datos de una Arista.
 * @author Luis Ayub
 */
public class TArista implements IArista {
    protected Comparable etiquetaOrigen;
    protected Comparable etiquetaDestino;
    protected double costo;

    /**
     * Constructor de la clase, se encarga de asignarle valores a las variables
     * de clase.
     * @param etiquetaOrigen Etiqueta del origen.
     * @param etiquetaDestino Etiqueta del destino.
     * @param costo Costo del camino.
     */
    public TArista(Comparable etiquetaOrigen, Comparable etiquetaDestino, double costo) {
        this.etiquetaOrigen = etiquetaOrigen;
        this.etiquetaDestino = etiquetaDestino;
        this.costo = costo;
    }

    /**
     * Metodo que se encargar de retornar la variable etiquetaOrigen.
     * @return Retorna la etiqueta.
     */
    @Override
    public Comparable getEtiquetaOrigen() {
        return etiquetaOrigen;
    }

    /**
     * Metodo que se encarga de asignar un Cadena de caracteres a la 
     * etiquetaOrigen.
     * @param etiquetaOrigen Cadena de caracteres a asignar.
     */
    @Override
    public void setEtiquetaOrigen(Comparable etiquetaOrigen) {
        this.etiquetaOrigen = etiquetaOrigen;
    }

    /**
     * Metodo que se encargar de retornar la variable etiquetaDestino.
     * @return Retorna la etiqueta.
     */
    @Override
    public Comparable getEtiquetaDestino() {
        return etiquetaDestino;
    }

    /**
     * Metodo que se encarga de asignar un Cadena de caracteres a la 
     * etiquetaDestino.
     * @param etiquetaDestino Cadena de caracteres a asignar.
     */
    @Override
    public void setEtiquetaDestino(Comparable etiquetaDestino) {
        this.etiquetaDestino = etiquetaDestino;
    }

    /**
     * Metodo que se encargar de retornar la variable costo.
     * @return Retorna el costo.
     */
    @Override
    public double getCosto() {
        return costo;
    }

    /**
     * Metodo que se encarga de asignar un valor al costo.
     * @param costo valor a asignar.
     */
    @Override
    public void setCosto(double costo) {
        this.costo = costo;
    }

    
}

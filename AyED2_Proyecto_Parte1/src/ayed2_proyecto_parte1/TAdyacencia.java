package ayed2_proyecto_parte1;

/**
 * Clase que contiene los datos de una Adyacencia.
 * @author Luis Ayub
 */
public class TAdyacencia implements IAdyacencia {
   

    private Comparable etiqueta;
    private double costo;
    private TVertice destino;
    
    /**
     * Metodo que se encargar de retornar la variable etiqueta.
     * @return Retorna la etiqueta.
     */
    @Override
    public Comparable getEtiqueta() {
        return etiqueta;
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
     * Metodo que se encargar de retornar la variable destino.
     * @return Retorna el destino.
     */
    @Override
    public TVertice getDestino() {
        return destino;
    }

    /**
     * Constructor de la clase, se encarga de asignarle valores a las variables
     * de clase.
     * @param costo Valor del costo.
     * @param destino Vertice destino.
     */
    public TAdyacencia(double costo, TVertice destino) {
        this.etiqueta = destino.getEtiqueta();
        this.costo = costo;
        this.destino = destino;
    }
}

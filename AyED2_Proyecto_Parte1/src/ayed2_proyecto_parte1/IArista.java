package ayed2_proyecto_parte1;
/**
 * Interfaz que contiene todos los metodos de la clase TArista.
 * @author Luis Ayub
 */
public interface IArista {

    /**
     * Metodo que se encargar de retornar la variable costo.
     * @return Retorna el costo.
     */
    double getCosto();

    /**
     * Metodo que se encargar de retornar la variable etiquetaDestino.
     * @return Retorna la etiqueta.
     */
    Comparable getEtiquetaDestino();

    /**
     * Metodo que se encargar de retornar la variable etiquetaOrigen.
     * @return Retorna la etiqueta.
     */
    Comparable getEtiquetaOrigen();

    /**
     * Metodo que se encarga de asignar un valor al costo.
     * @param costo valor a asignar.
     */
    void setCosto(double costo);

    /**
     * Metodo que se encarga de asignar un Cadena de caracteres a la 
     * etiquetaDestino.
     * @param etiquetaDestino Cadena de caracteres a asignar.
     */
    void setEtiquetaDestino(Comparable etiquetaDestino);

    /**
     * Metodo que se encarga de asignar un Cadena de caracteres a la 
     * etiquetaOrigen.
     * @param etiquetaOrigen Cadena de caracteres a asignar.
     */
    void setEtiquetaOrigen(Comparable etiquetaOrigen);
    
}

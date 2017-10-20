package ayed2_proyecto_parte1;
/**
 * Interfaz que contiene todos los metodos de la clase Adyacencia.
 * @author Luis Ayub
 */
public interface IAdyacencia {

    /**
     * Metodo que se encargar de retornar la variable costo.
     * @return Retorna el costo.
     */
    double getCosto();

    /**
     * Metodo que se encargar de retornar la variable destino.
     * @return Retorna el destino.
     */
    TVertice getDestino();

    /**
     * Metodo que se encargar de retornar la variable etiqueta.
     * @return Retorna la etiqueta.
     */
    Comparable getEtiqueta();
    
}

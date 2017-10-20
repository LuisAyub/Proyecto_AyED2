package ayed2_proyecto_parte1;
import java.util.LinkedList;
/**
 *
 * @author Ernesto
 */
public interface IVertice {

    /**
     *
     * @param verticeDestino
     * @return
     */
    TAdyacencia buscarAdyacencia(TVertice verticeDestino);

    /**
     *
     * @param etiquetaDestino
     * @return
     */
    TAdyacencia buscarAdyacencia(Comparable etiquetaDestino);

    /**
     *
     * @param nomVerticeDestino
     * @return
     */
    boolean eliminarAdyacencia(Comparable nomVerticeDestino);

    /**
     *
     * @return
     */
    LinkedList<TAdyacencia> getAdyacentes();

    /**
     *
     * @return
     */
    Object getDatos();
    
    /**
     *
     * @param dato
     */
    void setDatos(Object dato);

    /**
     *
     * @return
     */
    Comparable getEtiqueta();

    /**
     *
     * @return
     */
    boolean getVisitado();

    /**
     *
     * @param costo
     * @param verticeDestino
     * @return
     */
    boolean insertarAdyacencia(Double costo, TVertice verticeDestino);

    /**
     *
     * @param verticeDestino
     * @return
     */
    Double obtenerCostoAdyacencia(TVertice verticeDestino);

    /**
     *
     * @return
     */
    TVertice primerAdyacente();

    /**
     *
     * @param valor
     */
    void setVisitado(boolean valor);

    /**
     *
     * @param etVertDest
     * @param caminoPrevio
     * @param todosLosCaminos
     * @return
     */
    public TVuelos todosLosCaminos(Comparable etVertDest, TVuelo caminoPrevio, TVuelos todosLosCaminos);

}

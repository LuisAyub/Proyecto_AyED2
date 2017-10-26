package ayed2_proyecto_parte1;
import java.util.LinkedList;
/**
 * Interfaz que contiene todos los metodos de un vertice de un grafo.
 * @author Luis Ayub
 */
public interface IVertice {

    /**
     * Metodo que se encarga de buscar una adyacencia especifica al vertice.
     * @param verticeDestino Vertice adyaciente que se quiere buscar.
     * @return Retorna la adyacencia en caso de encontrarla, en caso contrario,
     * devuelve nulo.
     */
    TAdyacencia buscarAdyacencia(TVertice verticeDestino);

    /**
     * Metodo que se encarga de buscar una adyacencia especifica al vertice
     * utilizando su etiqueta.
     * @param etiquetaDestino Etiqueta del vertice adyaciente que se quiere 
     * buscar.
     * @return Retorna la adyacencia en caso de encontrarla, en caso contrario,
     * devuelve nulo.
     */
    TAdyacencia buscarAdyacencia(Comparable etiquetaDestino);

    /**
     * Metodo que se encarga de eliminar una adyacencia del vertice especifico.
     * @param nomVerticeDestino Etiqueta de la adyacencia que se quiere 
     * eliminar.
     * @return True si se logro eliminar, false en caso contrario.
     */
    boolean eliminarAdyacencia(Comparable nomVerticeDestino);

    /**
     * Metodo que devuelve una LinkedList con las adyacencia del vertice.
     * @return LinkedList con las adyacencia del vertice.
     */
    LinkedList<TAdyacencia> getAdyacentes();

    /**
     * Metodo que devuelve el dato que el vertice contiene.
     * @return El dato que contiene el vertice.
     */
    Object getDatos();
    
    /**
     * Metodo que se encarga de asignar un dato a la variable datos.
     * @param dato Dato a asignar.
     */
    void setDatos(Object dato);

    /**
     * Metodo de retorna la variable etiqueta.
     * @return Retorna la etiqueta del vertice.
     */
    Comparable getEtiqueta();

    /**
     * Metodo de retorna la variable visitado.
     * @return Retorna si el vertice fue visitado o no.
     */
    boolean getVisitado();

    /**
     * Metodo que se encarga de insertar una adyacencia al vertice, recibiendo
     * el costo y el vertice destino,
     * @param costo Costo de la adyacencia.
     * @param verticeDestino Vertice destino de la adyacencia.
     * @return True si se logro insertar, False en el caso contrario.
     */
    boolean insertarAdyacencia(Double costo, TVertice verticeDestino);

    /**
     * Metodo que se encarga de obtener el costo de una adyacencia especifica
     * utilizando su vertice destino.
     * @param verticeDestino Vertice destino de la adyacencia.
     * @return Devuelve el costo de la adyacencia.
     */
    Double obtenerCostoAdyacencia(TVertice verticeDestino);

    /**
     * Metodo que devuelve el primer adyacente del vertice.
     * @return Primer adyacente del vertice.
     */
    TVertice primerAdyacente();

    /**
     * Metodo que se encarga de asignar un boolean a la variable
     * visitado.
     * @param valor boolean a ser asignado.
     */
    void setVisitado(boolean valor);

    /**
     * Metodo que devuelve todos los vuelos que van desde el vertice de origen 
     * al vertice destino, llendo vertice por vertice de forma recursiva.
     * @param etVertDest Etiqueta del vertice destino.
     * @param caminoPrevio La lista de camino actual.
     * @param todosLosCaminos La lista de caminos total.
     * @param largoMax valor del largo maximo del camino.
     * @return Todos los caminos que van desde el origen hasta el destino.
     */
    public TVuelos todosLosCaminos(Comparable etVertDest, TVuelo caminoPrevio, TVuelos todosLosCaminos,int largoMax);

}

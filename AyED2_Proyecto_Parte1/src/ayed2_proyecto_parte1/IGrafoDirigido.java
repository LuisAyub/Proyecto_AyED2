package ayed2_proyecto_parte1;
import java.util.Collection;
import java.util.Map;

/**
 * Interfaz que contiene todos los metodos de un grafo dirigido.
 * @author Luis Ayub
 */
public interface IGrafoDirigido {

    /**
     * Metodo encargado de eliminar una arista dada por un origen y destino. En
     * caso de no existir la arista, retorna falso. En caso de que las etiquetas
     * sean invalidas (no existe el vertice origen o el destino), retorna falso.
     * @param nomVerticeOrigen Etiqueta del vertice de origen.
     * @param nomVerticeDestino Etiqueta del vertice de destino.
     * @return False si al menos una de las etiquetas no existe.
     */
    boolean eliminarArista(Comparable nomVerticeOrigen, Comparable nomVerticeDestino);

    /**
     * Metodo encargado de eliminar un vertice en el grafo. En caso de no
     * existir el vertice, retorna falso. En caso de que la etiqueta sea
     * invalida, retorna false.
     *
     * @param nombreVertice Etiqueta del vertice a eliminar.
     * @return False si la etiqueta no existe, o si es invalida.
     */
    boolean eliminarVertice(Comparable nombreVertice);

    /**
     * Metodo encargado de verificar la existencia de una arista. Las etiquetas
     * pasadas por parametro deben ser validas (o sea, los vértices origen y
     * destino deben existir en el grafo).
     *
     * @param etiquetaOrigen Etiqueta del vertice origen.
     * @param etiquetaDestino Etiqueta del vertice destino.
     * @return True si existe la arista, false en caso contrario
     */
    boolean existeArista(Comparable etiquetaOrigen, Comparable etiquetaDestino);

    /**
     * Metodo encargado de verificar la existencia de un vertice dentro del
     * grafo.-
     *
     * La etiqueta especificada como parametro debe ser valida.
     *
     * @param unaEtiqueta Etiqueta del vertice a buscar.-
     * @return True si existe el vertice con la etiqueta indicada, false en caso
     * contrario
     */
    boolean existeVertice(Comparable unaEtiqueta);

    /**
     * ejecuta el algoritmo de Floyd en el grafo, para hallar los caminos
     * mínimos entre todos los pares de vértices.
     *
     * @param arista Arista a insertar.
     * @return una matriz de n x n (n = cantidad de vértices del grafo) con los
     * costos de los caminos mínimos.
     */
    boolean insertarArista(TArista arista);

    /**
     * Metodo encargado de insertar un vertice en el grafo.
     *
     * No pueden ingresarse vertices con la misma etiqueta. La etiqueta
     * especificada como parametro debe ser valida.
     *
     * @param vertice Vertice a insertar.
     * @return True si se pudo insertar el vertice, false en caso contrario
     */
    boolean insertarVertice(TVertice vertice);

    /**
     * Metodo que se encarga de retornar la variable vertices.
     * @return Retorna los vertices.
     */
    public Map<Comparable, TVertice> getVertices();

    /**
     * Metodo que devuelve todos los vuelos que van desde el vertice de origen 
     * al vertice destino, incluyendo su aerolinea.
     * @param etiquetaOrigen Etiqueta del vertice de origen.
     * @param etiquetaDestino Etiqueta del vertice de destino.
     * @param aerolinea aerolinea a la cual pertenece.
     * @return Todos los vuelos que van del vertice origen al vertice camino.
     */
    public TVuelos todosLosCaminos(Comparable etiquetaOrigen, Comparable etiquetaDestino, String aerolinea);
}

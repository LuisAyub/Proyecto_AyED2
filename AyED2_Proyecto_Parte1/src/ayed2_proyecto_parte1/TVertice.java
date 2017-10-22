package ayed2_proyecto_parte1;


import java.util.LinkedList;

/**
 * Clase que contiene todos los metodos de un vertice de un grafo.
 * @author Luis Ayub
 */
public class TVertice implements IVertice{

    private Comparable etiqueta;
    private LinkedList<TAdyacencia> adyacentes;
    private boolean visitado;
    private Object datos;

    /**
     * Metodo de retorna la variable etiqueta.
     * @return Retorna la etiqueta del vertice.
     */
    @Override
    public Comparable getEtiqueta() {
        return etiqueta;
    }

    /**
     * Metodo que devuelve una LinkedList con las adyacencia del vertice.
     * @return LinkedList con las adyacencia del vertice.
     */
    @Override
    public LinkedList<TAdyacencia> getAdyacentes() {
        return adyacentes;
    }

    /**
     * Metodo contructor de la clase, Se encarga de asignarle una etiqueta al
     * vertice y de inicializar la lista de adyacencias.
     * @param unaEtiqueta Etiqueta que tendra el vertice.
     */
    public TVertice(Comparable unaEtiqueta) {
        this.etiqueta = unaEtiqueta;
        adyacentes = new LinkedList();
        visitado = false;
    }

    /**
     * Metodo que se encarga de asignar un boolean a la variable
     * visitado.
     * @param valor boolean a ser asignado.
     */
    @Override
    public void setVisitado(boolean valor) {
        this.visitado = valor;
    }

    /**
     * Metodo de retorna la variable visitado.
     * @return Retorna si el vertice fue visitado o no.
     */
    @Override
    public boolean getVisitado() {
        return this.visitado;
    }

    /**
     * Metodo que se encarga de buscar una adyacencia especifica al vertice.
     * @param verticeDestino Vertice adyaciente que se quiere buscar.
     * @return Retorna la adyacencia en caso de encontrarla, en caso contrario,
     * devuelve nulo.
     */
    @Override
    public TAdyacencia buscarAdyacencia(TVertice verticeDestino) {
        if (verticeDestino != null) {
            return buscarAdyacencia(verticeDestino.getEtiqueta());
        }
        return null;
    }

    /**
     * Metodo que se encarga de obtener el costo de una adyacencia especifica
     * utilizando su vertice destino.
     * @param verticeDestino Vertice destino de la adyacencia.
     * @return Devuelve el costo de la adyacencia.
     */
    @Override
    public Double obtenerCostoAdyacencia(TVertice verticeDestino) {
        TAdyacencia ady = buscarAdyacencia(verticeDestino);
        if (ady != null) {
            return ady.getCosto();
        }
        return Double.MAX_VALUE;
    }

    /**
     * Metodo que se encarga de insertar una adyacencia al vertice, recibiendo
     * el costo y el vertice destino,
     * @param costo Costo de la adyacencia.
     * @param verticeDestino Vertice destino de la adyacencia.
     * @return True si se logro insertar, False en el caso contrario.
     */
    @Override
    public boolean insertarAdyacencia(Double costo, TVertice verticeDestino) {
        if (buscarAdyacencia(verticeDestino) == null) {
            TAdyacencia ady = new TAdyacencia(costo, verticeDestino);
            return adyacentes.add(ady);
        }
        return false;
    }

    /**
     * Metodo que se encarga de eliminar una adyacencia del vertice especifico.
     * @param nomVerticeDestino Etiqueta de la adyacencia que se quiere 
     * eliminar.
     * @return True si se logro eliminar, false en caso contrario.
     */
    @Override
    public boolean eliminarAdyacencia(Comparable nomVerticeDestino) {
        TAdyacencia ady = buscarAdyacencia(nomVerticeDestino);
        if (ady != null) {
            adyacentes.remove(ady);
            return true;
        }
        return false;
    }

    /**
     * Metodo que devuelve el primer adyacente del vertice.
     * @return Primer adyacente del vertice.
     */
    @Override
    public TVertice primerAdyacente() {
        if (this.adyacentes.getFirst() != null) {
            return this.adyacentes.getFirst().getDestino();
        }
        return null;
    }

    /**
     * Metodo que se encarga de buscar una adyacencia especifica al vertice
     * utilizando su etiqueta.
     * @param etiquetaDestino Etiqueta del vertice adyaciente que se quiere 
     * buscar.
     * @return Retorna la adyacencia en caso de encontrarla, en caso contrario,
     * devuelve nulo.
     */
    @Override
    public TAdyacencia buscarAdyacencia(Comparable etiquetaDestino) {
        for (TAdyacencia adyacencia : adyacentes) {
            if (adyacencia.getDestino().getEtiqueta().compareTo(etiquetaDestino) == 0) {
                return adyacencia;
            }
        }
        return null;
    }

    /**
     * Metodo que devuelve el dato que el vertice contiene.
     * @return El dato que contiene el vertice.
     */
    @Override
    public Object getDatos() {
        return datos; 
    }

    /**
     * Metodo que devuelve todos los vuelos que van desde el vertice de origen 
     * al vertice destino, llendo vertice por vertice de forma recursiva.
     * @param etVertDest Etiqueta del vertice destino.
     * @param caminoPrevio La lista de camino actual.
     * @param todosLosCaminos La lista de caminos total.
     * @return Todos los caminos que van desde el origen hasta el destino.
     */
    @Override
    public TVuelos todosLosCaminos(Comparable etVertDest, TVuelo caminoPrevio, TVuelos todosLosCaminos) {
        this.setVisitado(true);
        for (TAdyacencia adyacencia : this.getAdyacentes()) {
            TVertice destino = adyacencia.getDestino();
            if (!destino.getVisitado()) {
                if (destino.getEtiqueta().compareTo(etVertDest) == 0) {
                    TVuelo copia = caminoPrevio.copiar();
                    copia.agregarAdyacencia(adyacencia);
                    todosLosCaminos.getCaminos().add(copia);
                } else {
                    caminoPrevio.agregarAdyacencia(adyacencia);
                    destino.todosLosCaminos(etVertDest, caminoPrevio, todosLosCaminos);
                    caminoPrevio.eliminarAdyacencia(adyacencia);
                }
            }
        }
        this.setVisitado(false);
        return todosLosCaminos;
    }    

    /**
     * Metodo que se encarga de asignar un dato a la variable datos.
     * @param dato Dato a asignar.
     */
    @Override
    public void setDatos(Object dato) {
        this.datos = dato;
    }
}

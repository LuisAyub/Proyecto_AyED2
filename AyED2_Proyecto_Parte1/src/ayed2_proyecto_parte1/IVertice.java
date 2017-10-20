package ayed2_proyecto_parte1;


import java.util.Collection;
import java.util.LinkedList;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

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
     * @param visitados
     */
    public void bpf(Collection<Comparable> visitados);

    /**
     *
     * @param etVertDest
     * @param caminoPrevio
     * @param todosLosCaminos
     * @return
     */
    public TVuelos todosLosCaminos(Comparable etVertDest, TVuelo caminoPrevio, TVuelos todosLosCaminos);
   
    /**
     *
     * @param camino
     * @return
     */
    public boolean tieneCiclo(TVuelo camino);
}

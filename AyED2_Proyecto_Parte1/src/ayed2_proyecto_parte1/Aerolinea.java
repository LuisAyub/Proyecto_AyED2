/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ayed2_proyecto_parte1;

import java.util.Collection;
import java.util.LinkedList;

/**
 *
 * @author Luigi PC
 */
class Aerolinea {
    private Collection<TArista> vuelos;
    private IGrafoDirigido grafo;
    private Comparable etiqueta;
    private String nombre;

    public Aerolinea(Comparable etiqueta, String nombre){
        this.etiqueta = etiqueta;
        this.nombre = nombre;
        vuelos = new LinkedList();
    }

    /**
     * @return the etiqueta
     */
    public Comparable getEtiqueta() {
        return etiqueta;
    }

    /**
     * @param etiqueta the etiqueta to set
     */
    public void setEtiqueta(Comparable etiqueta) {
        this.etiqueta = etiqueta;
    }

    /**
     * @return the nombre
     */
    public String getNombre() {
        return nombre;
    }

    /**
     * @param nombre the nombre to set
     */
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    /**
     * @return the vuelos
     */
    public Collection<TArista> getVuelos() {
        return vuelos;
    }

    /**
     * @param vuelos the vuelos to set
     */
    public void setVuelos(Collection<TArista> vuelos) {
        this.vuelos = vuelos;
    }

    /**
     * @return the grafo
     */
    public IGrafoDirigido getGrafo() {
        return grafo;
    }

    /**
     * @param grafo the grafo to set
     */
    public void setGrafo(Collection<TVertice> vertices, Collection<TArista> aristas) {
        this.grafo = new TGrafoDirigido(vertices, aristas);
    }
   
}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ayed2_proyecto_parte1;

/**
 *
 * @author Luigi PC
 */
class Aeropuerto {
    private Comparable etiqueta;
    private String nombre;

    public Aeropuerto(Comparable etiqueta, String nombre){
        this.etiqueta = etiqueta;
        this.nombre = nombre;
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
   
}

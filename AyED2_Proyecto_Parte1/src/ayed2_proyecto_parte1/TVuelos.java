package ayed2_proyecto_parte1;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
import java.util.Collection;
import java.util.LinkedList;

/**
 *
 * @author diego
 */
public class TVuelos {
    
    private Collection<TVuelo> caminos;

    /**
     *
     */
    public TVuelos() {
        this.caminos = new LinkedList<>();
    }
    
    /**
     *
     * @return
     */
    public String imprimirCaminos(){
        StringBuilder sb = new StringBuilder();
        for (TVuelo camino : caminos){
            sb.append(camino.imprimirEtiquetas()+"\n");
        }
        return sb.toString();
    }

    /**
     *
     */
    public void imprimirCaminosConsola(){
        System.out.println(imprimirCaminos());
    }

    /**
     *
     * @return
     */
    public TVuelo obtenerMenor(){
        TVuelo aux = caminos.iterator().next();
        double min = aux.getCostoTotal();
        for (TVuelo c: caminos){
            if (min > c.getCostoTotal()){
                min = c.getCostoTotal();
                aux = c;
            }     
        }
        if (aux != null){
            return aux;
        }
        return null;
    }
    
    /**
     *
     * @return
     */
    public Collection<TVuelo> getCaminos() {
        return caminos;
    }
    
}

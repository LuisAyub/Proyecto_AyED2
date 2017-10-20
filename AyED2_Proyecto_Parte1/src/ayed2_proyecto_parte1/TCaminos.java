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
public class TCaminos {
    
    private Collection<TCamino> caminos;

    public TCaminos() {
        this.caminos = new LinkedList<>();
    }
    
    public String imprimirCaminos(){
        StringBuilder sb = new StringBuilder();
        for (TCamino camino : caminos){
            sb.append(camino.imprimirEtiquetas()+"\n");
        }
        return sb.toString();
    }

    public void imprimirCaminosConsola(){
        System.out.println(imprimirCaminos());
    }

    public TCamino obtenerMenor(){
        TCamino aux = caminos.iterator().next();
        double min = aux.getCostoTotal();
        for (TCamino c: caminos){
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
    
    public Collection<TCamino> getCaminos() {
        return caminos;
    }
    
}

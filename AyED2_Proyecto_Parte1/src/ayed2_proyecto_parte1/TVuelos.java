package ayed2_proyecto_parte1;
import java.util.Collection;
import java.util.LinkedList;

/**
 * Clase que contiene todos los vuelos que hay desde un origen hacia un destino.
 * @author Luis Ayub
 */
public class TVuelos {
    
    private Collection<TVuelo> vuelos;

    /**
     *Metodo constructor que se encarga de inicializar la variable caminos.
     */
    public TVuelos() {
        this.vuelos = new LinkedList<>();
    }
    
    /**
     * Metodo que se encarga de imprimir todos los vuelos que se encuentran en
     * la variable vuelos.
     * @return Una cadena de caracteres con todos los vuelos contenidos.
     */
    public String imprimirVuelos(){
        StringBuilder sb = new StringBuilder();
        if (vuelos != null){
            for (TVuelo camino : vuelos){
                if (camino != null){
                    sb.append(camino.imprimirEtiquetas()+"\n");
                }
            }
        }
        else{
            return "No hay vuelos disponibles";
        }
        return sb.toString();
    }

    /**
     * Metodo que se encarga de imprimir en consola la cadena de caracteres que
     * devuelve el metodo imprimirCaminos();
     */
    public void imprimirCaminosConsola(){
        System.out.println(imprimirVuelos());
    }

    /**
     * Metodo que se encarga de devolver el vuelo de menor costo.
     * @return El TVuelo de menor costo.
     */
    public TVuelo obtenerMenor(){
        TVuelo aux = vuelos.iterator().next();
        double min = aux.getCostoTotal();
        for (TVuelo c: vuelos){
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
     * Metodo que se encarga de devolver la coleccion de vuelos de la variable
     * vuelos
     * @return Una coleccion de TVuelo.
     */
    public Collection<TVuelo> getVuelos() {
        return vuelos;
    }
    
}

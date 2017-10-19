/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ayed2_proyecto_parte1;

import java.util.Collection;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.Map;

/**
 *
 * @author Luigi PC
 */
public class Administracion {
    private Map<Comparable,Aerolinea> aerolineas;
    private Collection<TVertice> aeropuertos;
    private LinkedList<IArista> vuelos;
    
    public Administracion(){
        aerolineas = new HashMap();
        aeropuertos = new LinkedList();
    }
    
    public void cargarAerolineas(Comparable etiqueta, String nombre){
        Aerolinea a = new Aerolinea(etiqueta,nombre);
        aerolineas.put(etiqueta,a);
    }
    
    public void cargarAeropuertos(String ruta){
        String[] listaAeropuertos = ManejadorArchivosGenerico.leerArchivo(ruta, false);
        for (String d: listaAeropuertos){
            String[] datos = d.split(",");
            Aeropuerto a = new Aeropuerto(datos[0], datos[1]);
            TVertice v = new TVertice(datos[0]);
            v.setDatos(a);
            aeropuertos.add(v);
        } 
    }
    
    public void cargarVuelos(String ruta){
        String[] conexiones = ManejadorArchivosGenerico.leerArchivo(ruta, false);
        for (String d: conexiones){
            String[] datos = d.split(",");
            if (aerolineas.containsKey(datos[0])){
                TArista vuelo = new TArista(datos[1], datos[2], Double.parseDouble(datos[3]));
                aerolineas.get(datos[0]).getVuelos().add(vuelo);
            }
        }
    }
    
    public void cargarGrafos(){
        for (Aerolinea a : aerolineas.values()){
            a.setGrafo(aeropuertos, a.getVuelos());
        }
    }
    
    public void obtenerCaminos(Comparable origen, Comparable destino){
        TCaminos caminosTotal = new TCaminos();
        for (Aerolinea a: aerolineas.values()){
            TCaminos caminos = a.getGrafo().todosLosCaminos(origen, destino);
            caminosTotal.getCaminos().addAll(caminos.getCaminos());
        }
        imprimirCaminos(caminosTotal);
    }
    
//    public void imprimirAerolineas(){
//        for (Aerolinea a: aerolineas){
//            System.out.println(a.getNombre());
//        }
//    }

    private void imprimirCaminos(TCaminos caminosTotal) {
        for (TCamino c: caminosTotal.getCaminos()){
            c.imprimirEtiquetasConsola();
        }
    }
}
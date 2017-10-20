package ayed2_proyecto_parte1;


import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedList;

/**
 *
 * @author diego
 */
public class TVuelo {

    private final TVertice origen;
    private String aerolinea;
    private Collection<Comparable> otrosVertices;
// es una lista de etiquetas de los vertices
// ATENCIÓN: PONER LA CLASE CONCRETA QUE									     	     
// SEA MÁS APROPIADA
    private double costoTotal = 0.0d;

    /**
     *
     */
    public void imprimirEtiquetasConsola() {
        System.out.println(imprimirEtiquetas());
    }

    /**
     *
     * @return
     */
    public String imprimirEtiquetas() {
        StringBuilder sb = new StringBuilder();
        sb.append("Aerolinea: " + getAerolinea());
        sb.append(" // " + getOrigen().getEtiqueta());
        for (Comparable adyacente : getOtrosVertices()) {
            sb.append(" -> " + adyacente);
        }
        sb.append(" // Costo: " + costoTotal);
        return sb.toString();
    }

    /**
     *
     * @param v
     * @param aerolinea
     */
    public TVuelo(TVertice v, String aerolinea) {
        this.origen = v;
        this.aerolinea = aerolinea;
        this.otrosVertices = new LinkedList();
    }

    /**
     *
     * @param v
     */
    public TVuelo(TVertice v) {
        this.origen = v;
        this.otrosVertices = new LinkedList();
    }
    
    /**
     *
     * @param adyacenciaActual
     * @return
     */
    public boolean agregarAdyacencia(TAdyacencia adyacenciaActual) {
        if (adyacenciaActual.getDestino() != null) {
            setCostoTotal((Double) getCostoTotal() + ((Number) adyacenciaActual.getCosto()).doubleValue());
            return getOtrosVertices().add(adyacenciaActual.getDestino().getEtiqueta());
        }
        return false;
    }

    /**
     *
     * @param adyacenciaActual
     * @return
     */
    public boolean eliminarAdyacencia(TAdyacencia adyacenciaActual) {
        if (getOtrosVertices().contains(adyacenciaActual.getDestino().getEtiqueta())) {
            setCostoTotal((Double) getCostoTotal() - ((Number) adyacenciaActual.getCosto()).doubleValue());
            return getOtrosVertices().remove(adyacenciaActual.getDestino().getEtiqueta());
        }
        return false;
    }

    /**
     *
     * @return
     */
    public TVertice getOrigen() {
        return origen;
    }

    /**
     *
     * @return
     */
    public Collection<Comparable> getOtrosVertices() {
        return otrosVertices;
    }

    /**
     *
     * @param otrosVertices
     */
    public void setOtrosVertices(Collection<Comparable> otrosVertices) {
        this.otrosVertices = otrosVertices;
    }

    /**
     *
     * @return
     */
    public Double getCostoTotal() {
        return costoTotal;
    }

    /**
     *
     * @param costoTotal
     */
    public void setCostoTotal(Double costoTotal) {
        this.costoTotal = costoTotal;
    }

    /**
     *
     * @return
     */
    public TVuelo copiar() {
        TVertice origen = new TVertice(this.getOrigen().getEtiqueta());
        TVuelo copia = new TVuelo(origen, this.getAerolinea());
        copia.setCostoTotal(this.getCostoTotal());
        origen.getAdyacentes().addAll(this.getOrigen().getAdyacentes());
        copia.getOtrosVertices().addAll(this.getOtrosVertices());

        return copia;
    }

    /**
     *
     * @param clave
     * @return
     */
    public String imprimirDesdeClave(Comparable clave) {
        StringBuilder sb = new StringBuilder();
        boolean start = false;
        Collection<Comparable> listaDefinitiva = new LinkedList<Comparable>();
        listaDefinitiva.add(this.getOrigen().getEtiqueta());
        listaDefinitiva.addAll(this.getOtrosVertices());

        for (Iterator<Comparable> iterator = listaDefinitiva.iterator(); iterator.hasNext();) {
            Comparable next = iterator.next();
            if (next.compareTo(clave) == 0) {
                start = true;
            }
            if (start) {
                sb.append(" " + next + " ");
            }
        }
        return sb.toString();
    }

    /**
     * @return the aerolinea
     */
    public String getAerolinea() {
        return aerolinea;
    }

}

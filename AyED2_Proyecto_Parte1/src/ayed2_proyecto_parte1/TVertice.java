package ayed2_proyecto_parte1;


import java.util.Collection;
import java.util.LinkedList;

/**
 *
 * @author Luigi PC
 */
public class TVertice implements IVertice{

    private Comparable etiqueta;
    private LinkedList<TAdyacencia> adyacentes;
    private boolean visitado;
    private Object datos;

    /**
     *
     * @return
     */
    @Override
    public Comparable getEtiqueta() {
        return etiqueta;
    }

    /**
     *
     * @return
     */
    @Override
    public LinkedList<TAdyacencia> getAdyacentes() {
        return adyacentes;
    }

    /**
     *
     * @param unaEtiqueta
     */
    public TVertice(Comparable unaEtiqueta) {
        this.etiqueta = unaEtiqueta;
        adyacentes = new LinkedList();
        visitado = false;
    }

    /**
     *
     * @param valor
     */
    @Override
    public void setVisitado(boolean valor) {
        this.visitado = valor;
    }

    /**
     *
     * @return
     */
    @Override
    public boolean getVisitado() {
        return this.visitado;
    }

    /**
     *
     * @param verticeDestino
     * @return
     */
    @Override
    public TAdyacencia buscarAdyacencia(TVertice verticeDestino) {
        if (verticeDestino != null) {
            return buscarAdyacencia(verticeDestino.getEtiqueta());
        }
        return null;
    }

    /**
     *
     * @param verticeDestino
     * @return
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
     *
     * @param costo
     * @param verticeDestino
     * @return
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
     *
     * @param nomVerticeDestino
     * @return
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
     *
     * @return
     */
    @Override
    public TVertice primerAdyacente() {
        if (this.adyacentes.getFirst() != null) {
            return this.adyacentes.getFirst().getDestino();
        }
        return null;
    }

    /**
     *
     * @param etiquetaDestino
     * @return
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
     *
     * @return
     */
    @Override
    public Object getDatos() {
        return datos; 
    }

    /**
     *
     * @param etVertDest
     * @param caminoPrevio
     * @param todosLosCaminos
     * @return
     */
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
     *
     * @param dato
     */
    @Override
    public void setDatos(Object dato) {
        this.datos = dato;
    }
}

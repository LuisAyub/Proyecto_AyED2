package ayed2_proyecto_parte2;

public class TClasificador {

    public static final int METODO_CLASIFICACION_INSERCION = 1;
    public static final int METODO_CLASIFICACION_BURBUJA = 2;
    public static final int METODO_CLASIFICACION_QUICKSORT = 3;
    public static final int METODO_CLASIFICACION_SELECION = 4;
    public static final int METODO_CLASIFICACION_HEAPSORT = 5;
    private int[] vectorIncremento;

    public int[] clasificar(int[] datosParaClasificar, int metodoClasificacion, boolean cascara) {
        switch (metodoClasificacion) {
            case METODO_CLASIFICACION_INSERCION:
                if (cascara) {
                    return cascara(datosParaClasificar);
                } else {
                    return ordenarPorInsercion(datosParaClasificar);
                }
            case METODO_CLASIFICACION_BURBUJA:
                if (cascara) {
                    return cascara(datosParaClasificar);
                } else {
                    return ordenarPorBurbuja(datosParaClasificar);
                }
            case METODO_CLASIFICACION_QUICKSORT:
                if (cascara) {
                    return cascara(datosParaClasificar);
                } else {
                    return ordenarPorQuickSort(datosParaClasificar);
                }
            case METODO_CLASIFICACION_SELECION:
                if (cascara) {
                    return cascara(datosParaClasificar);
                } else {
                    return ordenarPorSelecion(datosParaClasificar);
                }
            case METODO_CLASIFICACION_HEAPSORT:
                if (cascara) {
                    return cascara(datosParaClasificar);
                } else {
                    return ordenarPorHeapSort(datosParaClasificar);
                }
        }
        return null;
    }
    
    protected int[] cascara(int[] datosParaClasificar) {
        return datosParaClasificar;
    }
    
    private void intercambiar(int[] vector, int pos1, int pos2) {
        int temp = vector[pos2];
        vector[pos2] = vector[pos1];
        vector[pos1] = temp;
    }

    private int calcularVectorIncremento(int valor) {
        for (int i = this.vectorIncremento.length - 1; i >= 0; i--) {
            if (this.vectorIncremento[i] < valor) {
                return i;
            }
        }
        return -1;
    }

    /**
     * @param datosParaClasificar
     * @return
     */
    protected int[] ordenarPorInsercion(int[] datosParaClasificar) {
        for (int i = 1; i < datosParaClasificar.length; i++) {
            int aux = datosParaClasificar[i];
            int j = i - 1;
            while (j >= 0 && aux < datosParaClasificar[j]) {
                datosParaClasificar[j + 1] = datosParaClasificar[j];
                j--;
            }
            datosParaClasificar[j + 1] = aux;
        }
        return datosParaClasificar;
    }

    private int[] ordenarPorBurbuja(int[] datosParaClasificar) {
        for (int i = 0; i < datosParaClasificar.length - 1; i++) {
            for (int j = 0; j < datosParaClasificar.length - i - 1; j++) {
                if (datosParaClasificar[j] > datosParaClasificar[j + 1]) {
                    int aux = datosParaClasificar[j];
                    datosParaClasificar[j] = datosParaClasificar[j + 1];
                    datosParaClasificar[j + 1] = aux;
                }
            }
        }
        return datosParaClasificar;
    }
    

    protected int[] ordenarPorQuickSort(int[] datosParaClasificar) {
        quicksort(datosParaClasificar, 0, datosParaClasificar.length - 1);
        return datosParaClasificar;
    }

    private void quicksort(int[] entrada, int i, int j) {
        int izquierda = i;
        int derecha = j;

        int posicionPivote = encuentraPivote(izquierda, derecha, entrada);
        if (posicionPivote >= 0) {
            int pivote = entrada[posicionPivote];
            while (izquierda <= derecha) {
                while ((entrada[izquierda] < pivote) && (izquierda < j)) {
                    izquierda++;
                }
                while ((pivote < entrada[derecha]) && (derecha > i)) {
                    derecha--;
                }
                if (izquierda <= derecha) {
                    intercambiar(entrada, izquierda, derecha);
                    izquierda++;
                    derecha--;
                }
            }
            if (i < derecha) {
                quicksort(entrada, i, derecha);
            }
            if (izquierda < j) {
                quicksort(entrada, izquierda, j);
            }
        }
    }

    private int encuentraPivote(int l, int h, int[] vector) {
        int res = vector[l];
        for (int i = l; i <= h; i++) {
            if (res != vector[i]) {
                res = -1;
                break;
            }
        }

        //Significa que encontró claves diferentes
        if (res == -1) {
            if (vector[l] >= vector[h]) {
                return l;
            }
            return h;
        }
        return 0;
    }

    protected int[] ordenarPorSelecion(int[] datosParaClasificar) {
        for (int i = 0; i < datosParaClasificar.length - 1; i++) {
            int indiceMenor = i;
            int claveMenor = datosParaClasificar[i];
            for (int j = i + 1; j < datosParaClasificar.length; j++) {
                if (datosParaClasificar[j] < claveMenor) {
                    indiceMenor = j;
                    claveMenor = datosParaClasificar[j];
                }
            }
            intercambiar(datosParaClasificar, i, indiceMenor);
        }
        return datosParaClasificar;
    }
    
    protected int[] ordenarPorHeapSort(int[] vector) {
        for (int i = (vector.length - 1) / 2; i >= 0; i--) { //Armo el heap inicial de n-1 div 2 hasta 0
            armaHeap(vector, i, vector.length - 1);
        }
        for (int i = vector.length - 1; i > 1; i--) {
            intercambiar(vector, 0, i);
            armaHeap(vector, 0, i - 1);
        }
        return vector;
    }

    private void armaHeap(int[] vector, int primero, int ultimo) {
        if (primero < ultimo) {
            int actual = primero;
            while (actual <= ultimo / 2) {
                if (ultimo == 2 * actual) { //r tiene un hijo solo
                    if (vector[actual] > vector[actual * 2]) {
                        intercambiar(vector, actual, 2 * actual);
                    }
                    actual = ultimo;
                } else { //r tiene 2 hijos
                    int menor = menorHijo(vector, 2 * actual, 2 * actual + 1);
                    if (vector[actual] > vector[menor]) {
                        intercambiar(vector, actual, menor);
                        actual = menor;
                    } else {
                        actual = ultimo;
                    }
                }
            }
        }
    }

    private int menorHijo(int[] vector, int posicionIzq, int posicionDer) {
        int menor = Math.min(vector[posicionIzq], vector[posicionDer]);
        if (menor == vector[posicionIzq]) {
            return posicionIzq;
        } else {
            return posicionDer;
        }
    }
}

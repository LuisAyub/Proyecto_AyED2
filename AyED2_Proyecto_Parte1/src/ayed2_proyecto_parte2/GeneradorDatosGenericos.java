package ayed2_proyecto_parte2;

import java.util.Random;

public class GeneradorDatosGenericos {
	private static int TAMANIO_MAX = 30000;
	public int[] generarDatosAleatorios() {
		Random rnd = new Random();
		int[] datosGenerados = new int[getTAMANIO_MAX()];
		boolean[] datosUtilizados = new boolean[getTAMANIO_MAX()];
		for (int i = 0; i < datosGenerados.length; i++) {
			int j = rnd.nextInt(getTAMANIO_MAX());
			while(datosUtilizados[j]){
				j = (j + 1) % getTAMANIO_MAX();
			}
			datosGenerados[j] = i;
			datosUtilizados[j] = true;
		}
		return datosGenerados;
	}
	
	public int[] generarDatosAscendentes() {
		int [] copiaAscendente = new int[getTAMANIO_MAX()];
		for (int i = 0; i < getTAMANIO_MAX(); i++) {
			copiaAscendente[i] = i;
		}
		return copiaAscendente;
	}
	
	public int[] generarDatosDescendentes() {
		int [] copiaDescendente = new int[getTAMANIO_MAX()];
		for (int i = 0; i < getTAMANIO_MAX(); i++) {
			copiaDescendente[i] = getTAMANIO_MAX() - i;
		}
		return copiaDescendente;
	}

    /**
     * @return the TAMANIO_MAX
     */
    public static int getTAMANIO_MAX() {
        return TAMANIO_MAX;
    }

    /**
     * @param aTAMANIO_MAX the TAMANIO_MAX to set
     */
    public static void setTAMANIO_MAX(int aTAMANIO_MAX) {
        TAMANIO_MAX = aTAMANIO_MAX;
    }
	
}

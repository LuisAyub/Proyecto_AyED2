/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ayed2_proyecto_parte2;

/**
 *
 * @author Luigi PC
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        TCronometro crono = new TCronometro();
        GeneradorDatosGenericos gdg = new GeneradorDatosGenericos();
        int[] vectorAleatorio = gdg.generarDatosAleatorios();
        int[] vectorAscendente = gdg.generarDatosAscendentes();
        int[] vectorDescendente = gdg.generarDatosDescendentes();
//        for (int i = 0; i <= 5; i++){
//            vectorAleatorio = gdg.generarDatosAleatorios();
//            crono.calcularTiempos(3,vectorAleatorio);
//            System.out.println("--------------------------------");
//        }
        double[][] tiempos = new double[15][6];
        System.out.println("Insercion Directa Aleatorio: ");
        tiempos[0] = crono.calcularTiempos(1,vectorAleatorio,5);
        System.out.println("Insercion Directa Ascendente: ");
        tiempos[1] = crono.calcularTiempos(1,vectorAscendente,5);
        System.out.println("Insercion Directa Descendente: ");
        tiempos[2] = crono.calcularTiempos(1,vectorDescendente,5);
        System.out.println("------------------------------");
        System.out.println("Burbuja Aleatorio: ");
        tiempos[3] = crono.calcularTiempos(2,vectorAleatorio,5);
        System.out.println("Burbuja Ascendente: ");
        tiempos[4] = crono.calcularTiempos(2,vectorAscendente,5);
        System.out.println("Burbuja Descendente: ");
        tiempos[5] = crono.calcularTiempos(2,vectorDescendente,5);
        System.out.println("------------------------------");
        System.out.println("Quicksort Aleatorio: ");
        tiempos[6] = crono.calcularTiempos(3,vectorAleatorio,5);
        System.out.println("Quicksort Ascendente: ");
        tiempos[7] = crono.calcularTiempos(3,vectorAscendente,5);
        System.out.println("Quicksort Descendente: ");
        tiempos[8] = crono.calcularTiempos(3,vectorDescendente,5);
        System.out.println("------------------------------");
        System.out.println("Selecion Directa Aleatorio: ");
        tiempos[9] = crono.calcularTiempos(4,vectorAleatorio,5);
        System.out.println("Selecion Directa Ascendente: ");
        tiempos[10] = crono.calcularTiempos(4,vectorAscendente,5);
        System.out.println("Selecion Directa Descendente: ");
        tiempos[11] = crono.calcularTiempos(4,vectorDescendente,5);
        System.out.println("------------------------------");
        System.out.println("Heapsort Aleatorio: ");
        tiempos[12] = crono.calcularTiempos(5,vectorAleatorio,5);
        System.out.println("Heapsort Ascendente: ");
        tiempos[13] = crono.calcularTiempos(5,vectorAscendente,5);
        System.out.println("Heapsort Descendente: ");
        tiempos[14] = crono.calcularTiempos(5,vectorDescendente,5);
        String[] salida = new String[tiempos.length];
        String temp = "";
        for(int i = 0; i < tiempos.length ; i++){
            temp = "|";
            for (int j = 0; j < 6 ; j++){
                temp += tiempos[i][j] + "|";
            }
            salida[i] = temp;
        }
        ManejadorArchivosGenerico.escribirArchivo("./src/ayed2_proyecto_parte2/salida300.txt", salida);
    }
}

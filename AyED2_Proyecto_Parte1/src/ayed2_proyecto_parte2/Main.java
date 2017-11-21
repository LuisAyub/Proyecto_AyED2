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
        double[][] tiempos = new double[15][1];
        System.out.println("Insercion Directa Aleatorio: ");
        tiempos[0][0] = crono.calcularTiempos(1,vectorAleatorio);
        System.out.println("Insercion Directa Ascendente: ");
        tiempos[1][0] = crono.calcularTiempos(1,vectorAscendente);
        System.out.println("Insercion Directa Descendente: ");
        tiempos[2][0] = crono.calcularTiempos(1,vectorDescendente);
        System.out.println("------------------------------");
        System.out.println("Burbuja Aleatorio: ");
        tiempos[3][0] = crono.calcularTiempos(2,vectorAleatorio);
        System.out.println("Burbuja Ascendente: ");
        tiempos[4][0] = crono.calcularTiempos(2,vectorAscendente);
        System.out.println("Burbuja Descendente: ");
        tiempos[5][0] = crono.calcularTiempos(2,vectorDescendente);
        System.out.println("------------------------------");
        System.out.println("Quicksort Aleatorio: ");
        tiempos[6][0] = crono.calcularTiempos(3,vectorAleatorio);
        System.out.println("Quicksort Ascendente: ");
        tiempos[7][0] = crono.calcularTiempos(3,vectorAscendente);
        System.out.println("Quicksort Descendente: ");
        tiempos[8][0] = crono.calcularTiempos(3,vectorDescendente);
        System.out.println("------------------------------");
        System.out.println("Selecion Directa Aleatorio: ");
        tiempos[9][0] = crono.calcularTiempos(4,vectorAleatorio);
        System.out.println("Selecion Directa Ascendente: ");
        tiempos[10][0] = crono.calcularTiempos(4,vectorAscendente);
        System.out.println("Selecion Directa Descendente: ");
        tiempos[11][0] = crono.calcularTiempos(4,vectorDescendente);
        System.out.println("------------------------------");
        System.out.println("Heapsort Aleatorio: ");
        tiempos[12][0] = crono.calcularTiempos(5,vectorAleatorio);
        System.out.println("Heapsort Ascendente: ");
        tiempos[13][0] = crono.calcularTiempos(5,vectorAscendente);
        System.out.println("Heapsort Descendente: ");
        tiempos[14][0] = crono.calcularTiempos(5,vectorDescendente);
        for(double[] i: tiempos){
            System.out.println(i[0]);
        }
    }
}

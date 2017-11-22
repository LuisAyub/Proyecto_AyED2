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
class TCronometro {
    
    public double[] calcularTiempos(int metodo,int[] vector, int rep){
        TClasificador clasificador = new TClasificador();
        int[] copia = null;
        double[] tiempoFinal = new double[rep];
//        imprimirArray(vector);
        for (int i = 0; i <= rep; i++){
            long total = 0;
            int llamadas = 0;
            long start = System.nanoTime();
            while (total < 1000000000) {
                llamadas++;
                copia = copiarVector(vector);
                clasificador.clasificar(copia, metodo, false);
                total = System.nanoTime() - start;
            }
            double tiempoMedio = total / llamadas;

    //        System.out.println("\n-----Valores con cáscara-----");
    //        System.out.println("Tiempo total: " + total);
    //        System.out.println("Cantidad de llamadas: " + llamadas);
    //        System.out.println("Tiempo medio: " + tiempoMedio);
    //        imprimirArray(copia);
            start = System.nanoTime();
            total = 0;
            llamadas = 0;
            while (total < 1000000000) {
                llamadas++;
                copia = copiarVector(vector);
                clasificador.clasificar(copia, metodo, true);
                total = System.nanoTime() - start;
            }
            double tiempoCascara = total / llamadas;

    //        System.out.println("\n-----Valores de cáscara-----");
    //        System.out.println("Tiempo total: " + total);
    //        System.out.println("Cantidad de llamadas: " + llamadas);
    //        System.out.println("Tiempo medio: " + tiempoCascara);

    //        System.out.println("\n-----Valor final-----");
            tiempoFinal[i] = tiempoMedio - tiempoCascara;
        }
//        System.out.println("Tiempo del algoritmo: " + tiempoFinal);
        return tiempoFinal;
    }
    
    private void imprimirArray(int[] array){
        System.out.print("|");
        for(int i: array){
            System.out.print(i + "|");
        }
        System.out.println("");
    }
    public int[] copiarVector(int[] datos){
        int[] copia = new int[datos.length];
        for (int i = 0; i < datos.length; i++){
            copia [i] = datos[i];
        }
        return copia;
    }
}

package ayed2_proyecto_parte1;


import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;

/**
 * Clase que se encarga de leer o escribir archivos.
 * @author Luis Ayub
 */
public class ManejadorArchivosGenerico {

    /**
    * Metodo que se encarga de escribir un archivo, dado el nombre del 
    * archivo y las lineas a escribir.
    * @param nombreCompletoArchivo Nombre del archivo a escribir.
    * @param listaLineasArchivo Lista con las lineas del archivo.
    */
    public static void escribirArchivo(String nombreCompletoArchivo,
            String[] listaLineasArchivo) {
        FileWriter fw;
        try {
            fw = new FileWriter(nombreCompletoArchivo, true);
            BufferedWriter bw = new BufferedWriter(fw);
            for (int i = 0; i < listaLineasArchivo.length; i++) {
                String lineaActual = listaLineasArchivo[i];
                bw.write(lineaActual);
                bw.newLine();
            }
            bw.close();
            fw.close();
        } catch (IOException e) {
            System.out.println("Error al escribir el archivo "
                    + nombreCompletoArchivo);
            e.printStackTrace();
        }
    }
    
    /**
     * Metodo que se encargar de leer un archivo, dado el nombre del archivo.
     * @param nombreCompletoArchivo Ruta del archivo con su nombre.
     * @param ignoreHeader boolean que indica si ignora la primera linea o no.
     * @return Retorna un array de Strings con las lineas del archivo.
     */
    public static String[] leerArchivo(String nombreCompletoArchivo, boolean ignoreHeader) {
        FileReader fr;
        ArrayList<String> listaLineasArchivo = new ArrayList<String>();
        try {
            fr = new FileReader(nombreCompletoArchivo);
            BufferedReader br = new BufferedReader(fr);
            String lineaActual = br.readLine();
            if (ignoreHeader) lineaActual = br.readLine();
            while (lineaActual != null) {
                listaLineasArchivo.add(lineaActual);
                lineaActual = br.readLine();
            }
            br.close();
            fr.close();
        } catch (FileNotFoundException e) {
            System.out.println("Error al leer el archivo "
                    + nombreCompletoArchivo);
            e.printStackTrace();
        } catch (IOException e) {
            System.out.println("Error al leer el archivo "
                    + nombreCompletoArchivo);
            e.printStackTrace();
        }
//		System.out.println("Archivo leido satisfactoriamente");

        return listaLineasArchivo.toArray(new String[0]);
    }
}

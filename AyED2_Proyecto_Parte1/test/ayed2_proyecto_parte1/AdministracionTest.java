package ayed2_proyecto_parte1;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Luis Ayub
 */
public class AdministracionTest {
    
    public AdministracionTest() {
    }
    
    private String cargarDatosTestObtenerCaminos(){
        return "Aerolinea:  Aerolinea C // 1 -> 8 // Costo: 150.0\n";
    }
    
    private String cargarDatosTestImprimirVuelos(){
        StringBuilder sb = new StringBuilder();
        sb.append("Aerolinea:  Aerolinea C // 1 -> 8 // Costo: 150.0\n");
        sb.append(" ------------------------ "+"\n");
        sb.append("El vuelo de menor costo es: "+"\n");
        sb.append("Aerolinea:  Aerolinea C // 1 -> 8 // Costo: 150.0\n");
        return sb.toString();
    }
    
    /**
     * Test of CargarDatos method, of class Administracion.
     */
    @Test
    public void testCargarDatos() {
        //Cargando los datos
        String ruta1 = "./test/ayed2_proyecto_parte1/AerolineasTest.csv";
        String ruta2 = "./test/ayed2_proyecto_parte1/AeropuertosTest.csv";
        String ruta3 = "./test/ayed2_proyecto_parte1/VuelosTest.csv";
        Administracion instance = new Administracion();
        System.out.println("cargarDatos: Prueba 1 Caso vacio");
        boolean result = instance.cargarDatos("", "", "");
        assertFalse(result);
        System.out.println("cargarDatos: Prueba 2 Caso general");
        result = instance.cargarDatos(ruta1,ruta2,ruta3);
        assertTrue(result);
    }
    
    /**
     * Test of obtenerCaminos method, of class Administracion.
     */
    @Test
    public void testObtenerCaminos() {
        //Cargando los datos
        String ruta1 = "./test/ayed2_proyecto_parte1/AerolineasTest.csv";
        String ruta2 = "./test/ayed2_proyecto_parte1/AeropuertosTest.csv";
        String ruta3 = "./test/ayed2_proyecto_parte1/VuelosTest.csv";
        Administracion instance = new Administracion();
        instance.cargarDatos(ruta1, ruta2, ruta3);
        System.out.println("obtenerCaminos: Prueba 1 Caso vacio");
        Comparable origen = "";
        Comparable destino = "";
        TVuelos result1 = instance.obtenerCaminos(origen, destino);
        assertNull(result1);
        System.out.println("obtenerCaminos: Prueba 2 Caso 1,8");
        origen = "1";
        destino = "8";
        String expResult2 = cargarDatosTestObtenerCaminos();
        String result2 = instance.obtenerCaminos(origen, destino).imprimirVuelos();
        assertEquals(expResult2, result2);
    }

    /**
     * Test of imprimirVuelos method, of class Administracion.
     */
    @Test
    public void testImprimirVuelos() {
        //Cargando los datos
        String ruta1 = "./test/ayed2_proyecto_parte1/AerolineasTest.csv";
        String ruta2 = "./test/ayed2_proyecto_parte1/AeropuertosTest.csv";
        String ruta3 = "./test/ayed2_proyecto_parte1/VuelosTest.csv";
        Administracion instance = new Administracion();
        instance.cargarDatos(ruta1, ruta2, ruta3);
        System.out.println("imprimirVuelos: Prueba 1 caso vacio");
        TVuelos vuelosTotal = instance.obtenerCaminos("", "");
        String expResult = "";
        String result = instance.imprimirVuelos(vuelosTotal);
        assertEquals(expResult, result);
        System.out.println("imprimirVuelos: Prueba 2 caso general");
        vuelosTotal = instance.obtenerCaminos("1", "8");
        expResult = cargarDatosTestImprimirVuelos();
        result = instance.imprimirVuelos(vuelosTotal);
        assertEquals(expResult, result);
    }
    
}

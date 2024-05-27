/**
 * Clase para probar el funcionamiento del código
 * @author Área de programación UQ
 * @since 2023-08
 * 
 * Licencia GNU/GPL V3.0 (https://raw.githubusercontent.com/grid-uq/poo/main/LICENSE) 
 */
package co.edu.uniquindio.poo;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.junit.jupiter.api.Assertions.assertTrue;
import java.util.logging.Logger;
import org.junit.jupiter.api.Test;

/**
 * Unit test for simple App.
 */
public class ParqueaderoTest {
    private static final Logger LOG = Logger.getLogger(ParqueaderoTest.class.getName());
   /*
    * prueba para crear un parqueadero correctamente
    */
    @Test
    public void crearParqueaderoCorrectamente() {
        LOG.info("Iniciado test crearParqueaderoCorrectamente");
        Parqueadero parqueadero = new Parqueadero(2, 2);

        assertEquals(2, parqueadero.getFilas());
        assertEquals(2, parqueadero.getColumnas());
        LOG.info("Finalizando test crearParqueaderoCorrectamente");
    }


    /**
     * prueba para pobrar el metodo ocuparPuesto
     */
    
    @Test
    public void ocuparPuestoVacioCorrectamente() {
        LOG.info("Iniciado test ocuparPuestoVacioCorrectamente");
        Vehiculo vehiculo = new Carro("abc123", "2023A", new Propietario("Walter G", "31490"));
        Parqueadero parqueadero = new Parqueadero(2, 2);
        parqueadero.ocuparPuesto(vehiculo, 0);

        assertEquals(parqueadero.getDimension()[0][0].getVehiculo(), vehiculo);
        assertTrue(parqueadero.getDimension()[0][0].isOcupado()==true);
        LOG.info("Finalizando test ocuparPuestoVacioCorrectamente");
    }

    /*
     *  prueba al metodo puestoDisponibilidadPorVehiculo
     */
    @Test
    public void puestoDisponibilidadPorVehiculoFunciona() {
        LOG.info("Iniciado test puestoDisponibilidadPorVehiculoFunciona");
         Vehiculo vehiculo = new Carro("abc123", "2023A", new Propietario("Walter G", "31490"));
         Parqueadero parqueadero = new Parqueadero(2, 2);
         parqueadero.ocuparPuesto(vehiculo, 0);
 
         assertTrue(parqueadero.puestoDisponibilidadPorVehiculo(vehiculo));
         LOG.info("Finalizando test puestoDisponibilidadPorVehiculoFunciona");
    }
    /*
     *  prueba al metodo puestoDisponibilidad
     */
    @Test
    public void puestoDisponibilidadFunciona() {
        LOG.info("Iniciado test puestoDisponibilidadFunciona");
         Vehiculo vehiculo = new Carro("abc123", "2023A", new Propietario("Walter G", "31490"));
         Parqueadero parqueadero = new Parqueadero(2, 2);
         parqueadero.ocuparPuesto(vehiculo, 0);
 
         assertTrue(parqueadero.puestoDisponibilidad(0));
         LOG.info("Finalizando test puestoDisponibilidadFunciona");
    }

    /*
     * prueba para probar el correcto funcionamiento del metodo obtenerPropietarioPorPuesto
     */

    /**
     * prueba para pobrar el metodo ocuparPuesto y que no se agregue en un puesto que esta ocupado
     */
    
     @Test
     public void denegarOcuparUnPuestoOcupado() {
        LOG.info("Iniciado test denegarOcuparUnPuestoOcupado");
         Vehiculo vehiculo = new Carro("abc123", "2023A", new Propietario("Walter G", "31490"));
         Vehiculo vehiculo1 = new Carro("ab2c123", "20223A", new Propietario("Walter H", "31490"));
         Parqueadero parqueadero = new Parqueadero(2, 2);
         parqueadero.ocuparPuesto(vehiculo, 0);
         parqueadero.ocuparPuesto(vehiculo1, 0);

         assertEquals(vehiculo, parqueadero.getDimension()[0][0].getVehiculo());
         assertFalse(parqueadero.puestoDisponibilidadPorVehiculo(vehiculo1));
         LOG.info("Finalizando test denegarOcuparUnPuestoOcupado");
     }    

    /**
     * prueba para el metodo liberar puestp
     */
    
     @Test
     public void liberarPuestoFunciona() {
        LOG.info("Iniciado test denegarOcuparUnPuestoOcupado");
         Vehiculo vehiculo = new Carro("abc123", "2023A", new Propietario("Walter G", "31490"));
         Parqueadero parqueadero = new Parqueadero(2, 2);
         parqueadero.establecerTarifa("CARRO", 10000.0);
         parqueadero.ocuparPuesto(vehiculo, 0);     

         assertTrue(parqueadero.puestoDisponibilidad(0));
         parqueadero.liberarPuesto(0);

         assertFalse(parqueadero.puestoDisponibilidad(0)&&parqueadero.puestoDisponibilidadPorVehiculo(vehiculo));
         assertFalse(parqueadero.getDimension()[0][0].isOcupado());
         LOG.info("Finalizando test denegarOcuparUnPuestoOcupado");
     }        
}

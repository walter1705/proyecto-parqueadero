/**
 * Clase para probar el funcionamiento del código
 * @author Área de programación UQ
 * @since 2023-08
 * 
 * Licencia GNU/GPL V3.0 (https://raw.githubusercontent.com/grid-uq/poo/main/LICENSE) 
 */
package co.edu.uniquindio.poo;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;
import java.util.logging.Logger;
import org.junit.jupiter.api.Test;

/**
 * Unit test for simple App.
 */
public class ParqueaderoTest {
    private static final Logger LOG = Logger.getLogger(ParqueaderoTest.class.getName());

    /**
     * prueba para pobrar el metodo ocuparPuesto
     */
    
    @Test
    public void ocuparPuestoVacio() {
        LOG.info("Iniciado test ocuparPuestoVacio");
        Vehiculo vehiculo = new Carro("abc123", "2023A", new Propietario("Walter G", "31490"));
        Parqueadero parqueadero = new Parqueadero(2, 2);
        parqueadero.ocuparPuesto(vehiculo, 0);

        assertEquals(parqueadero.getDimension()[0][0].getVehiculo(), vehiculo);
        assertTrue(parqueadero.getDimension()[0][0].isOcupado()==true);
        LOG.info("Finalizando test ocuparPuestoVacio");
    }
}

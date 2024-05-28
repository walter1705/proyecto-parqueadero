package co.edu.uniquindio.poo;

import static org.junit.jupiter.api.Assertions.assertThrows;

import java.util.logging.Logger;

import org.junit.jupiter.api.Test;

public class VehiculoTest {
    private static final Logger LOG = Logger.getLogger(VehiculoTest.class.getName());
   /*
    * prueba para crear un vehiculo correctamente
    */
    @Test
    public void vehiculoDatosNulos() {
        LOG.info("Iniciado test vehiculoDatosCompletos");
        assertThrows(Throwable.class, ()-> new Vehiculo(null, null, null));
        LOG.info("Finalizando test vehiculoDatosCompletos");
    }

    @Test
    public void vehiculoDatosVacios() {
        LOG.info("Iniciado test vehiculoDatosCompletos");
        assertThrows(Throwable.class, ()-> new Vehiculo(" ", "", new Propietario(" ", " ")));
        LOG.info("Finalizando test vehiculoDatosCompletos");
    }
}

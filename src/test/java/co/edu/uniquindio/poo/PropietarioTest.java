package co.edu.uniquindio.poo;

import static org.junit.jupiter.api.Assertions.assertThrows;

import java.util.logging.Logger;

import org.junit.jupiter.api.Test;

public class PropietarioTest {
    private static final Logger LOG = Logger.getLogger(PropietarioTest.class.getName());
   /*
    * prueba para crear un propietario correctamente
    */
    @Test
    public void propietarioDatosNulos() {
        LOG.info("Iniciado test propietarioDatosNulos");
        assertThrows(Throwable.class, ()-> new Propietario(null, null));
        LOG.info("Finalizando test propietarioDatosNulos");
    }
    @Test
    public void propietarioDatosVacios() {
        LOG.info("Iniciado test propietarioDatosNulos");
        assertThrows(Throwable.class, ()-> new Propietario("", ""));
        LOG.info("Finalizando test propietarioDatosNulos");
    }
}

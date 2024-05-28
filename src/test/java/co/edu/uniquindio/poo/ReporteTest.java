package co.edu.uniquindio.poo;

import static org.junit.jupiter.api.Assertions.assertThrows;

import java.util.logging.Logger;

import org.junit.jupiter.api.Test;

public class ReporteTest {
    private static final Logger LOG = Logger.getLogger(RegistroTest.class.getName());
   /*
    * prueba para crear un reporte correctamente
    */
    @Test
    public void reporteDatosNulos() {
        LOG.info("Iniciado test reporteDatosNulos");
        assertThrows(Throwable.class, ()-> new Reporte(-1, -1, -1, -1));
        LOG.info("Finalizando test reporteDatosNulos");
    }
}

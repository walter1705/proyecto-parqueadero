package co.edu.uniquindio.poo;

import static org.junit.jupiter.api.Assertions.assertThrows;

import java.util.logging.Logger;

import org.junit.jupiter.api.Test;

public class PuestoTest {
    private static final Logger LOG = Logger.getLogger(PuestoTest.class.getName());
   /*
    * prueba para crear un propietario correctamente
    */
    @Test
    public void puestoDatosNulos() {
        LOG.info("Iniciado test puestoDatosNulos");
        assertThrows(Throwable.class, ()-> new Puesto(null, false));
        LOG.info("Finalizando test puestoDatosNulos");
    }

    @Test
    public void puestoDatosVacios() {
        LOG.info("Iniciado test puestoDatosVacios");
        assertThrows(Throwable.class, ()-> new Puesto(new Vehiculo("", "", new Propietario("", "")), false));
        LOG.info("Finalizando test puestoDatosVacios");
    }
}

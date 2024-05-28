package co.edu.uniquindio.poo;

import static org.junit.jupiter.api.Assertions.assertThrows;

import java.time.LocalDateTime;
import java.util.logging.Logger;

import org.junit.jupiter.api.Test;

public class RegistroTest {
     private static final Logger LOG = Logger.getLogger(RegistroTest.class.getName());
   /*
    * prueba para crear un registro correctamente
    */
    @Test
    public void registroDatosNulos() {
        LOG.info("Iniciado test propietarioDatosNulos");
        assertThrows(Throwable.class, ()-> new Registro(null, 0, null, null, null));
        LOG.info("Finalizando test propietarioDatosNulos");
    }
    /*
     * prueba para que la hora de entrada sea antes que la hora de salida
     */
    @Test
    public void registroHoraEntradaDespuesHoraSalida() {
        LOG.info("Iniciado test registroHoraEntradaDespuesHoraSalida");
        assertThrows(Throwable.class, ()-> new Registro(new Vehiculo("ABC123", "2020", new Propietario("Walter Granada", "123")), 0, LocalDateTime.of(2024, 5, 27, 7, 59, 0), LocalDateTime.of(2024, 5, 27, 7, 58, 0), 1000.0));
        LOG.info("Finalizando test registroHoraEntradaDespuesHoraSalida");
    }
}

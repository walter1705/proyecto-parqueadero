package co.edu.uniquindio.poo;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

import java.util.logging.Logger;

import org.junit.jupiter.api.Test;

public class MotoTest {
    private static final Logger LOG = Logger.getLogger(MotoTest.class.getName());
   /*
    * prueba para crear una moto correctament4
    */
    @Test
    public void velocidadMaxNula() {
        LOG.info("Iniciado test velocidadMaxNula");
        assertThrows(Throwable.class, ()-> new Moto("ABC123", "2022", new Propietario("Walter", "321"), -2, TipoMoto.CLASICA));

        LOG.info("Finalizando test velocidadMaxNula");
    }
    /*
     * Prueba para crear correctamente una moto clasica
     */
    @Test
    public void motoClasica() {
        LOG.info("Iniciado test motoClasica");
        Moto moto = new Moto("ABC123", "2022", new Propietario("Walter", "321"), 60, TipoMoto.CLASICA);
        assertEquals(moto.getTipoMoto(), TipoMoto.CLASICA);

        LOG.info("Finalizando test motoClasica");
    }
      /*
     * Prueba para crear correctamente una moto hibrida
     */
    @Test
    public void motoHibrida() {
        LOG.info("Iniciado test motoHibrida");
        Moto moto = new Moto("ABC123", "2022", new Propietario("Walter", "321"), 60, TipoMoto.HIBRIDA);
        assertEquals(moto.getTipoMoto(), TipoMoto.HIBRIDA);

        LOG.info("Finalizando test motoHibrida");
    }
}

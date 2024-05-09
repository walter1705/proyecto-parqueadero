package co.edu.uniquindio.poo;

import static org.junit.jupiter.api.Assumptions.abort;

public class VehiculoTest {
    private static final Logger LOG = Logger.getLogger(ParqueaderoTest.class.getName());

    /**
     * Test para crear un carro correctamente
     */
    @Test
    public void datosCompletosCarro() {
        LOG.info("Iniciado test datosCompletosCarro");
        
        Vehiculo carro = new Carro("ABC123", "2012", new Propietario(), 4);


        LOG.info("Finalizando test datosCompletosCarro");
    }

    /*
     * Test para crear una moto clasica 
     */

    @Test
    public void datosCompletosMoto() {
        LOG.info("Iniciado test datosCompletosCarro");
        
        Vehiculo carro = new Carro("ABC123", "2012", new Propietario(), 4);


        LOG.info("Finalizando test datosCompletosCarro");
    }
}

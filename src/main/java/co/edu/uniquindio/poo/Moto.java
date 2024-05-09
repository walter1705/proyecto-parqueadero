package co.edu.uniquindio.poo;

public class Moto extends Vehiculo{
    private int velocidadMax;
    private TipoMoto tipoMoto;
    // Metodo constructor de la clase Moto

    public Moto(String placa, String modelo, Propietario propietario, int velocidadMax, TipoMoto tipoMoto) {
        super(placa, modelo, propietario);
        this.velocidadMax = velocidadMax;
        this.tipoMoto = tipoMoto;
    }
    
    //Metodos get y set del atributo velocidadMax de la clase Moto

    public int getVelocidadMax() {
        return velocidadMax;
    }

    public void setVelocidadMax(int velocidadMax) {
        this.velocidadMax = velocidadMax;
    }

    
    //Metodos get y set del atributo tipoMoto de la clase Moto

    public TipoMoto getTipoMoto() {
        return tipoMoto;
    }

    public void setTipoMoto(TipoMoto tipoMoto) {
        this.tipoMoto = tipoMoto;
    }


    
    


}

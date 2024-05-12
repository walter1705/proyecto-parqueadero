package co.edu.uniquindio.poo;

public class Puesto {
    private Posicion posicion;
    private Vehiculo vehiculo;
    //Metodo constructor de la clase Puesto
    public Puesto(Posicion posicion, Vehiculo vehiculo) {
        this.posicion = posicion;
        this.vehiculo = vehiculo;
    }
    //Metodo get y set de la posicion en la que esta la clase Puesto
    public Posicion getPosicion() {
        return posicion;
    }
    public void setPosicion(Posicion posicion) {
        this.posicion = posicion;
    }
    //Metodo get y set del vehiculo que podria ocupar la clase Puesto
    public Vehiculo getVehiculo() {
        return vehiculo;
    }
    public void setVehiculo(Vehiculo vehiculo) {
        this.vehiculo = vehiculo;
    }

    
}

package co.edu.uniquindio.poo;

public class Puesto {
    public boolean ocupado;
    public Vehiculo vehiculo;
    
    //Metodo constructor de la clase Puesto
    public Puesto(Vehiculo vehiculo, boolean ocupado)  {
        assert vehiculo != null;
        this.vehiculo = vehiculo;
        this.ocupado = ocupado;
    }
    //Metodo get y set del estado del puesto
    public boolean isOcupado() {
        return ocupado;
    }
    public void setOcupado(boolean ocupado) {
        this.ocupado = ocupado;
    }
    //Obtener y modificar el vehiculo que esta en el puesto
    public Vehiculo getVehiculo() {
        return vehiculo;
    }
    public void setVehiculo(Vehiculo vehiculo) {
        this.vehiculo = vehiculo;
    }
}

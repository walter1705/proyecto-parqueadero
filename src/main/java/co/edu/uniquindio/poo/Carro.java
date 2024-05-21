package co.edu.uniquindio.poo;

public class Carro extends Vehiculo {
    // Metodo constructor de la clase Carro
    public Carro(String placa, String modelo, Propietario propietario) {
        super(placa, modelo, propietario);
    }
    //Metodo para imprimir en consola un carro
    @Override
    public String toString() {
        return "[El carro tiene placa "+placa+", modelo "+modelo+" y propietario: "+propietario.toString()+"]";
    }
    
}

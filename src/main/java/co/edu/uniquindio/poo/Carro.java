package co.edu.uniquindio.poo;

public class Carro extends Vehiculo {
    private int puertas;
    // Metodo constructor de la clase Carro

    public Carro(String placa, String modelo, Propietario propietario, int puertas) {
        super(placa, modelo, propietario);
        this.puertas = puertas;
    }

    // metodos get y set del atributo puertas de la clase Carro
    
    public int getPuertas() {
        return puertas;
    }

    public void setPuertas(int puertas) {
        this.puertas = puertas;
    }
}

package co.edu.uniquindio.poo;

import java.time.LocalDateTime;

public class Registro {
    private Vehiculo vehiculo;
    private int posicionN;
    private LocalDateTime horaEntrada;
    private LocalDateTime horaSalida;
    private Double precio;


    public Registro(Vehiculo vehiculo, int posicionN, LocalDateTime horaEntrada, LocalDateTime horaSalida, Double precio) {
        this.vehiculo = vehiculo;
        this.posicionN = posicionN;
        this.horaEntrada = horaEntrada;
        this.horaSalida = horaSalida;
        this.precio = precio;
    }
    //Metodo para obtener y modificar el vehiculo en el registro
    public Vehiculo getVehiculo() {
        return vehiculo;
    }
    public void setVehiculo(Vehiculo vehiculo) {
        this.vehiculo = vehiculo;
    }
    //Metodo para obtener y modificar la posicion donde se encuentra el registro
    public int getPosicionN() {
        return posicionN;
    }
    public void setPosicionN(int posicionN) {
        this.posicionN = posicionN;
    }
    //Metodo para obtener y modificar la hora de entrada en el registro de un vehiculo
    public LocalDateTime getHoraEntrada() {
        return horaEntrada;
    }
    public void setHoraEntrada(LocalDateTime horaEntrada) {
        this.horaEntrada = horaEntrada;
    }
    //Metodo para obtener y modificar la hora de salida en el registro de un vehiculo
    public LocalDateTime getHoraSalida() {
        return horaSalida;
    }
    public void setHoraSalida(LocalDateTime horaSalida) {
        this.horaSalida = horaSalida;
    }  
    //Metodo para imprimir un registro completo en consola
    public String registroToString() {
        return ("El vehiculo: "+vehiculo.toString()+" entro a la hora: "+horaEntrada+" se estaciono en el puesto: "+posicionN+" y su hora de salida fue: "+horaSalida+" y se obtuvieron: "+precio+"$ de ganancia. ");
    }
    //Metodo para obtener y modificar el precio del parqueo
    public double getPrecio() {
        return precio;
    }
    public void setPrecio(Double precio) {
        this.precio = precio;
    }
    
}    
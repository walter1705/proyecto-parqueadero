package co.edu.uniquindio.poo;

import java.beans.VetoableChangeListener;
import java.util.ArrayList;

public class Parqueadero {
    private int numeroPuestos;
    private ArrayList<Puesto> puestos;
    static private int[][] dimensionParqueadero;
    //Metodo constructor de la clase Parqueadero
    public Parqueadero(int numeroPuestos) {
        this.numeroPuestos = numeroPuestos;
        this.puestos = new ArrayList<>();
        dimensionParqueadero = new int[3][6];
    }
    //Metodo get y set de los puestos que hay en la clase Parqueadero
    public ArrayList<Puesto> getPuestos() {
        return puestos;
    }
    public void setPuestos(ArrayList<Puesto> puestos) {
        this.puestos = puestos;
    }
    //Metodo get y set para la dimension del parqueadero
    static public int[][] getDimensionParqueadero() {
        return dimensionParqueadero;
    }
    public void setDimensionParqueadero(int[][] dimensionParqueadero) {
        this.dimensionParqueadero = dimensionParqueadero;
    }
    //Metodo get y set de la cantidad de puestos en enteros de la clase Parqueadero
    public int getNumeroPuestos() {
        return numeroPuestos;
    }
    public void setNumeroPuestos(int numeroPuestos) {
        this.numeroPuestos = numeroPuestos;
    }
    //Metodo para el caso de si es una moto registrar su velocidad maxima de la clase Parqueadero
    public void verificarSiEsMoto(Vehiculo vehiculo) {
        if(vehiculo.getClass()==Moto.class) {

        }
    }
    //Metodo para ocupar un Puesto por un Vehiculo
    public void ocuparPuesto(Vehiculo vehiculo) {
        for(int i = 0, i< Parqueadero.getDimensionParqueadero().length;i++) {

        }
    }
    
}

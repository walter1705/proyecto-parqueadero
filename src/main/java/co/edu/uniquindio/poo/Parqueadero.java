package co.edu.uniquindio.poo;

import java.util.ArrayList;

public class Parqueadero {
    private int numeroPuestos;
    private ArrayList<Puesto> puestos;
    //Metodo constructor de la clase Parqueadero
    public Parqueadero(int numeroPuestos) {
        this.numeroPuestos = numeroPuestos;
        this.puestos = new ArrayList<>();
    }
    //Metodo get y set de los puestos que hay en la clase Parqueadero
    public ArrayList<Puesto> getPuestos() {
        return puestos;
    }
    public void setPuestos(ArrayList<Puesto> puestos) {
        this.puestos = puestos;
    }
    //Metodo get y set de la cantidad de puestos en enteros de la clase Parqueadero
    public int getNumeroPuestos() {
        return numeroPuestos;
    }
    public void setNumeroPuestos(int numeroPuestos) {
        this.numeroPuestos = numeroPuestos;
    }
    
}

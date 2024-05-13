package co.edu.uniquindio.poo;

import java.util.HashMap;
import java.util.Map;

public class Parqueadero {
    private Puesto[][] dimension;
    private int filas, columnas;
    private Map<String, Double> tarifasParqueadero;
    //Metodo constructor de la clase parqueadero
    public Parqueadero(int filas, int columnas) {
        this.filas = filas;
        this.columnas = columnas;
        dimension = new Puesto[filas][columnas];
        tarifasParqueadero = new HashMap<>() 
        ;
    }
    //Metodo para establecer y obtener la tarifa por tipo de vehiculo
    public void establecerTarifa(String tipoVehiculo, Double montoPorHora) {
        assert montoPorHora>=0;
        if(tipoVehiculo=="CARRO") {
            tarifasParqueadero.put("CARRO", montoPorHora);
        }else if (tipoVehiculo=="MOTO CLASICA") {
            tarifasParqueadero.put("MOTO HIBRIDA", montoPorHora);
        }else if (tipoVehiculo=="MOTO HIBRIDA") {
            tarifasParqueadero.put("MOTO HIBRIDA", montoPorHora);
        } 
    }
    public double obtenerTarifa(String tipoVehiculo) {
        double montoPorHora = 0;
        if(tipoVehiculo=="CARRO") {
            montoPorHora = tarifasParqueadero.get(tipoVehiculo);
        }else if (tipoVehiculo=="MOTO CLASICA") {
            montoPorHora = tarifasParqueadero.get(tipoVehiculo);
        }else if (tipoVehiculo=="MOTO HIBRIDA") {
            montoPorHora = tarifasParqueadero.get(tipoVehiculo);
        } 
        return montoPorHora;
    }
    //Metodo para obtener el precio del estacionamiento por horas y por la tarifa ya establecida
    public double calcularCostoTotal(short horasDeServicio, Map<String, Double> tarifasParqueadero, String tipoVehiculo) {
        assert (horasDeServicio>0);
        double costoTotal=horasDeServicio*obtenerTarifa(tipoVehiculo);
        return costoTotal;
    }
    //Metodo get y set de la dimension de los puestos del parqueadero
    public Puesto[][] getDimension() {
        return dimension;
    }
    public void setDimension(Puesto[][] dimension) {
        this.dimension = dimension;
    }
    //Metodo get y set de las FILAS de la dimension de los puestos del parqueadero
    public int getFilas() {
        return filas;
    }
    public void setFilas(int filas) {
        this.filas = filas;
    }
    //Metodo get y set de las COLUMNAS de la dimension de los puestos del parqueadero
    public int getColumnas() {
        return columnas;
    }
    public void setColumnas(int columnas) {
        this.columnas = columnas;
    }
    //Metodo para ver si el vehiculo esta registrado una vez (maximo de registro al mismo tiempo: 1)(true=ocupado)
    public boolean puestoDisponibilidadPorVehiculo(Vehiculo vehiculo) {
        boolean disponibilidad=false;
        for(int x=0;x<getFilas();x++){
            for(int y=0;y<getColumnas();y++) {
                if (dimension[x][y].getVehiculo()==vehiculo) {
                    disponibilidad=true;
                }
            }
        }
        return disponibilidad;
    }
     //Metodo para ver si un puesto esta ocupada o no(boolean) por indice : (True=ocupado)
     public boolean puestoDisponibilidad(int t, int w) {
        assert (t<=getFilas()&&w<=getColumnas());
        return dimension[t][w].isOcupado();
    }
    //Metodo para ocupar un Puesto con un vehiculo
    public void ocuparPuesto(Vehiculo vehiculo, int t, int w) {
        assert (t<=getFilas()&&w<=getColumnas());
        assert (dimension[t][w].isOcupado()==false)&&(puestoDisponibilidadPorVehiculo(vehiculo)==false);
        dimension[t][w].setVehiculo(vehiculo);
        dimension[t][w].setOcupado(true);
    }
    //Metodo para obtener el propietario de un vehiculo en un puesto dado
    public Propietario obtenerPropietarioPorPuesto(int t, int w) {
        Propietario propietario=dimension[t][w].getVehiculo().getPropietario();
        return propietario;
    }
    
}

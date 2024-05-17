package co.edu.uniquindio.poo;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;

import java.util.Map;
import java.util.Scanner;


public class Parqueadero {
    static private Scanner scanner = new Scanner(System.in);
    private Puesto[][] dimension;
    private int filas, columnas;
    private Map<String, Double> tarifasParqueadero;
    private Collection<RegistroEntrada> registros;
    
    //Metodo constructor de la clase parqueadero
    public Parqueadero(int filas, int columnas) {
        this.filas = filas;
        this.columnas = columnas;
        dimension = new Puesto[filas][columnas];
        tarifasParqueadero = new HashMap<>();
        registros = new ArrayList<>();
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
    //Metodo para establecer la tarifas del parqueadero 
    public void setTarifaManual() {
        System.out.println("Ingrese la tarifa unitaria del carro: ");
        double tarifaCarro = scanner.nextInt();

        System.out.println("Ingrese la tarifa unitaria de la moto, clasica: ");
        double tarifaMotoClasica = scanner.nextInt();

        System.out.println("Ingrese la tarifa unitaria del carro: ");
        double tarifaMotoHibrida = scanner.nextInt();

        establecerTarifa("CARRO", tarifaCarro);
        establecerTarifa("MOTO CLASICA", tarifaMotoClasica);
        establecerTarifa("MOTO HIBRIDA", tarifaMotoHibrida);

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
    //metodo para modificar las filas y columnas del parqueadero
    public void setDimensionManual() {
        System.out.println("Ingrese las filas de su parqueadero. (i<-, j)");
        int i = scanner.nextInt();

        System.out.println("Ingrese las columnas de su parqueadero. (i, ->j)");
        int j = scanner.nextInt();

        setFilas(i);
        setColumnas(j);
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
     public boolean puestoDisponibilidad(int n) {
        assert (n<=dimension.length);
        int contadorcito = 0;
        boolean ocupado = false;
        for(int i=0;i<getFilas();i++) {
            for(int j=0;j<getColumnas();j++) {
                if (n==contadorcito) {
                    ocupado=dimension[i][j].isOcupado();
                }
                contadorcito+=1;
            }
        }
        return ocupado;
     }
    //Metodo interativo para registrar un vehiculo
    public void registrarVehiculo() {
        System.out.println("Tipos de vehiculos: 1. Carro  2. Moto");
        System.out.println("Elige el tipo de vehiculo.");
        int tipo = scanner.nextInt();

        
        int velMaxima=0;
        int tipoMoto=0;
        if (tipo==2) {
            while(tipoMoto!=1 || tipoMoto!=2) {
            System.out.println("1. Clasica   2. Hibrida  ");
            tipoMoto = scanner.nextInt();
            }
            System.out.println("Ingrese la velocidad maxima de la moto: ");
            velMaxima = scanner.nextInt();
            }
        System.out.println("Ingrese su nombre completo: ");
        String nombre = scanner.nextLine();
        
        System.out.println("Ingrese su documento de identificacion: ");
        String id = scanner.nextLine();

        System.out.println("Ingrese la placa del vehiculo a registrar: ");
        String placa = scanner.nextLine();

        System.out.println("Ingrese el modelo del vehiculo a registrar: ");
        String modelo = scanner.nextLine();

        System.out.println("Ingrese el puesto de parqueadero que desea asignar al vehiculo: ");
        int n = scanner.nextInt();
        System.out.println("Se encuentran "+ dimension.length +" puestos en el parqueadero. ");

        System.out.println();
        
        switch (tipo) {
            case 1:
                ocuparPuesto(new Carro(placa, modelo, new Propietario(nombre, id)), n);
                break;
            case 2:
                if (tipoMoto==1) {
                    ocuparPuesto(new Moto(placa, modelo, new Propietario(nombre, id), velMaxima, TipoMoto.CLASICA), n);
                } else {
                    ocuparPuesto(new Moto(placa, modelo, new Propietario(nombre, id), velMaxima, TipoMoto.HIBRIDA), n);
                }
                break;
            default:
            System.out.println("Opcion invalida.");
                break;
        }
    }
    //Metodo para ocupar un Puesto con un vehiculo
    public void ocuparPuesto(Vehiculo vehiculo, int n) {
        assert (n<=dimension.length);
        int contadorcito = 0;
        for(int i=0;i<getFilas();i++) {
            for(int j=0;j<getColumnas();j++) {
                if (n==contadorcito) {
                    assert (dimension[i][j].isOcupado()==false)&&(puestoDisponibilidadPorVehiculo(vehiculo)==false);
                    dimension[i][j].setVehiculo(vehiculo);
                    dimension[i][j].setOcupado(true);
                }
                contadorcito+=1;
            }
        } 
    }
    //Metodo para obtener el propietario de un vehiculo en un puesto dado
    public Propietario obtenerPropietarioPorPuesto(int n) {
        assert (n<=dimension.length);
        Propietario propietario = new Propietario(null, null);
        int contadorcito = 0;
        for(int i=0;i<getFilas();i++) {
            for(int j=0;j<getColumnas();j++) {
                if (n==contadorcito) {
                    propietario=dimension[i][j].getVehiculo().getPropietario();
                }
                contadorcito+=1;
            }
        } 
        return propietario;
    }
    //Metodo para anadir un registro a la lista de registros
    public void registrarEntrada(Vehiculo vehiculo, int posicion) {
        RegistroEntrada registro = new RegistroEntrada(vehiculo, posicion);
        registros.add(registro);
    }
    //Clase interna para tener registro de lo que sucede en el parqueadero
    private static class RegistroEntrada {
        private Vehiculo vehiculo;
        private int posicionN;

        public RegistroEntrada(Vehiculo vehiculo, int posicionN) {
            this.vehiculo = vehiculo;
            this.posicionN = posicionN;
        }  
    }    
}

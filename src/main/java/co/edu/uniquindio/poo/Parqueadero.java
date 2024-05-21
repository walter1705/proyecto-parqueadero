package co.edu.uniquindio.poo;

import java.time.LocalDateTime;
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
        for (int i = 0; i < filas; i++) {
            for (int j = 0; j < columnas; j++) {
                dimension[i][j] = new Puesto(new Vehiculo("plantilla", "plantilla", new Propietario("plantilla", "plantilla")), false); 
            }
        }
        tarifasParqueadero = new HashMap<>();
        registros = new ArrayList<>();
    }
    //Metodo para obtener la tabla de tarifas de parqueadero
    public Map<String, Double> getTarifasParqueadero() {
        return tarifasParqueadero;
    }
    //Metodo para obtener los registros del parqueadero
    public Collection<RegistroEntrada> getRegistros() {
        return registros;
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
        double tarifaCarro = scanner.nextDouble();
        scanner.nextLine();

        System.out.println("Ingrese la tarifa unitaria de la moto, clasica: ");
        double tarifaMotoClasica = scanner.nextDouble();
        scanner.nextLine();

        System.out.println("Ingrese la tarifa unitaria del carro: ");
        double tarifaMotoHibrida = scanner.nextDouble();
        scanner.nextLine();

        establecerTarifa("CARRO", tarifaCarro);
        establecerTarifa("MOTO CLASICA", tarifaMotoClasica);
        establecerTarifa("MOTO HIBRIDA", tarifaMotoHibrida);

    }
    //Metodo para obtener el precio del estacionamiento por horas y por la tarifa ya establecida
    public double calcularCostoTotal(short horasDeServicio, String tipoVehiculo) {
        assert (horasDeServicio>0);
        double costoTotal=horasDeServicio*obtenerTarifa(tipoVehiculo);
        return costoTotal;
    }
    //Metodo get y set de la dimension de los puestos del parqueadero
    public Puesto[][] getDimension() {
        return dimension;
    }
    public void setDimension(Puesto dimension[][]) {
        this.dimension =dimension;
    }
    //metodo para modificar las filas y columnas del parqueadero
    public void setDimensionManual() {
        System.out.println("Ingrese las filas de su parqueadero. (i<-, j)");
        int i = scanner.nextInt();
        scanner.nextLine();

        System.out.println("Ingrese las columnas de su parqueadero. (i, ->j)");
        int j = scanner.nextInt();
        scanner.nextLine();

        setFilas(i);
        setColumnas(j);
        Puesto[][] dimension = new Puesto[i][j];
        for (int y = 0; y < filas; y++) {
            for (int x = 0; x < columnas; x++) {
                dimension[y][x] = new Puesto(new Vehiculo("plantilla", "plantilla", new Propietario("plantilla", "plantilla")), false); 
            }
        }
        setDimension(dimension);
        
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
        assert (n<=dimension.length-1);
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
        scanner.nextLine();

        int velMaxima=0;
        int tipoMoto=0;
        if (tipo==2) {
            while(tipoMoto==0) {
            System.out.println("1. Clasica   2. Hibrida  ");
            tipoMoto = scanner.nextInt();
            scanner.nextLine();
            }
            System.out.println("Ingrese la velocidad maxima de la moto: ");
            velMaxima = scanner.nextInt();
            scanner.nextLine();
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
        scanner.nextLine();
        System.out.println("Se encuentran "+ (dimension.length*dimension[0].length) +" puestos en el parqueadero. ");  /// siempre muestra 1 en el metodo interac
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
        assert (n<=dimension.length-1);
        int contadorcito = 0;
        for(int i=0;i<getFilas();i++) {
            for(int j=0;j<getColumnas();j++) {
                if (n==contadorcito) {
                    assert !dimension[i][j].isOcupado()&&!puestoDisponibilidadPorVehiculo(vehiculo);
                    dimension[i][j].setVehiculo(vehiculo);
                    dimension[i][j].setOcupado(true);
                    registrarEntrada(vehiculo, n, LocalDateTime.now());
                    System.out.println("El vehiculo se registro correctamente en el puesto "+n+". ");
                }
                contadorcito+=1;
            }
        } 
    }
    //Metodo para librear un Puesto con un vehiculo en el
    public void liberarPuesto(int n) {
        assert n <= dimension.length-1;
        int contadorcito = 0;
        for (int i = 0; i < getFilas(); i++) {
            for (int j = 0; j < getColumnas(); j++) {
                if (n == contadorcito && dimension[i][j].isOcupado()) {
                    Vehiculo vehiculo = dimension[i][j].getVehiculo();
                    dimension[i][j].setVehiculo(new Vehiculo("plantilla", "plantilla", new Propietario("plantilla", "plantilla")));
                    dimension[i][j].setOcupado(false);
                    registrarSalida(vehiculo, n, LocalDateTime.now());
                }
                contadorcito++;
            }
        }
    }
    //Metodo para obtener el propietario de un vehiculo en un puesto dado
    public Propietario obtenerPropietarioPorPuesto(int n) {
        assert (n<=dimension.length-1);
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
    public void registrarEntrada(Vehiculo vehiculo, int posicion, LocalDateTime horaEntrada) {
        RegistroEntrada registro = new RegistroEntrada(vehiculo, posicion, horaEntrada, null);
        registros.add(registro);
    }
    //Metodo para registrar la salida de un vehiculo
    private void registrarSalida(Vehiculo vehiculo, int posicion, LocalDateTime horaSalida) {
        for (RegistroEntrada registro : registros) {
            if (registro.getVehiculo().equals(vehiculo) && registro.getPosicionN() == posicion && registro.getHoraSalida() == null) {
                registro.setHoraSalida(horaSalida);
                break;
            }
        }
    }
    //Clase interna para tener registro de lo que sucede en el parqueadero
    public static class RegistroEntrada {
        private Vehiculo vehiculo;
        private int posicionN;
        private LocalDateTime horaEntrada;
        private LocalDateTime horaSalida;


        public RegistroEntrada(Vehiculo vehiculo, int posicionN, LocalDateTime horaEntrada, LocalDateTime horaSalida) {
            this.vehiculo = vehiculo;
            this.posicionN = posicionN;
            this.horaEntrada = horaEntrada;
            this.horaSalida = horaSalida;
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
        public void registroToString() {
            System.out.println("El vehiculo: "+vehiculo.toString()+" entro a la hora: "+horaEntrada+" se estaciono en el puesto: "+posicionN+" y su hora de salida fue: "+horaSalida);
        }
        
    }    
}

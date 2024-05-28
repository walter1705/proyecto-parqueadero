package co.edu.uniquindio.poo;

import java.util.Scanner;

public class Administracion {
    private static Scanner scanner = new Scanner(System.in);
    static Parqueadero parqueadero = new Parqueadero(0, 0);
    public static void main(String[] args) {
        
        int opcion = 0;
        while(opcion!=4) {
            System.out.println("Admin, antes de continuar debes de configurar los valores de tu parqueadero, utilizando CADA UNA de las siguientes opciones.");
            System.out.println("1. Establecer dimensiones del parqueadero.");
            System.out.println("2. Establecer las tarifas del parqueadero.");
            System.out.println("3. CONTINUAR");
            System.out.println("4. SALIR.");
            opcion = scanner.nextInt();

            switch (opcion) {
                case 1:
                    parqueadero.setDimensionManual();
                    System.out.println("Valores establecidos, cada numero corresponde a un espacio del parqueadero: ");
                    mostrarParqueadero();
                    break;
                case 2:
                    parqueadero.setTarifaManual();
                    break;
                case 3:
                    int opcion2 = 0;
                    while (opcion2 != 2) {
                        System.out.println();
                        System.out.println("Menu interativo. ");
                        System.out.println("1. Registrar la entrada de un vehiculo.");
                        System.out.println("2. Configurar valores del parqueadero. ");
                        System.out.println("3. Mostrar las dimensiones y numero por puestos del parqueadero.");
                        System.out.println("4. Comprobar si un puesto esta ocupado. ");
                        System.out.println("5. Mostrar el registro del parqueadero. ");
                        System.out.println("6. Encontrar propietario de un vehiculo por puesto. ");
                        System.out.println("7. Registrar la salida de un vehiculo");
                        System.out.println("8. Generar un reporte diario de lo recaudado. ");
                        System.out.println("9. Generar un reporte mensual de lo recaudado. ");
                        System.out.println("10. Salir. ");

                        opcion2 = scanner.nextInt();
                        scanner.nextLine();
                        switch (opcion2) {
                            case 1:
                                parqueadero.registrarVehiculo();
                                break;
                            case 2:
                                System.out.println("Cargando...");
                                System.out.println();
                                break;
                            case 3:
                                System.out.println("Cada numero corresponde a un espacio del parqueadero: ");
                                mostrarParqueadero();
                                break;
                            case 4:
                                System.out.println("Ingrese el puesto que desea verificar. ");
                                int puesto=scanner.nextInt();
                                scanner.nextLine();
                                mostrarDisponibilidadPuesto(puesto);
                                break;
                            case 5:
                                System.out.println("Mostrando registros...");
                                mostrarRegistroParqueadero();
                                break;
                            case 6:
                                parqueadero.encontrarPropietarioPorPuesto();
                                break;
                            case 7:
                                parqueadero.registrarSalidaVehiculo();
                                break;
                            case 8:
                                parqueadero.generarReporteDiario();
                                break;
                            case 9:
                                parqueadero.interativoReporteMensual();
                                break;
                            case 10:
                                opcion=4;
                                opcion2=2;
                                break;
                            default:
                                System.out.println("Opcion no valida. uwu");
                                break;
                        }
                    }
                    break; 
                case 4:
                    System.out.println("Exiting...");
                    break;
                default:
                System.out.println("Opcion no valida. ");
            }
        }
        scanner.close();
    }

    //Metodo para mostrar el parqueadero creado
    static public void mostrarParqueadero() {
        int mostrar = 0;
        for(int i=0;i<parqueadero.getFilas();i++) {
            System.out.print("|");
            for(int j=0;j<parqueadero.getColumnas();j++) {
                System.out.print(mostrar+"|");
                mostrar+=1;
            }
            System.out.println();
        }
    }
    //Metodo para mostrar si un puesto n esta ocupado
    static public void mostrarDisponibilidadPuesto(int n) {
        if (!parqueadero.puestoDisponibilidad(n)) {
            System.out.println("EL PUESTO ESTA DESOCUPADO. ");
        } else if (n>=parqueadero.getDimension().length) {
            System.out.println("PUESTO INEXISTENTE");
        }
            else {
            System.out.println("EL PUESTO ESTA OCUPADO. ");
        }
    }
    //Metodo para mostrar el registro del parqueadero 
    static public void mostrarRegistroParqueadero() {
        for (Registro registro : parqueadero.getRegistros()) {
            System.out.println(registro.registroToString());;
            System.out.println();
        }
    }
}


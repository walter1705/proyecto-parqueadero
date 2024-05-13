package co.edu.uniquindio.poo;

import java.util.Scanner;

public class Administracion {
    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        Parqueadero parqueadero = new Parqueadero(0, 0);
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
                    break;
                case 2:
                    parqueadero.setTarifaManual();
                    break;
                case 3:
                    int opcion2 = 0;
                    while (opcion2 != 2) {
                        System.out.println();
                        System.out.println("1. Registrar vehiculo.");
                        System.out.println("2. Configurar valores del parqueadero. "); //CAMBIAR
                        System.out.println("3.");
                        opcion2 = scanner.nextInt();

                        switch (opcion2) {
                            case 1:
                                parqueadero.registrarVehiculo();
                                break;
                            case 2:
                                System.out.println("Cargando...");
                                System.out.println();
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
}

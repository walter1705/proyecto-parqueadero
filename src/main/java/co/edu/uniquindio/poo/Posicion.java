package co.edu.uniquindio.poo;

public class Posicion {
    private int[][] MatrizIJ;
    private int filas, columnas;
//Metodo constructor de la clase Posicion
    public Posicion(int filas, int columnas) {
    this.filas = filas;
    this.columnas = columnas;
    MatrizIJ = new int[filas][columnas];
    }
   //Metodo get y set de la matriz(i , j) de la clase Posicion
    public int[][] getMatrizIJ() {
    return MatrizIJ;
    }
    public void setMatrizIJ(int[][] matrizIJ) {
    MatrizIJ = matrizIJ;
    }
    public int getFilas() {
    return filas;
    }
    public void setFilas(int filas) {
    this.filas = filas;
    }
    public int getColumnas() {
    return columnas;
    }
    public void setColumnas(int columnas) {
    this.columnas = columnas;
    } 
}

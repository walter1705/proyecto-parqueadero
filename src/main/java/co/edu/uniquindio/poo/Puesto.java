package co.edu.uniquindio.poo;

public class Puesto {
    private int i, j;
    public boolean ocupado;
    public Vehiculo vehiculo;
    private Puesto[][] dimension;
    //Metodo constructor de la clase Puesto
    public Puesto(int i, int j, boolean ocupado)  {
        this.i = i;
        this.j = j;
        dimension = new Puesto[i][j];
        this.ocupado = ocupado;
    }
    //Metodo get y set del estado del puesto
    public boolean isOcupado() {
        return ocupado;
    }
    public void setOcupado(boolean ocupado) {
        this.ocupado = ocupado;
    }
    //Obtener y modificar el vehiculo que esta en el puesto
    public Vehiculo getVehiculo() {
        return vehiculo;
    }
    public void setVehiculo(Vehiculo vehiculo) {
        this.vehiculo = vehiculo;
    }
    //Metodo get y set de las FILAS de la dimension de los puestos del parqueadero
    public int getI() {
        return i;
    }
    public void setI(int i) {
        this.i = i;
    }
    //Metodo get y set de las COLUMNAS de la dimension de los puestos del parqueadero
    public int getJ() {
        return j;
    }
    public void setJ(int j) {
        this.j = j;
    }
    //Metodo get y set de la dimension de los puestos del parqueadero
    public Puesto[][] getDimension() {
        return dimension;
    }
    public void setDimension(Puesto[][] dimension) {
        this.dimension = dimension;
    }
    //Metodo para ocupar un Puesto con un vehiculo
    public void ocuparPuesto(Vehiculo vehiculo, int t, int w) {
        assert(dimension[t][w].isOcupado()==false);
        dimension[t][w].setVehiculo(vehiculo);
        dimension[t][w].setOcupado(true);
    }
    //Metodo para obtener el propietario de un vehiculo en un puesto dado
    public Propietario obtenerPropietarioPorPuesto(int t, int w) {
        Propietario propietario=dimension[t][w].getVehiculo().getPropietario();
        return propietario;
    }
}

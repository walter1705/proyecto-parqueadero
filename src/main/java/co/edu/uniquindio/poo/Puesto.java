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
    //Metodo para ver si el vehiculo esta registrado una vez (maximo de registro al mismo tiempo: 1)
    public boolean puestoDisponibilidadPorVehiculo(Vehiculo vehiculo) {
        boolean disponibilidad=false;
        for(int x=0;x<getI();i++){
            for(int y=0;y<getJ();j++) {
                if (dimension[x][y].getVehiculo()==vehiculo) {
                    disponibilidad=true;
                }
            }
        }
        return disponibilidad;
    }
    //Metodo para ver si un puesto esta ocupada o no(boolean) por indice : (True=ocupado)
    public boolean puestoDisponibilidad(int t, int w) {
        assert(t<=getI()&&w<=getJ());
        return dimension[t][w].isOcupado();
    }
    //Metodo para ocupar un Puesto con un vehiculo
    public void ocuparPuesto(Vehiculo vehiculo, int t, int w) {
        assert(t<=getI()&&w<=getJ());
        assert(dimension[t][w].isOcupado()==false)&&(puestoDisponibilidadPorVehiculo(vehiculo)==false);
        dimension[t][w].setVehiculo(vehiculo);
        dimension[t][w].setOcupado(true);
    }
    //Metodo para obtener el propietario de un vehiculo en un puesto dado
    public Propietario obtenerPropietarioPorPuesto(int t, int w) {
        Propietario propietario=dimension[t][w].getVehiculo().getPropietario();
        return propietario;
    }
}

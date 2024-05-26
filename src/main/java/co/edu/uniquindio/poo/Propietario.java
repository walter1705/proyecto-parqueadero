package co.edu.uniquindio.poo;

public class Propietario {
    private String nombreCompleto, id;   
    // Metodo constructor de la clase 
    public Propietario(String nombreCompleto, String id) {
        assert nombreCompleto!=null&&!nombreCompleto.isBlank();
        this.nombreCompleto = nombreCompleto;
        this.id = id;
    }
    //Metodo get y set del atributo nombreCompleto de la clase Propietario
    public String getNombreCompleto() {
        return nombreCompleto;
    }
    public void setNombreCompleto(String nombreCompleto) {
        this.nombreCompleto = nombreCompleto;
    }
    //Metodo get y set del atributo Id de la calse Propietario
    public String getId() {
        return id;
    }
    public void setId(String id) {
        this.id = id;   
    }
    //Metodo para imprimir en consola un propietario
    @Override
    public String toString() {
        return "[El nombre del propietario del vehiculo es: " + nombreCompleto + ", con documento de identificacion: " + id + "]";
    }
}
package co.edu.uniquindio.poo;

public class Vehiculo {
    public String placa, modelo;
    public Propietario propietario;
    /*
     * metodo constructor de la clase Vehiculo
     */
    public Vehiculo(String placa, String modelo, Propietario propietario) {
        assert placa != null && !placa.isBlank();
        assert modelo != null && !modelo.isBlank();
        assert propietario != null;
        this.placa = placa;
        this.modelo = modelo;
        this.propietario = propietario;
    }

    // metodo get y set del atributo placa de la clase Moto

    public String getPlaca() {
        return placa;
    }
    public void setPlaca(String placa) {
        this.placa = placa;
    }

    // metodo get y set del atributo modelo de la clase Moto

    public String getModelo() {
        return modelo;
    }
    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    // metodo get y set del atributo propietario de la clase Moto

    public Propietario getPropietario() {
        return propietario;
    }
    public void setPropietario(Propietario propietario) {
        this.propietario = propietario;
    }

}

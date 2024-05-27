package co.edu.uniquindio.poo;

public class Reporte {
    public float totalRecaudado, recaudadoMotosClasicas, recaudadoMotosHibridas, recaudadoCarros;
    //Metodo constructos de la clase reporte
    public Reporte(float totalRecaudado, float recaudadoMotosClasicas, float recaudadoMotosHibridas,
            float recaudadoCarros) {
        this.totalRecaudado = totalRecaudado;
        this.recaudadoMotosClasicas = recaudadoMotosClasicas;
        this.recaudadoMotosHibridas = recaudadoMotosHibridas;
        this.recaudadoCarros = recaudadoCarros;
    }
    public float getTotalRecaudado() {
        return totalRecaudado;
    }
    public void setTotalRecaudado(float totalRecaudado) {
        this.totalRecaudado = totalRecaudado;
    }
    public float getRecaudadoMotosClasicas() {
        return recaudadoMotosClasicas;
    }
    public void setRecaudadoMotosClasicas(float recaudadoMotosClasicas) {
        this.recaudadoMotosClasicas = recaudadoMotosClasicas;
    }
    public float getRecaudadoMotosHibridas() {
        return recaudadoMotosHibridas;
    }
    public void setRecaudadoMotosHibridas(float recaudadoMotosHibridas) {
        this.recaudadoMotosHibridas = recaudadoMotosHibridas;
    }
    public float getRecaudadoCarros() {
        return recaudadoCarros;
    }
    public void setRecaudadoCarros(float recaudadoCarros) {
        this.recaudadoCarros = recaudadoCarros;
    }
    public String toString() {
        return "[El total recaudado total de carros fue: "+recaudadoCarros+". El total recaudado total de motos clasicas fue: "+recaudadoMotosClasicas+". El total recaudado de motos hibridas fue: "+recaudadoMotosHibridas+". El total recaudado total fue de : "+totalRecaudado;
    }
}

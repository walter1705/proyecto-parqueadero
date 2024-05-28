package co.edu.uniquindio.poo;

public class Reporte {
    public float totalRecaudado, recaudadoMotosClasicas, recaudadoMotosHibridas, recaudadoCarros;
    //Metodo constructos de la clase reporte
    public Reporte(float totalRecaudado, float recaudadoMotosClasicas, float recaudadoMotosHibridas,
            float recaudadoCarros) {
        assert totalRecaudado >= 0;
        assert recaudadoCarros >= 0;
        assert recaudadoMotosClasicas >= 0;
        assert recaudadoMotosHibridas >= 0;
        this.totalRecaudado = totalRecaudado;
        this.recaudadoMotosClasicas = recaudadoMotosClasicas;
        this.recaudadoMotosHibridas = recaudadoMotosHibridas;
        this.recaudadoCarros = recaudadoCarros;
    }
    //Metodo get y set del totalRecaudado
    public float getTotalRecaudado() {
        return totalRecaudado;
    }
    public void setTotalRecaudado(float totalRecaudado) {
        this.totalRecaudado = totalRecaudado;
    }
    //Metodo get y set de lo recaudado por motos clasicas
    public float getRecaudadoMotosClasicas() {
        return recaudadoMotosClasicas;
    }
    public void setRecaudadoMotosClasicas(float recaudadoMotosClasicas) {
        this.recaudadoMotosClasicas = recaudadoMotosClasicas;
    }
    //Metodo get y set de lo recaudado por motos hibridad
    public float getRecaudadoMotosHibridas() {
        return recaudadoMotosHibridas;
    }
    public void setRecaudadoMotosHibridas(float recaudadoMotosHibridas) {
        this.recaudadoMotosHibridas = recaudadoMotosHibridas;
    }
    //Metodo get y set de lo recaudado por carross
    public float getRecaudadoCarros() {
        return recaudadoCarros;
    }
    public void setRecaudadoCarros(float recaudadoCarros) {
        this.recaudadoCarros = recaudadoCarros;
    }
    //Metodo toString para de la clase
    public String toString() {
        return "[El total recaudado total de carros fue: "+recaudadoCarros+". El total recaudado total de motos clasicas fue: "+recaudadoMotosClasicas+". El total recaudado de motos hibridas fue: "+recaudadoMotosHibridas+". El total recaudado total fue de : "+totalRecaudado;
    }
}

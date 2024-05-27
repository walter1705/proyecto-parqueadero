package co.edu.uniquindio.poo;


import java.util.Collection;
import java.util.LinkedList;

public class ReporteMensual extends Reporte{
    private Collection<ReporteDiario> reporteDiarios;
    //Metodo constructor de la clase ReporteMensual
    public ReporteMensual (float totalRecaudado, float recaudadoMotosClasicas, float recaudadoMotosHibridas,
    float recaudadoCarros) {
        super(totalRecaudado, recaudadoMotosClasicas, recaudadoMotosHibridas, recaudadoCarros);
        reporteDiarios = new LinkedList<>();
    }
    //Metodos get y set de la colecion de reporte diario que construye el reporte mensual
    public Collection<ReporteDiario> getReporteDiarios() {
        return reporteDiarios;
    }
    public void setReporteDiarios(Collection<ReporteDiario> reporteDiarios) {
        this.reporteDiarios = reporteDiarios;
    }
}

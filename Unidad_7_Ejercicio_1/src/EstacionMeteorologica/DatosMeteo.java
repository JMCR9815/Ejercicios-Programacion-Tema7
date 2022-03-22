package EstacionMeteorologica;

import java.text.DecimalFormat;
import java.time.LocalDate;

public class DatosMeteo {
    private static final DecimalFormat df = new DecimalFormat("0.00");
    private LocalDate fecha;
    private double temperaturaMax;
    private double temperaturaMin;
    private double humedadMax;
    private double humedadMin;
    private double precipitaciones;

    public DatosMeteo(LocalDate fecha, double temperaturaMax, double temperaturaMin, double precipitaciones, double humedadMax, double humedadMin) {
        this.fecha = fecha;
        this.temperaturaMax = temperaturaMax;
        this.temperaturaMin = temperaturaMin;
        this.precipitaciones = precipitaciones;
        this.humedadMin = humedadMin;
        this.humedadMax = humedadMax;
    }

    public DatosMeteo(double temperaturaMax, double temperaturaMin, double precipitaciones, double humedadMax, double humedadMin) {
        this.fecha = LocalDate.now();
        this.temperaturaMax = temperaturaMax;
        this.temperaturaMin = temperaturaMin;
        this.precipitaciones = precipitaciones;
        this.humedadMin = humedadMin;
        this.humedadMax = humedadMax;
    }

    public LocalDate getFecha() {
        return fecha;
    }

    public void setFecha(LocalDate fecha) {
        this.fecha = fecha;
    }

    public double getTemperaturaMax() {
        return temperaturaMax;
    }

    public void setTemperaturaMax(double temperaturaMax) {
        this.temperaturaMax = temperaturaMax;
    }

    public double getTemperaturaMin() {
        return temperaturaMin;
    }

    public void setTemperaturaMin(double temperaturaMin) {
        this.temperaturaMin = temperaturaMin;
    }

    public double getHumedadMax() {
        return humedadMax;
    }

    public void setHumedadMax(double humedadMax) {
        this.humedadMax = humedadMax;
    }

    public double getHumedadMin() {
        return humedadMin;
    }

    public void setHumedadMin(double humedadMin) {
        this.humedadMin = humedadMin;
    }

    public double getPrecipitaciones() {
        return precipitaciones;
    }

    public void setPrecipitaciones(double precipitaciones) {
        this.precipitaciones = precipitaciones;
    }

    @Override
    public String toString() {
        return "DatosMeteo{" + "fecha=" + fecha + ", temperaturaMax=" + temperaturaMax + ", temperaturaMin=" + temperaturaMin + ", humedadMax=" + humedadMax + ", humedadMin=" + humedadMin + ", precipitaciones=" + precipitaciones + '}';
    }

    public String toString2() {
        return "DatosMeteo{" + "fecha=" + LocalDate.now() + "," + "temperaturaMax=" + df.format(temperaturaMax) + ", temperaturaMin=" + df.format(temperaturaMin) + ", humedadMax=" + df.format(humedadMax) + ", humedadMin=" + df.format(humedadMin) + ", precipitaciones=" + df.format(precipitaciones) + '}';
    }
}

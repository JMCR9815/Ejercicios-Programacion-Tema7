package Productos;

import java.time.LocalDate;

public class Congelados extends Productos {
    private double temperaturaRecomendadaCong;

    public Congelados(String id_Producto, String descripcion, LocalDate fecha_Caaducidad, int numLote, double temperaturaRecomendadaCong) {
        super(id_Producto, descripcion, fecha_Caaducidad, numLote);
        this.temperaturaRecomendadaCong = temperaturaRecomendadaCong;
    }

    public double getTemperaturaRecomendadaCong() {
        return temperaturaRecomendadaCong;
    }

    public void setTemperaturaRecomendadaCong(double temperaturaRecomendadaCong) {
        this.temperaturaRecomendadaCong = temperaturaRecomendadaCong;
    }

    @Override
    public String toString() {
        return "Producto: Congelado => " + super.toString() + "Temperatura recomendada de congelacion: " + temperaturaRecomendadaCong + " .";
    }
}

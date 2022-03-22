package Productos;

import java.time.LocalDate;

public abstract class Productos {
    private String id_Producto;
    private String descripcion;
    private LocalDate fecha_Caaducidad;
    private int numLote;

    public Productos(String id_Producto, String descripcion, LocalDate fecha_Caaducidad, int numLote) {
        this.id_Producto = id_Producto;
        this.descripcion = descripcion;
        this.fecha_Caaducidad = fecha_Caaducidad;
        this.numLote = numLote;
    }

    public String getId_Producto() {
        return id_Producto;
    }

    public void setId_Producto(String id_Producto) {
        this.id_Producto = id_Producto;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public LocalDate getFecha_Caaducidad() {
        return fecha_Caaducidad;
    }

    public void setFecha_Caaducidad(LocalDate fecha_Caaducidad) {
        this.fecha_Caaducidad = fecha_Caaducidad;
    }

    public int getNumLote() {
        return numLote;
    }

    public void setNumLote(int numLote) {
        this.numLote = numLote;
    }

    @Override
    public String toString() {
        return "ID del producto: " + id_Producto + ", Descripcion: '" + descripcion + '\'' + ", Fecha de caducidad: " + fecha_Caaducidad + ", Numero de lote: " + numLote + ", ";
    }
}

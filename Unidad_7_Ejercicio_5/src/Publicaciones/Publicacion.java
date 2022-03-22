package Publicaciones;

public class Publicacion {
    private String titulo;
    private String tipo;
    private String periodicidad;
    private String editorial;
    private int numeroEjemplares;

    public Publicacion(String titulo, String tipo, String periodicidad, String editorial, int numeroEjemplares) {
        this.titulo = titulo;
        this.tipo = tipo;
        this.periodicidad = periodicidad;
        this.editorial = editorial;
        this.numeroEjemplares = numeroEjemplares;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public String getPeriodicidad() {
        return periodicidad;
    }

    public void setPeriodicidad(String periodicidad) {
        this.periodicidad = periodicidad;
    }

    public String getEditorial() {
        return editorial;
    }

    public void setEditorial(String editorial) {
        this.editorial = editorial;
    }

    public int getNumeroEjemplares() {
        return numeroEjemplares;
    }

    public void setNumeroEjemplares(int numeroEjemplares) {
        this.numeroEjemplares = numeroEjemplares;
    }

    @Override
    public String toString() {
        return "Publicacion{" + "titulo='" + titulo + '\'' + ", tipo=" + tipo + ", periodicidad='" + periodicidad + '\'' + ", editorial='" + editorial + '\'' + ", numeroEjemplares=" + numeroEjemplares + '}';
    }
}

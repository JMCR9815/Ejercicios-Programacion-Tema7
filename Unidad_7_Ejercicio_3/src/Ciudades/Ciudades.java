package Ciudades;

public class Ciudades {
    private String nombre;
    private String pais;
    private String habitantes;

    public Ciudades(String nombre, String pais, String habitantes) {
        this.nombre = nombre;
        this.pais = pais;
        this.habitantes = habitantes;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getPais() {
        return pais;
    }

    public void setPais(String pais) {
        this.pais = pais;
    }

    public String getHabitantes() {
        return habitantes;
    }

    public void setHabitantes(String habitantes) {
        this.habitantes = habitantes;
    }

    @Override
    public String toString() {
        return "Ciudades{" + "nombre='" + nombre + '\'' + ", pais='" + pais + '\'' + ", habitantes=" + habitantes + '}';
    }
}


package GestionPublicacion;

import Publicaciones.Publicacion;

import java.util.ArrayList;
import java.util.Random;

public class Gestion {
    String[] tipo = {"Deportes", "Naturaleza", "Ajedrez", "Motor", "Caza", "Vuelo"};
    String[] periodicidad = {"Semanal", "Quincenal", "Mensual"};
    String[] editorial = {"Anaya", "SM", "ZRZ", "CAZA", "EDEBE", "SANTILLANA", "CALABAZA"};
    Random rnd = new Random();
    ArrayList<Publicacion> publicaciones = new ArrayList<>();

    public void llenarArray(int limiteEjecucion) {
        for (int i = 0; i <= limiteEjecucion; i++) {
            publicaciones.add(new Publicacion("tit" + rnd.nextInt(500), tipo[rnd.nextInt(5)], periodicidad[rnd.nextInt(2)], editorial[rnd.nextInt(6)], rnd.nextInt(500)));
        }
    }

    public void mostrarArray() {
        for (int i = 0; i < publicaciones.size(); i++) {
            System.out.println(publicaciones.get(i).toString());
        }
    }

    public void addPublicscion(Publicacion publicacion) {
        publicaciones.add(publicacion);
    }

    public void deletePublicacion(String titulo) {
        for (int i = 0; i < publicaciones.size(); i++) {
            if (publicaciones.get(i).getTitulo().equals(titulo)) {
                publicaciones.remove(i);
            }
        }
    }
    public void deleteVariosPublicaciones(String[]titulos){

    }
}

package GestionPublicacion;

import Menu.Menu_Opciones;
import Publicaciones.Publicacion;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Random;

public class Gestion {
    String[] tipo = {"Deportes", "Naturaleza", "Ajedrez", "Motor", "Caza", "Vuelo"};
    String[] periodicidad = {"Semanal", "Quincenal", "Mensual"};
    String[] editorial = {"Anaya", "SM", "ZRZ", "CAZA", "EDEBE", "SANTILLANA", "CALABAZA"};
    String[] opciones = {"1. Nueva publicación", "2. Eliminar publicación", "3. Listar", "4. Eliminar varias", "5. Fin", "Elige opción: "};
    Random rnd = new Random();
    Menu_Opciones menu = new Menu_Opciones(opciones);
    ArrayList<Publicacion> publicaciones = new ArrayList<>();

    public void llenarArray(int limiteEjecucion) {
        for (int i = 0; i <= limiteEjecucion; i++) {
            publicaciones.add(new Publicacion("Titulo " + rnd.nextInt(500), tipo[rnd.nextInt(tipo.length)], periodicidad[rnd.nextInt(periodicidad.length)], editorial[rnd.nextInt(editorial.length)], rnd.nextInt(500)));
        }
    }

    public void mostrarArray() {
        for (Publicacion publicacione : publicaciones) {
            System.out.println(publicacione.toString());
        }
    }

    public void addPublicacion(Publicacion publicacion) {
        publicaciones.add(publicacion);

    }

    public boolean isExist(String titulo) {
        boolean bandera = false;
        for (Publicacion publicacione : publicaciones) {
            if (publicacione.getTitulo().contains(titulo)) {
                bandera = true;
                break;
            }
        }
        return bandera;
    }

    public void deletePublicacion(String titulo) {
        publicaciones.removeIf(publicacion -> publicacion.getTitulo().contains(titulo));
    }

    public void deleteVariosPublicaciones(int numeroElementos) {
        Iterator<Publicacion> iterator = publicaciones.iterator();
        int contador = 0;
        while (iterator.hasNext()) {
            iterator.next();
            if (contador < numeroElementos) {
                iterator.remove();
                contador++;
            }

        }
    }
}

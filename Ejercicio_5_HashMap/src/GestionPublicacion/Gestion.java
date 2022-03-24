package GestionPublicacion;

import Menu.Menu_Opciones;
import Publicaciones.Publicacion;

import java.util.HashMap;
import java.util.Random;

public class Gestion {
    String[] tipo = {"Deportes", "Naturaleza", "Ajedrez", "Motor", "Caza", "Vuelo"};
    String[] periodicidad = {"Semanal", "Quincenal", "Mensual"};
    String[] editorial = {"Anaya", "SM", "ZRZ", "CAZA", "EDEBE", "SANTILLANA", "CALABAZA"};
    String[] opciones = {"1. Nueva publicación", "2. Eliminar publicación", "3. Listar", "4. Eliminar varias", "5. Fin", "Elige opción: "};
    Random rnd = new Random();
    Menu_Opciones menu = new Menu_Opciones(opciones);

    HashMap<Integer, Publicacion> publicacionesHashMap = new HashMap<>();

    public void llenarHashMap(int limiteEjecucion) {
        for (int i = 0; i <= limiteEjecucion; i++) {
            publicacionesHashMap.put(i, new Publicacion("Titulo " + rnd.nextInt(500), tipo[rnd.nextInt(tipo.length)], periodicidad[rnd.nextInt(periodicidad.length)], editorial[rnd.nextInt(editorial.length)], rnd.nextInt(500)));
        }
    }

    public void mostrarHashMap() {
        for (Integer indicePublicacion : publicacionesHashMap.keySet()) {
            Publicacion publicacion = publicacionesHashMap.get(indicePublicacion);
            System.out.println(publicacion.toString());
        }
    }

    public void addPublicacion(Publicacion publicacion) {
        publicacionesHashMap.put(publicacionesHashMap.size(), publicacion);
    }

    public boolean isExist(String titulo) {
        boolean bandera = false;
        for (Integer indicePublicacion : publicacionesHashMap.keySet()) {
            if (publicacionesHashMap.get(indicePublicacion).getTitulo().contains(titulo)) {
                bandera = true;
                break;
            }
        }
        return bandera;
    }

    public void deletePublicacion(String titulo) {
        for (Integer indeicePublicacion : publicacionesHashMap.keySet()) {
            if (publicacionesHashMap.get(indeicePublicacion).getTitulo().contains(titulo)) {
                publicacionesHashMap.remove(indeicePublicacion);
            }
        }
    }

    public void deleteVariasPublicaciones(int numeroElementos) {
        for (int i = 0; i <= numeroElementos; i++) {
            publicacionesHashMap.remove(i);
        }

    }
}

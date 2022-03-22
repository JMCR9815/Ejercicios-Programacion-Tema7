package GestionCiudades;

import Ciudades.Ciudades;
import java.util.ArrayList;
import java.util.Comparator;

public class gestionCiudades {
    ArrayList<Ciudades> listaCiudades = new ArrayList<>();
    String[] ciudades = {"Moscu", "Toronto", "Washington D.C", "Pekin", "Sao Paulo", "Mumbai", "Buenos Aires", "Astana", "Argel", "Sidney"};
    String[] paises = {"Rusia", "Canada", "EEUU", "China", "Brasil", "India", "Argentina", "Kazajistan", "Argelia", "Australia"};
    String[] habitantes = {"144,1 M", "38,01 M", "329,5 M", "1,402 milM", "216,6 M", "1,38 milM", "45,38 M", "18,75 M", "43,85 M", "25,70 M"};

    public void llenarArray(int limite) {
        for (int i = 0; i < limite - 1; i++) {
            listaCiudades.add(new Ciudades(ciudades[i], paises[i], habitantes[i]));
        }
    }

    public void mostrarLista() {
        for (Ciudades ciudad : listaCiudades) {
            System.out.println(ciudad.toString());
        }
    }

    public void habitantesPais() {
        for (Ciudades ciudad : listaCiudades) {
            System.out.println("Pais: " + ciudad.getPais() + " => " + ciudad.getHabitantes());
        }
    }

    public void mostraPaises() {
        for (Ciudades ciudad : listaCiudades) {
            System.out.println("Pais => " + ciudad.getPais());
        }
    }

    public ArrayList<Ciudades> ordenarLista(String metodoOrdenado) {
        if (metodoOrdenado.equalsIgnoreCase("Ascendente")) {
            listaCiudades.sort(Comparator.comparing((Ciudades o) -> o.getNombre()));
            return listaCiudades;
        }

        if (metodoOrdenado.equalsIgnoreCase("Descendente")) {
            listaCiudades.sort((o1, o2) -> o2.getNombre().compareTo(o1.getNombre()));
            return listaCiudades;
        }
        return null;
    }
}

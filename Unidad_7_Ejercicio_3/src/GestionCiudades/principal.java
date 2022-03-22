package GestionCiudades;

import Ciudades.Ciudades;

import java.util.ArrayList;

public class principal {
    public static void main(String[] args) {
        gestionCiudades gestion = new gestionCiudades();
        gestion.llenarArray(10);
        gestion.mostrarLista();
        System.out.println();

        /*Mostrar el numero de habnitantes de cada pais*/
        System.out.println("Mostrando el numero de habitantes de cada pais...");
        gestion.habitantesPais();
        System.out.println();

        /*Mostrar paises*/
        System.out.println("Mostrando paises de la lista...");
        gestion.mostraPaises();
        System.out.println();

        /*Mostrar lista ordenada por nombre de ciudad*/
        System.out.println("Mostrando lista ordenada...");
        ArrayList<Ciudades> listaOrdenada = gestion.ordenarLista("ascendente");
        for (Ciudades ciudad : listaOrdenada) {
            System.out.println(ciudad.toString());
        }
    }
}

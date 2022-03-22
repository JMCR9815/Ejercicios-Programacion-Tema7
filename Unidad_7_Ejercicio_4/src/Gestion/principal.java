package Gestion;

import Persona.Persona;

public class principal {
    public static void main(String[] args) {
        Gestion gestion = new Gestion();
        /*LLenar el Hash-Map*/
        gestion.llenarHashMap();
        /*Mostar el Hash-Map*/
        gestion.mostarHashMap();
        /*Anhadir nueva persona al Hash-Map*/
        Persona persona = new Persona("000000 B", "Alberto");
        gestion.addNewData(004, persona);
        /*Buscar Datos por ID*/
        System.out.println();
        Persona persona1 = gestion.buscarElemento(004);
        System.out.println(persona1.toString());

    }


}

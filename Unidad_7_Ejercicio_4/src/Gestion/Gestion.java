package Gestion;

import Persona.Persona;

import java.util.HashMap;

public class Gestion {
    HashMap<Integer, Persona> hashPersonas = new HashMap<>();

    public void llenarHashMap() {
        for (int i = 0; i < 5; i++) {
            hashPersonas.put(001 + i, new Persona("0000000A", "Juan"));
        }
    }

    public void mostarHashMap() {
        for (Integer clave : hashPersonas.keySet()) {
            System.out.println(hashPersonas.get(clave));
        }
    }

    public void addNewData(Integer id, Persona personaNew) {
        hashPersonas.put(id, personaNew);
    }
    public Persona buscarElemento(Integer idBusqueda){
        for (int i = 0; i < hashPersonas.size(); i++) {
            if (hashPersonas.containsKey(idBusqueda)){
                return hashPersonas.get(idBusqueda);
            }
        }
        return null;
    }
}

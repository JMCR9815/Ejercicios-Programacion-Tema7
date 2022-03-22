package Interfaz;

import Productos.Productos;

import java.util.ArrayList;

public interface ProductosIF {
    static ArrayList<Productos> getListaProductos() {
        return null;
    }

    static boolean modificarTemperaturaCongelacion(String id, double temperatura) {
        return false;
    }

    static ArrayList<Productos> productosFrescosPorPais(String pais) {
        return null;
    }

    static ArrayList<Productos> getProductosCaducados() {
        return null;
    }

    static ArrayList<Productos> getProductTipe(String tipo) {
        return null;
    }

    static void crearProductos(int numeroProductos) {
    }
}

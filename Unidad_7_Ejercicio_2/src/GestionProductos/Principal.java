package GestionProductos;

import Productos.Productos;

import java.io.IOException;
import java.util.ArrayList;

public class Principal {
    public static void main(String[] args) throws IOException {
        Gestion gestion = new Gestion();
        gestion.crearProductos(6);

        /*Mostrar los productos:*/
        ArrayList<Productos> getListaProductos = gestion.getListaProductos();
        for (Productos getProductos : getListaProductos) {
            System.out.println(getProductos.toString());
        }

        /*Eliminar Productos por el ID: */
        System.out.println();
        boolean bandera = gestion.eliminarProductoPorId("000002");
        if (bandera) {
            System.out.println("El producto se ha eliminado correctamente");
        } else {
            System.out.println("No se ha podido eliminar el producto");
        }

        /*Mostrar los productos:*/
        for (Productos getProductos : getListaProductos) {
            System.out.println(getProductos.toString());
        }
        System.out.println();

        /*Mostar los productos por tipo*/
        ArrayList<Productos> getListaProductosPerType = gestion.getProductsType("refrigerados");
        System.out.println("Mostrando productos que coincidan con el tipo introducido...");

        for (Productos getProductsPerType : getListaProductosPerType) {
            System.out.println(getProductsPerType.toString());
        }
        System.out.println();

        /*Eliminar los productos congelados*/
        System.out.println("Eliminando Productos congelados...");
        int elementosEliminados = gestion.eliminarCongelados();
        System.out.println("Se han eliminado: " + elementosEliminados + " productos.");
        System.out.println();

        /*Mostrar productos restantes*/
        System.out.println("Mostrando productos restantes...");
        for (Productos getProductos : getListaProductos) {
            System.out.println(getProductos.toString());
        }
    }
}




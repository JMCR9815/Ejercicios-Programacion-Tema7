package Interfaz;

import Productos.Productos;

import java.util.ArrayList;

public interface ProductosIF {

    ArrayList<Productos> getListaProductos();

    boolean modificarTemperaturaCongelacion(String id, double temperatura);

    ArrayList<Productos> productosFrescosPorPais(String pais);

    ArrayList<Productos> getProductosCaducados();

    ArrayList<Productos> getProductTipe(String tipo);

    void crearProductos(int numeroProductos);

}

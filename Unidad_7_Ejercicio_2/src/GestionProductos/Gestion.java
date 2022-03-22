package GestionProductos;


import Productos.Congelados;
import Productos.Frescos;
import Productos.Productos;
import Productos.Refrigerados;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Objects;

public class Gestion {

    ArrayList<Productos> listaProductos = new ArrayList<>();

    String[] paises = {"España", "Italia", "Marruecos", "Argelia", "Francia"};

    public void crearProductos(int numeroProductos) {

        System.out.println("Creando lista de productos....");

        for (int i = 0; i < numeroProductos; i++) {
            if (i <= 1) {
                listaProductos.add(new Frescos("00000" + (i + 1), "Producto-" + (i + 1), LocalDate.now(), 123422 * (i + 1), LocalDate.now().minusDays(5), paises[(int) (Math.random() * 5)]));
            }
            if (i > 1 && i < 4) {
                listaProductos.add(new Refrigerados("00000" + (i + 1), "Producto-" + (i + 1), LocalDate.now().minusDays(5), 123422 * i, "ABC-" + i));
            }
            if (i >= 4) {
                listaProductos.add(new Congelados("00000" + (i + 1), "Producto-" + (i + 1), LocalDate.now(), 123422 * i, -5.0 * i));
            }
        }

    }

    public ArrayList<Productos> getListaProductos() {

        return listaProductos;
    }


    public boolean eliminarProductoPorId(String id) {
        boolean bandera = false;
        for (int i = 0; i < listaProductos.size(); i++) {
            if (listaProductos.get(i).getId_Producto().equals(id)) {
                listaProductos.remove(listaProductos.get(i));
                bandera = true;
            }
        }
        return bandera;
    }

    public ArrayList<Productos> getProductsType(String type) {
        ArrayList<Productos> productsPerType = new ArrayList<>(listaProductos.size());
        int iterador = 0;
        for (Productos listaProducto : listaProductos) {
            if (listaProducto.getClass().getName().toLowerCase().endsWith(type)) {
                productsPerType.add(listaProducto);
            }
        }
        return productsPerType;
    }

    public int eliminarCongelados() {
        int contadorProductosEliminados = 0;
        Iterator<Productos> iterator = listaProductos.iterator();
        while (iterator.hasNext()) {
            if (iterator.next().getClass().getName().endsWith("Congelados")) {
                contadorProductosEliminados++;
                iterator.remove();
            }
        }
        return contadorProductosEliminados;
    }


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Gestion gestion)) return false;
        return listaProductos.equals(gestion.listaProductos);
    }

    @Override
    public int hashCode() {
        return Objects.hash(listaProductos);
    }
}





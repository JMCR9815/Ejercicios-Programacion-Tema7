package GestionProductos;

import Interfaz.ProductosIF;
import Menu.Menu;
import Productos.Congelados;
import Productos.Frescos;
import Productos.Productos;
import Productos.Refrigerados;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Objects;

public class Gestion implements ProductosIF {

    ArrayList<Productos> listaPreoductos = new ArrayList<>();
    String[] opcionesMenu = {"1. Mostar lista de productos).", "2. Modificar temperatura de congelacion (indicar id del producto y el nuevo valor de temperatura)", "3. Mostrar productos de un pais (indicar el pais)", "4. Mostar productos caducados ", "5. Mostar productos por tipo de producto (indica el parametro de busqueda)", "6. Salir"};
    String[] paises = {"España", "Italia", "Marruecos", "Argelia", "Francia"};
    Menu menu = new Menu(opcionesMenu);


    public void crearProductos(int numeroProductos) {

        System.out.println("Creando lista de productos....");

        for (int i = 0; i < numeroProductos; i++) {
            if (i <= 1) {
                listaPreoductos.add(new Frescos("00000" + (i + 1), "Producto-" + (i + 1), LocalDate.now(), 123422 * (i + 1), LocalDate.now().minusDays(5), paises[(int) (Math.random() * 5)]));
            }
            if (i > 1 && i < 4) {
                listaPreoductos.add(new Refrigerados("00000" + (i + 1), "Producto-" + (i + 1), LocalDate.now().minusDays(5), 123422 * i, "ABC-" + i));
            }
            if (i >= 4) {
                listaPreoductos.add(new Congelados("00000" + (i + 1), "Producto-" + (i + 1), LocalDate.now(), 123422 * i, -5.0 * i));
            }
        }

    }

    public ArrayList<Productos> getListaProductos() {

        return listaPreoductos;
    }

    public String mostarProductoConID(String id) {
        for (Productos listaPreoducto : listaPreoductos) {
            if (listaPreoducto.getId_Producto().equals(id)) {
                return listaPreoducto.toString();
            }
        }
        return null;
    }

    public boolean modificarTemperaturaCongelacion(String id, double temperatura) {
        boolean bandera = false;
        for (Productos listaPreoducto : listaPreoductos) {
            if (listaPreoducto.getId_Producto().equals(id) && listaPreoducto instanceof Congelados) {
                ((Congelados) listaPreoducto).setTemperaturaRecomendadaCong(temperatura);
                bandera = true;
            }
        }
        return bandera;
    }

    public ArrayList<Productos> productosFrescosPorPais(String pais) {
        ArrayList<Productos> productosFrescos = new ArrayList<>(listaPreoductos.size());
        for (Productos listaPreoducto : listaPreoductos) {
            if ((listaPreoducto instanceof Frescos) && ((Frescos) listaPreoducto).getPaisOrigen().equalsIgnoreCase(pais)) {
                productosFrescos.add(listaPreoducto);
            }
        }
        return productosFrescos;
    }

    public ArrayList<Productos> getProductosCaducados() {
        ArrayList<Productos> productosCaducados = new ArrayList<>(listaPreoductos.size());
        for (Productos listaPreoducto : listaPreoductos) {
            if (listaPreoducto.getFecha_Caaducidad().isBefore(LocalDate.now())) {
                productosCaducados.add(listaPreoducto);
            }
        }
        return productosCaducados;
    }

    public ArrayList<Productos> getProductTipe(String tipo) {
        ArrayList<Productos> productTipe = new ArrayList<>(listaPreoductos.size());

        for (Productos listaPreoducto : listaPreoductos) {
            if (listaPreoducto.getClass().getName().equalsIgnoreCase("productos." + tipo)) {
                productTipe.add(listaPreoducto);
            }
        }
        return productTipe;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Gestion gestion)) return false;
        return listaPreoductos.equals(gestion.listaPreoductos);
    }

    @Override
    public int hashCode() {
        return Objects.hash(listaPreoductos);
    }
}





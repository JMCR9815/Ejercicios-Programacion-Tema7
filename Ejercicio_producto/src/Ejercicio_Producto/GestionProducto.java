package Ejercicio_Producto;

import java.util.Random;

public class GestionProducto {
    Producto[] productos = new Producto[20];

    public void llenarArray() {
        int codProduct = 1000;
        Random rnd = new Random();

        int tipoAux = 0;
        for (int i = 0; i < this.productos.length; i++) {
            if (tipoAux == 4) {
                tipoAux = 0;
            }
            this.productos[i] = new Producto((codProduct++), "Producto" + i, Tipo.values()[tipoAux], rnd.nextInt(150), rnd.nextInt(150), rnd.nextInt(20));
            tipoAux++;
        }

    }

    public void showProducts() {
        for (int i = 0; i < this.productos.length; i++) {
            System.out.println(this.productos[i].toString());
        }
    }

    public void sellPriceFiltered(int price) {
        for (int i = 0; i < productos.length; i++) {
            if (price > productos[i].getSellPrice()) {
                System.out.println(productos[i].toString());
            }
        }
    }

    public void tipeFiltered(String tipeSearch) {
        for (Producto producto : productos)
            if (String.valueOf(producto.getTipo()).equalsIgnoreCase(tipeSearch)) {
                System.out.println(producto);
            }
    }

    public void showDifference() {
        for (int i = 0; i < productos.length; i++) {
            int differnceCalculated = productos[i].getBuyPrice() - productos[i].getSellPrice();
            System.out.println("Nombre: " + productos[i].getNameProduct() + "; Precio de compra: " + productos[i].getBuyPrice() + "; Precio de venta: " + productos[i].getSellPrice() + "; Diferencia de precios: " + differnceCalculated);
        }
    }

    public void showPositionProduct(int position) {
        if (position <= productos.length) {
            System.out.println(productos[position].toString());
        } else {
            System.out.println("No hay coincidencias");
        }
    }

    public boolean changeProduct(Producto newProducto, int position) {
        boolean bandera = false;
        if (position <= productos.length) {
            System.out.print("Articulo existente en esa posicion: " + productos[position].toString());
            System.out.println("modificando el articulo....");
            productos[position] = newProducto;
            System.out.print("El nuevo articulo en la posicion introducida es: " + productos[position].toString());
            bandera = true;
        }
        return bandera;
    }
}

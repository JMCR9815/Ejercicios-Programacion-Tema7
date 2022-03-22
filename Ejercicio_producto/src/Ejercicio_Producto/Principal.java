package Ejercicio_Producto;

public class Principal {
    public static void main(String[] args) {

        GestionProducto gestion = new GestionProducto();
        gestion.llenarArray();
        Producto newProducto = new Producto(115, "Producto15", Tipo.herramienta, 120, 115, 8);

//		gestion.showProducts();
//		gestion.sellPriceFiltered(100);
//		gestion.tipeFiltered("herramienta");
//		gestion.showDifference();
//      gestion.showPositionProduct(10);
//      gestion.changeProduct(newProducto, 15);

    }
}

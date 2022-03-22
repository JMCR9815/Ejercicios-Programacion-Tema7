package GestionProductos;

import Productos.Productos;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

public class Principal {
    public static void main(String[] args) throws IOException {
        Gestion gestion = new Gestion();


        String opcion;
        Scanner entrantScanner = new Scanner(System.in);
        int valorInt;
        String valorString;
        double valorDouble;
        System.out.print("Introduce la cantidad de productos que compondran la lista: ");
        valorInt = entrantScanner.nextInt();
        gestion.crearProductos(valorInt);
        System.out.println("Lista de productos creada.");
        do {
            opcion = gestion.menu.mostrarMenu();
            switch (opcion) {
                case "1" -> {
                    System.out.println();
                    System.out.println("Mostrando Productos...");
                    ArrayList<Productos> getListaProductos = gestion.getListaProductos();
                    for (Productos getProductos : getListaProductos) {
                        System.out.println(getProductos.toString());
                    }
                }
                case "2" -> {
                    System.out.println();

                    valorString = entrantScanner.next();
                    System.out.print("Intoduce el nuevo valor de temperatura: ");
                    valorDouble = entrantScanner.nextDouble();
                    System.out.println();
                    if (gestion.modificarTemperaturaCongelacion(valorString, valorDouble)) {
                        System.out.print("Cambio realizado sin errores => ");
                        System.out.println(gestion.mostarProductoConID(valorString));
                    } else {
                        System.err.println("Error, el id introducido no coincide con ningun producto congelado. Compruebe el id e intentelo de nuevo");
                        System.exit(0);
                    }
                }
                case "3" -> {
                    System.out.println();
                    System.out.print("Introduce un pais: ");
                    valorString = entrantScanner.next();
                    ArrayList<Productos> productosFrescosPorPais = gestion.productosFrescosPorPais(valorString);
                    System.out.println("Mostrando Productos que coincidan con el pais introducido...");
                    for (Productos productosFrescosPorPai : productosFrescosPorPais) {
                        System.out.println(productosFrescosPorPai);
                    }
                }
                case "4" -> {
                    System.out.println();
                    System.out.println("Mostrando productos caducados.....");
                    ArrayList<Productos> productosCaducados = gestion.getProductosCaducados();
                    for (Productos productosCaducado : productosCaducados) {
                        System.out.println(productosCaducado);
                    }
                }
                case "5" -> {
                    System.out.println();
                    System.out.print("Introduce el tipo de producto que desea buscar: ");
                    valorString = entrantScanner.next();
                    ArrayList<Productos> producTipe = gestion.getProductTipe(valorString);
                    for (Productos productos : producTipe) {
                        System.out.println(productos);
                    }
                }
                case "6" -> System.out.println("Finalizando procesos en ejecucion....");
            }
        } while (!(opcion.equals("6")));
        ClearConsole();
        System.out.flush();

    }

    public static void ClearConsole() throws IOException {
        final String operatingSystem = System.getProperty("os.name");

        if (operatingSystem.contains("Windows")) {
            Runtime.getRuntime().exec("cls");
        } else {
            Runtime.getRuntime().exec("clear");

        }


//        System.out.print("\033[H\033[2J");
//        System.out.flush();


//        try {
//            final String os = System.getProperty("os.name");
//            if (os.contains("Linux")) {
//                Runtime.getRuntime().exec("clear");
//            }
//        } catch (final Exception e) {
//            e.printStackTrace();
//        }


//        try {
//            String operatingSystem = System.getProperty("os.name"); //Check the current operating system
//
//            if (operatingSystem.contains("Linux")) {
//                ProcessBuilder pb = new ProcessBuilder("bash", "clear", "/usr/bin");
//                Process startProcess = pb.inheritIO().start();
//                startProcess.waitFor();
//            } else {
//                ProcessBuilder pb = new ProcessBuilder("clear");
//                Process startProcess = pb.inheritIO().start();
//
//                startProcess.waitFor();
//            }
//        } catch (Exception e) {
//            System.out.println(e);
//        }
    }
}


//productosFrescosPorPais


//modificarTemperaturaCongelacion


//getProductosCaducados


//getProductTipe




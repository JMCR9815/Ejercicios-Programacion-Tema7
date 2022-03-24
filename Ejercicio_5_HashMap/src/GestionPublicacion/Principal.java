package GestionPublicacion;

import Publicaciones.Publicacion;

import java.util.Scanner;

public class Principal {
    public static void main(String[] args) {
        Gestion gestion = new Gestion();
        Scanner entradaScanner = new Scanner(System.in);
        int limiteEjecucion;

        System.out.print("Introduce la cantidad de publicaciones a generar: ");
        limiteEjecucion = entradaScanner.nextInt();

        System.out.println("Generando lista de publicaciones...");
        gestion.llenarHashMap(limiteEjecucion);

        String opcion;
        do {
            opcion = gestion.menu.mostrarMenu();
            switch (opcion) {
                case "1" -> {
                    String titulo, titulo1, tipo, periodicidad, editorial;
                    int numEjemplares;
                    entradaScanner.nextLine();
                    System.out.print("Introduce un titulo para la publicacion: ");
                    titulo = entradaScanner.nextLine();
                    //entradaScanner.nextLine();
                    System.out.print("Indica el tipo de publicacion: ");
                    tipo = entradaScanner.next();
                    System.out.print("Indica la periodicidad de la publicacion: ");
                    periodicidad = entradaScanner.next();
                    System.out.print("Introduce la editorial de la publicacion: ");
                    editorial = entradaScanner.next();
                    System.out.print("Introduce el numero de ejemplares: ");
                    numEjemplares = entradaScanner.nextInt();
                    Publicacion publicacion = new Publicacion(titulo, tipo, periodicidad, editorial, numEjemplares);
                    System.out.println();
                    System.out.println("Anhadiendo nueva publicacion...");
                    gestion.addPublicacion(publicacion);
                    System.out.println("Publicacion anhadida");
                }
                case "2" -> {
                    String titulo;
                    System.out.print("Introduce un titulo a eliminar: ");
                    titulo = entradaScanner.next();
                    boolean bandera = gestion.isExist(titulo);
                    if (bandera) {
                        System.out.println("Eliminando Publicacion...");
                        gestion.deletePublicacion(titulo);
                        System.out.println("Publicacion eliminada");
                    } else {
                        System.out.println("No se ha podido eliminar la publicacion");
                    }
                }
                case "3" -> {
                    System.out.println("Mostrando la lista de publicaciones: ");
                    System.out.println();
                    gestion.mostrarHashMap();
                }
                case "4" -> {
                    int elementos;
                    System.out.print("Introduce el numero de elementos a eliminar: ");
                    elementos = entradaScanner.nextInt();
                    System.out.println("Eliminando " + elementos + " elementos...");
                    gestion.deleteVariasPublicaciones(elementos);
                    System.out.println("Elementos eliminados");
                }
                case "5" -> {
                    System.out.println("Finalizando proceso...");
                    System.exit(0);
                }
                default -> throw new IllegalStateException("El valor introducido no es valido, por favor seleccione un opcion valida");
            }
        } while (true);
    }
}

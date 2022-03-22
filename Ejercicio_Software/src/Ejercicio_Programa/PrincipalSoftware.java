package Ejercicio_Programa;

import java.util.Scanner;

public class PrincipalSoftware {

    public static void main(String[] args) {
        @SuppressWarnings("resource")
        Scanner parametroScanner = new Scanner(System.in);
        GestionSoftware gestion = new GestionSoftware();
        gestion.llenarArraySoftware();
        String opcion;
        do {
            opcion = gestion.menu.mostrarMenu();
            switch (opcion) {
                case "1": {
                    gestion.showSoftwareList();
                    break;
                }
                case "2": {
                    gestion.insertNewSoftware();
                    break;
                }
                case "3": {
                    String parametro;
                    System.out.println();
                    System.out.print("Introduce un parametro para buscar: ");
                    parametro = parametroScanner.nextLine();
                    gestion.filtredLicences(parametro);
                    break;
                }
                case "4": {
                    String parametro;
                    System.out.println();
                    System.out.print("Introduce un parametro para buscar: ");
                    parametro = parametroScanner.nextLine();
                    gestion.functionFiltered(parametro);
                    break;
                }
                case "5": {
                    String parametroUno;
                    String parametroDos;
                    System.out.println();
                    System.out.print("Introduce el primer parametro de busqueda: ");
                    parametroUno = parametroScanner.nextLine();
                    System.out.print("Introduce el segundo parametro de busqueda: ");
                    parametroDos = parametroScanner.nextLine();
                    gestion.functionFilteredTwoParams(parametroUno, parametroDos);
                    break;
                }

                case "6": {
                    gestion.deleteLastSoftware();
                    break;
                }
                case "7": {
                    String nombreBusqueda;

                    System.out.println();
                    System.out.print("Introduce el nombre del programa que desea eliminar: ");
                    nombreBusqueda = parametroScanner.nextLine();
                    gestion.deleteSoftwareByName(nombreBusqueda);
                    break;
                }
                case "8": {
                    String nombreBusqueda;

                    System.out.println();
                    System.out.print("Introduce el nombre del programa que desea buscar: ");
                    nombreBusqueda = parametroScanner.nextLine();
                    gestion.searchSoftware(nombreBusqueda);
                    break;
                }
                case "9": {
                    gestion.exit();
                }
                default:
                    throw new IllegalArgumentException("Unexpected value: " + opcion);
            }
            if (opcion.equals("10") || opcion.equals("")) {
                System.err.println("Error, Introduce una opcion valida.");
                System.exit(0);
            }
        } while (!opcion.equals("10"));

    }

}

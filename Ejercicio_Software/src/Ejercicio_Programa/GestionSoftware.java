package Ejercicio_Programa;

import java.time.LocalDate;
import java.util.*;

public class GestionSoftware {
    private final Software[] software = new Software[25];
    private final List<Software> listSoftwares = Arrays.asList(software);

    String[] softwareName = {"Nmap", "Lynis", "Fierce", "OpenVAS", "Nikto", "WPScan", "Skipfish", "CMSmap", "Fluxion",
            "Aircrack-ng", "Kismet Wireless", "Wireshark", "John the Ripper", "THC Hydra", "findmyhash", "RainbowCrack",
            "Metasploit Framework", "Social Engineering Toolkit", "BeEF", "Yersinia", "DHCPig", "FunkLoad",
            "SlowHTTPTest", "Inundator", "SQL Injections"};
    String[] softwareVersion = {"7.9", "3.0.7", "3.10", "21.4.3", "2.1.6", "3.8.20", "2.10", "3.0.4", "4.10",
            "2022-01-R3a", "1.6", "3.5.0", "1.8.0", "9.3", "4.0.5", "1.8", "6.1.27", "8.0.3", "0.5.4.0", "0.8.2",
            "1.8.0", "1.17.1", "1.8.2", "0.5", "5.8.7"};

    String[] opcionesMenu = {"1. Mostar lista de software", "2. Insertar nuevo programa (elementos libres)",
            "3. Filtrar por licencia", "4. Filtrar por función(1 parametro)", "5. Filtrar por función(2 parametros)",
            "6. Eliminar ultimo software", "7. Eliminar software por nombre", "8. buscar software por nombre",
            "9. EXIT"};

    Menu_Opciones menu = new Menu_Opciones(opcionesMenu);

    public void llenarArraySoftware() {
        Random rnd = new Random();
        for (int i = 0; i < software.length; i++) {
            int valorRandom = rnd.nextInt(4);

            software[i] = new Software(softwareName[i], softwareVersion[i], FuncionSoftware.values()[i],
                    LocalDate.of(rnd.nextInt(2000, 2021), rnd.nextInt(12) + 1, rnd.nextInt(27) + 1), "Empresa " + i,
                    Licence.values()[valorRandom], rnd.nextInt(60, 300));
            if (software[i].getLicence() == Licence.Free) {
                software[i].setSoftwarePrice(0);
            }
        }

    }

    @SuppressWarnings("static-access")
    public void insertNewSoftware() {

        String nombre, version, funcionString, empresaDesarrollo, licenceString;
        int precio = 0;
        FuncionSoftware funcion = null;
        Licence licence = null;
        LocalDate lunchyear = null;
        @SuppressWarnings("resource")
        Scanner StringEntradaScanner = new Scanner(System.in);
        @SuppressWarnings("resource")
        Scanner IntEntradaScanner = new Scanner(System.in);
        System.out.print("Introduce el nombre del programa: ");
        nombre = StringEntradaScanner.nextLine();
        System.out.print("Introduce la version del programa: ");
        version = StringEntradaScanner.nextLine();
        System.out.print("Introduce La funcion que desempenha el software: ");
        funcionString = StringEntradaScanner.nextLine();
        System.out.print("Introduce La fecha de salida del software: ");
        lunchyear = LocalDate.of(IntEntradaScanner.nextInt(), IntEntradaScanner.nextInt(), IntEntradaScanner.nextInt());
        System.out.print("Introduce el numbre de la empresa desarrolladora: ");
        empresaDesarrollo = StringEntradaScanner.nextLine();
        System.out.print("Introduce el tipo de licencia del software: ");
        licenceString = StringEntradaScanner.nextLine();
        System.out.print("Introduce el precio del producto: ");
        precio = IntEntradaScanner.nextInt();
        List<Software> newListOfSoftwares = new ArrayList<Software>(listSoftwares.size() + 1);
        newListOfSoftwares.containsAll(listSoftwares);
        Software softwareNuevo = new Software(nombre, version, funcion.valueOf(funcionString), lunchyear,
                empresaDesarrollo, licence.valueOf(licenceString), precio);
        newListOfSoftwares.add(softwareNuevo);
        System.out.println("Se ha anhadido el nuevo software a la lista:");
        System.out.println();
        System.out.println(newListOfSoftwares.get(newListOfSoftwares.size() - 1));
    }

    public void showSoftwareList() {
        System.out.println();
        System.out.println("Mostrando lista de software: ");
        System.out.println();
        for (int i = 0; i < listSoftwares.size(); i++) {
            System.out.println((i + 1) + ": " + listSoftwares.get(i).toString());

        }

    }

    public void filtredLicences(String licenceSearch) {
        System.out.println("Resultados:");
        System.out.println();
        for (int i = 0; i < listSoftwares.size(); i++) {
            if (listSoftwares.get(i).compareLicences(licenceSearch)) {
                System.out.print("   ");
                System.out.println(i + ". " + listSoftwares.get(i).toString());
            }
        }
        System.out.println();
    }

    public void functionFiltered(String functionSearch) {
        System.out.println("Resultados de la busqueda:");
        System.out.println();
        for (int i = 0; i < listSoftwares.size(); i++) {
            if (listSoftwares.get(i).comparefunctions(functionSearch)) {
                System.out.print("   ");
                System.out.println(i + ". " + listSoftwares.get(i).toString());
            }
        }
        System.out.println();
    }

    public void functionFilteredTwoParams(String functionSearch, String functionSearch2) {
        System.out.println("Resultados de la busqueda:");
        System.out.println();
        for (int i = 0; i < listSoftwares.size(); i++) {
            if (listSoftwares.get(i).comparefunctionsWithTwoParametres(functionSearch, functionSearch2)) {
                System.out.print("   ");
                System.out.println(i + ". " + listSoftwares.get(i).toString());
            }
        }
    }

    public void deleteLastSoftware() {
        System.out.println();
        System.out.println("Eliminando ultimo Software de la lista......");
        for (int i = 0; i < listSoftwares.size(); i++) {
            listSoftwares.remove(listSoftwares.size() - 1);
        }
        System.out.println();
        System.out.println("El software ha sido eliminado de la lista sin fallos");
    }

    public void deleteSoftwareByName(String nameSoftware) {
        System.out.println();
        for (int i = 0; i < listSoftwares.size(); i++) {
            if (listSoftwares.get(i).getName().equals(nameSoftware)) {
                System.out.println("Eliminando software de la lista......");
                listSoftwares.remove(i);
                System.out.println();
                System.out.println("El software ha sido eliminado de la lista sin fallos");
            }
        }

    }

    public void searchSoftware(String nameSoftware) {
        System.out.println("Resultados de la busqueda:");
        System.out.println();
        for (int i = 0; i < listSoftwares.size(); i++) {
            if (listSoftwares.get(i).getName().equalsIgnoreCase(nameSoftware)) {
                System.out.print("   ");
                System.out.println(listSoftwares.get(i).toString());
            }
        }
    }

    public void exit() {
        System.out.println("Adios");
        System.exit(0);

    }

}

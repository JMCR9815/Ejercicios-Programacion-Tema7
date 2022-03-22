package Ejercicio_Programa;

import java.util.Scanner;

public class Menu_Opciones {
    private final String[] opciones;

    public Menu_Opciones(String[] opciones) {
        this.opciones = opciones;
    }

    public String mostrarMenu() {
        @SuppressWarnings("resource")
        Scanner entradaOpc = new Scanner(System.in);
        // mostrar opciones menu
        System.out.println();
        System.out.println("<===== Menu de opciones =====>");
        for (String string : opciones) {
            System.out.println(string);
        }
        System.out.println();
        System.out.print("Opcion: ");

        String opc = entradaOpc.nextLine();

        return opc;
    }
}

package Menu;

import java.util.Scanner;

public record Menu_Opciones(String[] opciones) {

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

        return entradaOpc.nextLine();
    }
}

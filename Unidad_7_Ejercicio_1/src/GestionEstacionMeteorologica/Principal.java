package GestionEstacionMeteorologica;

public class Principal {
    public static void main(String[] args) {

        gestionEstacion gestion = new gestionEstacion();
        gestion.llenarArray();
        //gestion.addDatos(new DatosMeteo(0, 0, 0, 0, 0));
        gestion.mostrarArray();

        double media = gestion.mediaTempMax();
        System.out.println();
        System.out.printf("La media de las temperaturas maximas es: %.2f", media);
        int year = 2022;
        int month = 3;
        double media2 = gestion.mediaTempYearMonth(year, month);
        System.out.println();
        System.out.print("La media de las temperaturas maximas del anho " + year + " y el mes " + month + " es: ");
        System.out.printf("%.2f", media);
        System.out.println();
        System.out.println("Los elementos del Array son: " + gestion.numeroREgistros());
    }
}

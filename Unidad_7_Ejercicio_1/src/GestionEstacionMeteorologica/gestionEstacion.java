package GestionEstacionMeteorologica;

import EstacionMeteorologica.DatosMeteo;

import java.util.ArrayList;
import java.util.Random;

public class gestionEstacion {
    ArrayList<DatosMeteo> datosMeteo = new ArrayList<>();

    public void llenarArray() {
        Random rnd = new Random();
        for (int i = 0; i <= 5; i++) {
            datosMeteo.add(i, new DatosMeteo(rnd.nextDouble(15), rnd.nextDouble(20), rnd.nextDouble(20), rnd.nextDouble(15), rnd.nextDouble(30)));
        }
        System.out.println("Dato Anhadido");
    }

    public void mostrarArray() {
        for (int i = 0; i < datosMeteo.size(); i++) {

            System.out.println(datosMeteo.get(i).toString2());
        }
    }

    public void addDatos(DatosMeteo newData) {
        System.out.println("anhadiendo nuevos datos...");
        datosMeteo.add(newData);
        System.out.println("Nuevos datos anhadidos...");
    }

    public double mediaTempMax() {
        double valores = 0;
        int contador = 0;
        double resultado = 0;
        for (int i = 0; i < datosMeteo.size(); i++) {
            valores = valores + datosMeteo.get(i).getTemperaturaMax();
            contador++;
        }
        resultado = valores / contador;
        return resultado;
    }

    public double mediaTempYearMonth(int year, int month) {
        double valores = 0;
        int contador = 0;
        double resultado = 0;
        for (int i = 0; i < datosMeteo.size(); i++) {
            if (datosMeteo.get(i).getFecha().getYear() == year && datosMeteo.get(i).getFecha().getMonthValue() == month) {
                valores = valores + datosMeteo.get(i).getTemperaturaMax();
                contador++;
            }
        }
        resultado = valores / contador;

        return resultado;
    }

    public int numeroREgistros() {
        return datosMeteo.size();
    }
}

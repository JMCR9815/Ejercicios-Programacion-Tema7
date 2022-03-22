import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;

public class Ejemplo_1 {
    public static void main(String[] args) {
        ArrayList<Integer> a = new ArrayList<>();
        a.add(15);
        a.add(20);
        a.add(0);
        a.add(80);
        a.add(7);
        for (Integer integer : a) {
            System.out.println(integer);
        }

        System.out.println();
        for (int i = 0; i < a.size(); i++) {
            System.out.println("Posicion " + i + " = " + a.get(i));
        }
        a.remove(2);
        System.out.println();
        for (int i = 0; i < a.size(); i++) {
            System.out.println("Posicion " + i + " = " + a.get(i));
        }
        a.add(2);

        System.out.println();
        for (int i = 0; i < a.size(); i++) {
            System.out.println("Posicion " + i + " = " + a.get(i));
        }
        a.set(1, 13);

        System.out.println();
        for (int i = 0; i < a.size(); i++) {
            System.out.println("Posicion " + i + " = " + a.get(i));
        }
        System.out.println();
        for (int i = 0; i < a.size(); i++) {
            Integer remove = a.remove(i);
        }
        System.out.println();
        for (int i = 0; i < a.size(); i++) {
            System.out.println("Posicion " + i + " = " + a.get(i));
        }
        System.out.println();
        System.out.println("Rellenando Array");
        a.clear();
        a.add(7);
        a.add(2);
        a.add(5);
        a.add(3);
        a.add(8);
        a.add(1);
        System.out.println("Mostrando array");
        System.out.println();
        for (int i = 0; i < a.size(); i++) {
            System.out.println("Posicion " + i + " = " + a.get(i));
        }
        System.out.println();
        System.out.println("Borrando numero Pares");
        Iterator<Integer> iterator = a.iterator();
        while (iterator.hasNext()) {
            int valor = (int) iterator.next();
            if (valor % 2 == 0) {
                iterator.remove();
            }
        }
        System.out.println();
        for (int i = 0; i < a.size(); i++) {
            System.out.println("Posicion " + i + " = " + a.get(i));
        }
        Collections.sort(a);
        System.out.println();
        System.out.println("Ordenando el array");
        System.out.println();
        for (int i = 0; i < a.size(); i++) {
            System.out.println("Posicion " + i + " = " + a.get(i));
        }
    }

}
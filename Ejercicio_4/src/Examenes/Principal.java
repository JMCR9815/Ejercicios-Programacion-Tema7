package Examenes;

public class Principal {
    public static void main(String[] args) {
        GestionExamen gestio = new GestionExamen();
        gestio.generateExamen();
        gestio.mostarExamenes();
    }
}

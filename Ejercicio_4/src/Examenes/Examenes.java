package Examenes;

public class Examenes {
    private String descripcion;
    private Preguntas[] preguntas;

    public Examenes(String descripcion, Preguntas[] preguntas) {
        this.descripcion = descripcion;
        this.preguntas = preguntas;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public Preguntas[] getPreguntas() {
        return preguntas;
    }

    public void setPreguntas(Preguntas[] preguntas) {
        this.preguntas = preguntas;
    }


    public void mostarExamen() {
        char letra = 'a';
        for (int i = 0; i < preguntas.length; i++) {
            System.out.println("Descripcion: " + getDescripcion());
            System.out.print(i + ". " + getPreguntas()[i]);

        }
    }
}

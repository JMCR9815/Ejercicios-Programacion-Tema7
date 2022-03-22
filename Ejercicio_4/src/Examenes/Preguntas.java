package Examenes;

public class Preguntas {
    private String enunciado;
    private Respuestas[] respuestas;
    private Respuestas opcionCorrecta;

    public Preguntas(String enunciado, Respuestas[] respuestas, Respuestas opcionCorrecta) {
        this.enunciado = enunciado;
        this.respuestas = respuestas;
        this.opcionCorrecta = opcionCorrecta;
    }

    public String getEnunciado() {
        return enunciado;
    }

    public void setEnunciado(String enunciado) {
        this.enunciado = enunciado;
    }

    public Respuestas[] getRespuestas() {
        return respuestas;
    }

    public void setRespuestas(Respuestas[] respuestas) {
        this.respuestas = respuestas;
    }

    public Respuestas getOpcionCorrecta() {
        return opcionCorrecta;
    }

    public Preguntas[] generatePreguntas() {
        Preguntas[] arrayPreguntas = new Preguntas[20];
        for (int i = 0; i < arrayPreguntas.length; i++) {
            arrayPreguntas[i] = new Preguntas("Enunciado" + i, getRespuestas(), getOpcionCorrecta());
        }
        return arrayPreguntas;
    }

    public void mostarPreguntas() {

        for (int i = 0; i < respuestas.length; i++) {
            System.out.println(getRespuestas()[i].toString());
        }
    }
}

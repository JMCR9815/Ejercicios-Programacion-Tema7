package Examenes;

import java.util.Random;

public class Respuestas {
    private String respuesta;
    private int opcionCorrecta;

    public Respuestas(String respuesta, int opcionCorrecta) {
        this.respuesta = respuesta;
        this.opcionCorrecta = opcionCorrecta;
    }

    public String getRespuesta() {
        return respuesta;
    }

    public void setRespuesta(String respuesta) {
        respuesta = respuesta;
    }

    public int getOpcionCorrecta() {
        return opcionCorrecta;
    }

    public void setOpcionCorrecta(int opcionCorrecta) {
        this.opcionCorrecta = opcionCorrecta;
    }

    public Respuestas[] generateRespuestas() {
        Respuestas[] respuestas = new Respuestas[4];
        Random rnd = new Random();
        for (int i = 0; i < respuestas.length; i++) {
            int opcionRandom = rnd.nextInt(5);
            respuestas[i] = new Respuestas("respuesta" + i, opcionRandom);
        }
        return respuestas;
    }


}

package Examenes;

public class GestionExamen {
    private Examenes[] examenes = new Examenes[20];
    private Examenes examen;
    private Preguntas pregunta;
    private Respuestas respuesta;

    public void generateExamen() {
        respuesta.generateRespuestas();
        pregunta.generatePreguntas();
        for (int i = 0; i < examenes.length; i++) {
            examenes[i] = new Examenes("Descripcion" + i, examen.getPreguntas());
        }
    }

    public void mostarExamenes() {
        examen.mostarExamen();
        pregunta.mostarPreguntas();
    }

}

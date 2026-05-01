package uni1a;

public class Documental extends ContenidoAudiovisual {

    private String tema;
    private Investigador investigador;

    public Documental(String titulo, int duracion,
                      String tema,
                      Investigador investigador) {

        super(titulo, duracion);

        this.tema = tema;
        this.investigador = investigador;
    }

    public String getTema() {
        return tema;
    }

    public void setTema(String tema) {
        this.tema = tema;
    }

    public Investigador getInvestigador() {
        return investigador;
    }

    public void setInvestigador(Investigador investigador) {
        this.investigador = investigador;
    }

    @Override
    public void mostrarInformacion() {

        super.mostrarInformacion();

        System.out.println("Tema: " + tema);

        investigador.mostrarInvestigador();
    }
}
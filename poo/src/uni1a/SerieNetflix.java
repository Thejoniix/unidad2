package uni1a;

public class SerieNetflix extends ContenidoAudiovisual {

    private String genero;

    public SerieNetflix(String titulo,
                        int duracion,
                        String genero) {

        super(titulo, duracion);

        this.genero = genero;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    @Override
    public void mostrarInformacion() {

        super.mostrarInformacion();

        System.out.println("Género: " + genero);
    }
}
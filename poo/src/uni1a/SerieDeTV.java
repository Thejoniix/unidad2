package uni1a;

import java.util.ArrayList;

public class SerieDeTV extends ContenidoAudiovisual {

    private String creador;
    private ArrayList<Temporada> temporadas;

    public SerieDeTV(String titulo, int duracion, String creador) {
        super(titulo, duracion);
        this.creador = creador;
        temporadas = new ArrayList<>();
    }

    public String getCreador() {
        return creador;
    }

    public void setCreador(String creador) {
        this.creador = creador;
    }

    public ArrayList<Temporada> getTemporadas() {
        return temporadas;
    }

    public void setTemporadas(ArrayList<Temporada> temporadas) {
        this.temporadas = temporadas;
    }

    public void agregarTemporada(Temporada temporada) {
        temporadas.add(temporada);
    }

    @Override
    public void mostrarInformacion() {

        super.mostrarInformacion();

        System.out.println("Creador: " + creador);

        for (Temporada temporada : temporadas) {
            temporada.mostrarTemporada();
        }
    }
}
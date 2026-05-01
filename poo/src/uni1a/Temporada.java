package uni1a;

public class Temporada {

    private int numeroTemporada;
    private int episodios;

    public Temporada(int numeroTemporada, int episodios) {
        this.numeroTemporada = numeroTemporada;
        this.episodios = episodios;
    }

    public int getNumeroTemporada() {
        return numeroTemporada;
    }

    public void setNumeroTemporada(int numeroTemporada) {
        this.numeroTemporada = numeroTemporada;
    }

    public int getEpisodios() {
        return episodios;
    }

    public void setEpisodios(int episodios) {
        this.episodios = episodios;
    }

    public void mostrarTemporada() {
        System.out.println("Temporada: " + numeroTemporada);
        System.out.println("Episodios: " + episodios);
    }
}
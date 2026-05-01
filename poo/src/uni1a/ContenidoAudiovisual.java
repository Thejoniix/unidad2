package uni1a;

public class ContenidoAudiovisual {

    protected String titulo;
    protected int duracion;

    public ContenidoAudiovisual(String titulo, int duracion) {
        this.titulo = titulo;
        this.duracion = duracion;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public int getDuracion() {
        return duracion;
    }

    public void setDuracion(int duracion) {
        this.duracion = duracion;
    }

    public void mostrarInformacion() {
        System.out.println("Título: " + titulo);
        System.out.println("Duración: " + duracion + " minutos");
    }
}
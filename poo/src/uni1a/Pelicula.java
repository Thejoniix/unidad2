package uni1a;

import java.util.ArrayList;

public class Pelicula extends ContenidoAudiovisual {

    private String director;
    private ArrayList<Actor> actores;

    public Pelicula(String titulo, int duracion, String director) {
        super(titulo, duracion);
        this.director = director;
        actores = new ArrayList<>();
    }

    public String getDirector() {
        return director;
    }

    public void setDirector(String director) {
        this.director = director;
    }

    public ArrayList<Actor> getActores() {
        return actores;
    }

    public void setActores(ArrayList<Actor> actores) {
        this.actores = actores;
    }

    public void agregarActor(Actor actor) {
        actores.add(actor);
    }

    @Override
    public void mostrarInformacion() {

        super.mostrarInformacion();

        System.out.println("Director: " + director);

        for (Actor actor : actores) {
            actor.mostrarActor();
        }
    }
}
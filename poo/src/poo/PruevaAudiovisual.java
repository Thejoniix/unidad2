package poo;

import uni1a.*;

public class PruevaAudiovisual {

    public static void main(String[] args) {

        Actor actor1 = new Actor("Keanu Reeves", 50);
        Actor actor2 = new Actor("Scarlett Johansson", 38);

        Pelicula pelicula = new Pelicula(
                "Matrix",
                120,
                "Wachowski"
        );

        pelicula.agregarActor(actor1);
        pelicula.agregarActor(actor2);

        pelicula.mostrarInformacion();

        System.out.println("-------------------");
        System.out.println("----SERIE DE TV----");

        Temporada t1 = new Temporada(1, 10);
        Temporada t2 = new Temporada(2, 8);

        SerieDeTV serie = new SerieDeTV(
                "Breaking Bad",
                45,
                "Vince Gilligan"
        );

        serie.agregarTemporada(t1);
        serie.agregarTemporada(t2);

        serie.mostrarInformacion();

        System.out.println("-------------------");
        System.out.println("---INVESTIGAADOR---");
        Investigador investigador =
                new Investigador(
                        "Carlos Perez",
                        "Biología"
                );

        Documental documental =
                new Documental(
                        "Vida Marina",
                        90,
                        "Océanos",
                        investigador
                );

        documental.mostrarInformacion();

        System.out.println("-------------------");
        System.out.println("--VIDEO DE TWITCH--");
        VideoTwitch video =
                new VideoTwitch(
                        "Velada del año",
                        50000,
                        "ibai",
                        100000000
                );

        video.mostrarInformacion();

        System.out.println("-------------------");
        System.out.println("-SERIE DE NETFLIX-");
        SerieNetflix serie1 =
                new SerieNetflix(
                        "La Noche",
                        20,
                        "Terror"
                );

        serie1.mostrarInformacion();
    }
}
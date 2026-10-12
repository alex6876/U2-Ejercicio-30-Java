import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {

        List<ContenidoDigital> contenidos = new ArrayList<>();

        contenidos.add(new Pelicula("El Conjuro", 112));

        contenidos.add(
                new EpisodioSerie("El comienzo", 45, "Serie Misteriosa", 1)
        );

        contenidos.add(
                new TransmisionEnVivo("Concierto en directo", 0, true)
        );

        contenidos.add(
                new TransmisionEnVivo("Partido de futbol", 0, false)
        );

        for (ContenidoDigital contenido : contenidos) {
            contenido.reproducir();
            System.out.println("-----------------------------");
        }
    }
}

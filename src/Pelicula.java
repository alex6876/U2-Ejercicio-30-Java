public class Pelicula extends ContenidoDigital {

    public Pelicula(String titulo, int duracionMinutos) {
        super(titulo, duracionMinutos);
    }

    @Override
    public void reproducir() {
        if (duracionMinutos > 0) {
            System.out.println("Reproduciendo pelicula: " + titulo);
            System.out.println("Duracion: " + duracionMinutos + " minutos");
            System.out.println("La pelicula ha comenzado.");
        } else {
            System.out.println("Error: duracion invalida.");
        }
    }
}

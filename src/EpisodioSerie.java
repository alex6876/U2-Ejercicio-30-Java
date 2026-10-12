public class EpisodioSerie extends ContenidoDigital {

    private String nombreSerie;
    private int numeroEpisodio;

    public EpisodioSerie(String titulo, int duracionMinutos,
                         String nombreSerie, int numeroEpisodio) {

        super(titulo, duracionMinutos);
        this.nombreSerie = nombreSerie;
        this.numeroEpisodio = numeroEpisodio;
    }

    @Override
    public void reproducir() {
        if (duracionMinutos > 0 && numeroEpisodio > 0) {
            System.out.println("Reproduciendo episodio: " + titulo);
            System.out.println("Serie: " + nombreSerie);
            System.out.println("Episodio numero: " + numeroEpisodio);
            System.out.println("Duracion: " + duracionMinutos + " minutos");
        } else {
            System.out.println("Error: datos del episodio invalidos.");
        }
    }
}

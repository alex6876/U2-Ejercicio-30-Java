public class TransmisionEnVivo extends ContenidoDigital {

    private boolean enCurso;

    public TransmisionEnVivo(String titulo, int duracionMinutos,
                             boolean enCurso) {

        super(titulo, duracionMinutos);
        this.enCurso = enCurso;
    }

    @Override
    public void reproducir() {
        if (enCurso) {
            System.out.println("Conectando con la transmision en vivo: " + titulo);
            System.out.println("Streaming en directo iniciado.");
        } else {
            System.out.println("No se puede reproducir " + titulo);
            System.out.println("La transmision no esta en curso.");
        }
    }
}

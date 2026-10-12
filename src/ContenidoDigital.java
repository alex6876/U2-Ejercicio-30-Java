public abstract class ContenidoDigital {

    protected String titulo;
    protected int duracionMinutos;

    public ContenidoDigital(String titulo, int duracionMinutos) {
        this.titulo = titulo;
        this.duracionMinutos = duracionMinutos;
    }

    public abstract void reproducir();
}

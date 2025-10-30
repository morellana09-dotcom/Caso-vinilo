package ColeccionVinilos;

public class Vinilo {
    private String artista;
    private String nombreDisco;
    private int año;

    public Vinilo(String artista, String nombreDisco, int año) {
        this.artista = artista;
        this.nombreDisco = nombreDisco;
        this.año = año;
    }

    public String getArtista() {
        return artista;
    }

    public String getNombreDisco() {
        return nombreDisco;
    }

    public int getAnio() {
        return año;
    }

    @Override
    public String toString() {
        return String.format("%-15s - %-25s - %d", artista, nombreDisco, año);
    }

}

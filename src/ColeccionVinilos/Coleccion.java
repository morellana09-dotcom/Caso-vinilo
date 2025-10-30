package ColeccionVinilos;

import java.util.ArrayList;
import java.util.List;

public class Coleccion {
    private List<Vinilo> vinilos;
    private int capacidadMaxima;

    public Coleccion(int capacidadMaxima) {
        this.capacidadMaxima = capacidadMaxima;
        this.vinilos = new ArrayList<>();
    }


    public boolean agregarVinilo(Vinilo vinilo) {
        if (vinilos.size() < capacidadMaxima) {
            vinilos.add(vinilo);
            return true;
        }
        System.out.println("No hay espacio   disponible para agregar más vinilos.");
        return false;
    }

    public int totalVinilos() {
        return vinilos.size();
    }

    public int disponibles() {
        return capacidadMaxima - vinilos.size();
    }

    public boolean buscarArtista(String artista) {
        for (Vinilo v : vinilos) {
            if (v.getArtista().equalsIgnoreCase(artista)) {
                return true;
            }
        }
        return false;
    }

    public void mostrarBusquedaArtista(String artista) {
        System.out.println("\nResultados para: " + artista);
        for (Vinilo v : vinilos) {
            if (v.getArtista().equalsIgnoreCase(artista)) {
                System.out.println(v);
            }
        }
    }

    public void mostrarColeccion() {
        System.out.println("\nListado completo de vinilos:");
        int fila = 1;
        for (Vinilo v : vinilos) {
            System.out.println("Fila " + fila + ": " + v);
            fila++;
        }
    }


}
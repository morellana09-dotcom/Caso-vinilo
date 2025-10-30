package ColeccionVinilos;

import java.util.Scanner;

public class ColeccionVinilo {
    private Coleccion coleccion;
    private Scanner sc;

    public ColeccionVinilo() {
        coleccion = new Coleccion(100);
        sc = new Scanner(System.in);
        cargarEjemplos();
    }


    private void cargarEjemplos() {
        coleccion.agregarVinilo(new Vinilo("Iron Maiden", "Iron Maiden", 1980));
        coleccion.agregarVinilo(new Vinilo("AC-DC", "Back in Black", 1980));
        coleccion.agregarVinilo(new Vinilo("Kiss", "Destroyer", 1976));
    }

    public void mostrarMenu() {
        int opcion;
        do {
            System.out.println("\n=== MENÚ COLECCIÓN DE VINILOS ===");
            System.out.println("1. agregar vinilo");
            System.out.println("2. Buscar artista");
            System.out.println("3. Mostrar cantidad y espacios disponibles");
            System.out.println("4. mostrar colección completa");
            System.out.println("0. salir");
            System.out.print("Seleccione una opción: ");
            opcion = sc.nextInt();
            sc.nextLine();

            switch (opcion) {
                case 1 -> agregarVinilo();
                case 2 -> buscarArtista();
                case 3 -> mostrarTotales();
                case 4 -> coleccion.mostrarColeccion();
                case 0 -> System.out.println("Saliendo del programa...");
                default -> System.out.println("Opción no válida, intente nuevamente.");
            }

        } while (opcion != 0);
    }

    private void agregarVinilo() {
        System.out.print("Ingrese nombre del artista: ");
        String artista = sc.nextLine();
        System.out.print("Ingrese nombre del disco: ");
        String disco = sc.nextLine();
        System.out.print("Ingrese año de lanzamiento: ");
        int anio = sc.nextInt();
        sc.nextLine();

        coleccion.agregarVinilo(new Vinilo(artista, disco, anio));
        System.out.println("Vinilo agregado correctamente.");
    }




    private void buscarArtista() {
        System.out.print("Ingrese artista a buscar: ");
        String artista = sc.nextLine();
        if (coleccion.buscarArtista(artista)) {
            System.out.println("El artista " + artista + " está en la colección.");
            coleccion.mostrarBusquedaArtista(artista);
        } else {
            System.out.println("El artista " + artista + " no está en la colección.");
        }
    }

    private void mostrarTotales() {
        System.out.println("Total de vinilos: " + coleccion.totalVinilos());
        System.out.println("Espacios disponibles: " + coleccion.disponibles());
    }
}
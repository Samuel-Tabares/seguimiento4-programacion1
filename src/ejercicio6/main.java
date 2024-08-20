package ejercicio6;

import java.util.ArrayList;
import java.util.Scanner;

public class main {
    public static void main(String[] args) {
        Biblioteca biblioteca = new Biblioteca();
        Scanner scanner = new Scanner(System.in);
        int opcion;

        do {
            System.out.println("\nMenú de la Biblioteca:");
            System.out.println("1. Agregar libro");
            System.out.println("2. Eliminar libro");
            System.out.println("3. Buscar libro por título");
            System.out.println("4. Buscar libro por autor");
            System.out.println("5. Listar libros");
            System.out.println("6. Salir");
            System.out.print("Seleccione una opción: ");
            opcion = scanner.nextInt();
            scanner.nextLine(); // Limpiar buffer

            switch (opcion) {
                case 1:
                    System.out.print("Ingrese el título del libro: ");
                    String titulo = scanner.nextLine();
                    System.out.print("Ingrese el autor del libro: ");
                    String autor = scanner.nextLine();
                    System.out.print("Ingrese el ISBN del libro: ");
                    String ISBN = scanner.nextLine();
                    System.out.print("Ingrese el año de publicación: ");
                    int añoPublicacion = scanner.nextInt();
                    scanner.nextLine(); // Limpiar buffer

                    Libro nuevoLibro = new Libro(titulo, autor, ISBN, añoPublicacion);
                    biblioteca.agregarLibro(nuevoLibro);
                    break;

                case 2:
                    System.out.print("Ingrese el ISBN del libro a eliminar: ");
                    String ISBNEliminar = scanner.nextLine();
                    biblioteca.eliminarLibro(ISBNEliminar);
                    break;

                case 3:
                    System.out.print("Ingrese el título del libro a buscar: ");
                    String tituloBuscar = scanner.nextLine();
                    Libro libroEncontrado = biblioteca.buscarLibroPorTitulo(tituloBuscar);
                    if (libroEncontrado != null) {
                        System.out.println("Libro encontrado: " + libroEncontrado);
                    } else {
                        System.out.println("No se encontró un libro con el título especificado.");
                    }
                    break;

                case 4:
                    System.out.print("Ingrese el autor del libro a buscar: ");
                    String autorBuscar = scanner.nextLine();
                    ArrayList<Libro> librosEncontrados = biblioteca.buscarLibroPorAutor(autorBuscar);
                    if (!librosEncontrados.isEmpty()) {
                        System.out.println("Libros encontrados:");
                        for (Libro libro : librosEncontrados) {
                            System.out.println(libro);
                        }
                    } else {
                        System.out.println("No se encontraron libros del autor especificado.");
                    }
                    break;

                case 5:
                    System.out.println("Listado de libros en la biblioteca:");
                    biblioteca.listarLibros();
                    break;

                case 6:
                    System.out.println("Saliendo del sistema de la biblioteca...");
                    break;

                default:
                    System.out.println("Opción no válida. Por favor, intente nuevamente.");
                    break;
            }
        } while (opcion != 6);

        scanner.close();
    }
}


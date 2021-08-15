package mx.com.gm.peliculas.presentacion;

import java.util.*;
import mx.com.gm.peliculas.servicio.*;

/*Responsabilidades:
-Contiene el menu que permite al usuario seleccionar la accion a ejecutar
 sobre el catalogo de peliculas*/
public class CatalogoPeliculasPresentación {

    public static void main(String[] args) {
        int opcion = -1;
        var consola = new Scanner(System.in);
        ICatalogoPeliculas catalogo = new CatalogoPeliculasImpl();
        while (opcion != 0) {
            System.out.println("Elije una opcion: "
                    + "\n[1] Iniciar catalogo peliculas"
                    + "\n[2] Agregar pelicula"
                    + "\n[3] Listar peliculas"
                    + "\n[4] Buscar pelicula"
                    + "\n[0] Salir");
            opcion = consola.nextInt();
            switch (opcion) {
                case 1:
                    catalogo.iniciarCatalogoPeliculas();
                    break;
                case 2:
                    //quitar bug
                    consola.nextLine();
                    System.out.println("Ingrese el nombre de la pelicula: ");
                    catalogo.agregarPelicula(consola.nextLine());
                    break;
                case 3:
                    catalogo.listarPelicula();
                    break;
                case 4:
                    consola.nextLine();
                    System.out.println("Ingrese el nombre de la pelicula que busca: ");
                    catalogo.buscarPelicula(consola.nextLine());
                    break;
                case 0:
                    System.out.println("Adios! =D");
                    break;
                default:
                    System.out.println("Opcion no reconocida");
                    break;
            }
        }
    }
}

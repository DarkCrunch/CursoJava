package mx.com.gm.peliculas.servicio;

/*Responsabilidades
-Contiene las operaciones necesarias de la aplicacion ICatalogoPeliculas*/
public interface ICatalogoPeliculas {
    String NOMBRE_RECURSO = "peliculas.txt";
    public void agregarPelicula(String nombrePelicula);

    public void listarPelicula();

    public void buscarPelicula(String buscar);

    public void iniciarCatalogoPeliculas();
}

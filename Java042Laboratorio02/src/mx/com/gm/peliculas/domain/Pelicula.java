package mx.com.gm.peliculas.domain;
/*Responsabilidades:
-Representa los objetos pelicula utilizados en la aplicacion 
 catalogo de peliculas.*/
public class Pelicula {

    //Atributos
    private String nombre;

    //Constructores
    public Pelicula() {
    }

    public Pelicula(String nombre) {
        this.setNombre(nombre);
    }

    //Encapsulamiento
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    //Metodos
    @Override
    public String toString() {
        return this.getNombre();
    }
}

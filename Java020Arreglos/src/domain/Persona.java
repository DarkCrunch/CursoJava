package domain;

public class Persona {

    //Atributos
    private String nombre;

    //Constructor
    public Persona(String nombre) {
        this.nombre = nombre;
    }

    //Metodos
    public String getNombre() {
        return this.nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    @Override
    public String toString() {
        return "Persona{" + "nombre=" + this.nombre + '}' + ", " + super.toString();
    }

}

package clases;

public class Persona {

    public String nombre,
            apellido;

    public void desplegarInformacion() {
        System.out.println("Nombre: " + this.nombre
                + "\nApellido: " + this.apellido);
    }
}
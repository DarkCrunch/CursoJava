package clases;

public class Persona {
    /*
    Modificadores de acceso:
    *public
    *private
    *protected
    default
    */
    //Atributos de la clase
    public String nombre,
            apellido;

    //Metodos de la clase
    public void desplegarInformacion() {
        System.out.println("Nombre: " + this.nombre
                + "\nApellido: " + this.apellido+"\n");
    }
}

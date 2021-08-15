package domain;

//No dejara que se cree herencia apartir de esta clase
public final class Persona {

    //se le conoce como constante el uso de final static, y no podemos cambiarla
    public final static int MI_CONSTANTE = 1;
    private String nombre;
    
    //No se puede sobreescribir o modificar el metodo en las clases heredadas
    public final void imprimir() {
        System.out.println("Metodo imprimir");
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
}

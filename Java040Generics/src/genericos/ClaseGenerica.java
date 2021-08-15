package genericos;

public class ClaseGenerica<T> {

    //Atributos
    T objeto;

    //Constructores
    public ClaseGenerica(T objeto) {
        this.objeto = objeto;
    }

    //Metodos
    public void obtenerTipo() {
        System.out.println("El tipo T es: " + this.objeto.getClass().getSimpleName());
    }
}

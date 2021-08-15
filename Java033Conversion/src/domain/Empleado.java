package domain;

public class Empleado {

    //Atributos
    private String nombre;
    private double sueldo;

    //Constructores
    public Empleado(String nombre, double sueldo) {
        setNombre(nombre);
        setSueldo(sueldo);
    }

    //Encapsulamiento
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public double getSueldo() {
        return sueldo;
    }

    public void setSueldo(double sueldo) {
        this.sueldo = sueldo;
    }

    //Metodos
    public String obtenerDetalles() {
        return "Nombre: " + this.getNombre() 
                + ", Sueldo: " + this.getSueldo();
    }

    @Override
    public String toString() {
        return "Empleado{" 
                + "nombre=" + this.getNombre() 
                + ", sueldo=" + this.getSueldo() 
                + '}';
    }

}

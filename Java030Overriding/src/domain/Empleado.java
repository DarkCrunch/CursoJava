package domain;

public class Empleado {
    //Atributos
    protected String nombre;
    protected double sueldo;
    
    //Constructores
    public Empleado(String nombre, double sueldo) {
        this.setNombre(nombre);
        this.setSueldo(sueldo);
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
        return "Nombre: " + this.getNombre() + ", sueldo: " + this.getSueldo();
    }
}

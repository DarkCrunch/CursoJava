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
    public String obtenerDatos() {
        return "nombre: " + this.getNombre() 
                + ", sueldo: " + this.getSueldo();
    }

}

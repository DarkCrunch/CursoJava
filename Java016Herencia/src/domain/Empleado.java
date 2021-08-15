package domain;

public class Empleado extends Persona {

    //Atributos
    private int idEmpleado;
    private double sueldo;
    private static int contadorEmpleado;

    //Constructor
    public Empleado(String nombre, double sueldo) {
        super(nombre);
        Empleado.contadorEmpleado++;
        this.idEmpleado = Empleado.contadorEmpleado;
        this.sueldo = sueldo;
    }

    //Metodos
    public int getIdEmpleado() {
        return this.idEmpleado;
    }

    public double getSueldo() {
        return sueldo;
    }

    public void setSueldo(double sueldo) {
        this.sueldo = sueldo;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Empleado{idEmpleado=").append(this.idEmpleado);
        sb.append(", ").append(super.toString());
        sb.append(", sueldo=").append(this.sueldo);
        sb.append('}');
        return sb.toString();
    }
    
    
}

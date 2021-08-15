package domain;

public class Gerente extends Empleado {

    //Atributo
    private String departamento;

    //Constructores
    public Gerente(String nombre, double sueldo, String departamento) {
        super(nombre, sueldo);
        this.departamento = departamento;
    }

    //Metodos
    @Override
    public String obtenerDatos() {
        return super.obtenerDatos() 
                + ", departamento: " + this.departamento;
    }

}

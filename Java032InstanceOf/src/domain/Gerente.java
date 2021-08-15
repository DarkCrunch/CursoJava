package domain;

public class Gerente extends Empleado {

    //Atributo
    private String departamento;

    //Constructores
    public Gerente(String nombre, double sueldo, String departamento) {
        super(nombre, sueldo);
        this.setDepartamento(departamento);
    }

    //Encapsulamiento
    public String getDepartamento() {
        return departamento;
    }

    public void setDepartamento(String departamento) {
        this.departamento = departamento;
    }

    //Metodos
    @Override
    public String obtenerDatos() {
        return super.obtenerDatos()
                + ", departamento: " + this.getDepartamento();
    }
}

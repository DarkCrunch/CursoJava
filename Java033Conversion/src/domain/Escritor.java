package domain;

public class Escritor extends Empleado {

    private final TipoEscritura tipoEscritura;

    public Escritor(String nombre, double sueldo, 
            TipoEscritura tipoEscritura) {
        super(nombre, sueldo);
        this.tipoEscritura = tipoEscritura;
    }

    public TipoEscritura getTipoEscritura() {
        return tipoEscritura;
    }

    @Override
    public String obtenerDetalles() {
        return super.obtenerDetalles() 
                + ", tipoEscritura: " 
                + this.getTipoEscritura().getDescripcion();
    }

    @Override
    public String toString() {
        return "Escritor{" + "tipoEscritura=" 
                + this.getTipoEscritura() + '}'
                + " " + super.toString();
    }
}

package mx.com.gm.mundopc;

public class Computadora {

    //Atributos
    private final int idComputadora;
    private String nombre;
    private Monitor monitor;
    private Teclado teclado;
    private Raton raton;
    private static int contadorComputadoras;

    //Constructores
    private Computadora() {
        this.idComputadora = ++Computadora.contadorComputadoras;
    }

    public Computadora(String nombre, Monitor monitor, Teclado teclado, Raton raton) {
        this();
        this.setNombre(nombre);
        this.setMonitor(monitor);
        this.setTeclado(teclado);
        this.setRaton(raton);
    }

    //Encapsulamiento
    public int getIdComputadora() {
        return idComputadora;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Monitor getMonitor() {
        return monitor;
    }

    public void setMonitor(Monitor monitor) {
        this.monitor = monitor;
    }

    public Teclado getTeclado() {
        return teclado;
    }

    public void setTeclado(Teclado teclado) {
        this.teclado = teclado;
    }

    public Raton getRaton() {
        return raton;
    }

    public void setRaton(Raton raton) {
        this.raton = raton;
    }
    //Metodos

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Computadora{idComputadora=").append(this.getIdComputadora());
        sb.append(", nombre=").append(this.getNombre());
        sb.append(", monitor=").append(this.getMonitor());
        sb.append(", teclado=").append(this.getTeclado());
        sb.append(", raton=").append(this.getRaton());
        sb.append('}');
        return sb.toString();
    }
    
}

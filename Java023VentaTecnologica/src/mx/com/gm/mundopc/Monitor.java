package mx.com.gm.mundopc;

public class Monitor {

    //Atributos
    private final int idMonitor;
    private String marca;
    private double tamano;
    private static int contadorMonitores;

    //Constructores
    private Monitor() {
        this.idMonitor = ++Monitor.contadorMonitores;
    }

    public Monitor(String marca, double tamano) {
        this();
        setMarca(marca);
        setTamano(tamano);
    }

    //Encapsulamiento
    public String getMarca() {
        return this.marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public double getTamano() {
        return this.tamano;
    }

    public void setTamano(double tamano) {
        this.tamano = tamano;
    }

    public int getIdMonitor() {
        return this.idMonitor;
    }

    //Metodos

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Monitor{idMonitor=").append(this.getIdMonitor());
        sb.append(", marca=").append(this.getMarca());
        sb.append(", tamano=").append(this.getTamano());
        sb.append('}');
        return sb.toString();
    }
    

}

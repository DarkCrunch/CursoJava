package mx.com.gm.mundopc;

public class DispositivoEntrada {

    //Atributos
    private String tipoDeEntrada;
    private String marca;

    //Constructores
    public DispositivoEntrada(String tipoEntrada, String marca) {
        this.setTipoDeEntrada(tipoEntrada);
        this.setMarca(marca);
    }
    //Encapsulamiento
    public String getTipoDeEntrada() {
        return this.tipoDeEntrada;
    }

    public void setTipoDeEntrada(String tipoEntrada) {
        this.tipoDeEntrada = tipoEntrada;
    }

    public String getMarca() {
        return this.marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }
    //Metodos

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("DispositivoEntrada{tipoEntrada=").append(this.getTipoDeEntrada());
        sb.append(", marca=").append(this.getMarca());
        sb.append('}');
        return sb.toString();
    }
    
}

package mx.com.gm.mundopc;

public class Teclado extends DispositivoEntrada{
     //Atributos
    private final int idTeclado;
    private static int contadorTeclados;

    //Constructores
    public Teclado(String tipoDeEntrada, String marca) {
        super(tipoDeEntrada,marca);
        this.idTeclado = ++Teclado.contadorTeclados;
    }
    //Metodos

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Teclado{idTeclado=").append(this.idTeclado);
        sb.append(",tipoEntrada=").append(super.getTipoDeEntrada());
        sb.append(", marca=").append(super.getMarca());
        sb.append('}');
        return sb.toString();
    }
    
}

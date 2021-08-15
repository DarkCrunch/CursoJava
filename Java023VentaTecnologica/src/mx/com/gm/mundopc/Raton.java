package mx.com.gm.mundopc;

public class Raton extends DispositivoEntrada {

    //Atributos
    private final int idRaton;
    private static int contadorRatones;

    //Constructores
    public Raton(String tipoDeEntrada, String marca) {
        super(tipoDeEntrada,marca);
        this.idRaton = ++Raton.contadorRatones;
    }
    //Metodos

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Raton{idRaton=").append(this.idRaton);
        sb.append(",tipoEntrada=").append(super.getTipoDeEntrada());
        sb.append(", marca=").append(super.getMarca());
        sb.append('}');
        return sb.toString();
    }
    
}

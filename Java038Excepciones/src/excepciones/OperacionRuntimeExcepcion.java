package excepciones;

public class OperacionRuntimeExcepcion extends RuntimeException{
    public OperacionRuntimeExcepcion(String mensaje){
        super(mensaje);
    }
}

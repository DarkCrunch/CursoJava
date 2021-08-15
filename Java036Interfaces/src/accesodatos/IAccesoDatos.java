package accesodatos;

public interface IAccesoDatos {

    //todos los atributos de una interface son constantes
    public static final int MAX_REGISTRO = 10;
    
    //ademas todos los metodos son abstractos
    public abstract void insertar();
    public abstract void listar();
    public abstract void actualizar();
    public abstract void eliminar();
}

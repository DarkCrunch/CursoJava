package test;
import accesodatos.*;
public class TestInterfaces {
    public static void main(String[] args) {
        //las clases abstractas no se puden instanciar 
        //mas si se puede hacer polimorfismo
        IAccesoDatos datos = new ImplementacionMySQL();
        imprimir(datos);
        
        datos = new ImplementacionOracle();
        imprimir(datos);
    }
    public static void imprimir(IAccesoDatos datos){
        datos.insertar();
        datos.listar();
        datos.actualizar();
        datos.eliminar();
    }
}

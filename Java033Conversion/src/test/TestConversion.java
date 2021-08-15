package test;
import domain.*;
public class TestConversion {

    public static void main(String[] args) {
        Empleado empleado;
        /*DOWNCASTING
        se le conoce por asignacion de referencia del objeto a la clase
        hija. Es decir convertir un objeto padre a un objeto hijo
        */
        empleado = new Escritor("Juan", 5000,TipoEscritura.CLASICO);
        System.out.println("empleado = " + empleado);
        System.out.println(empleado.obtenerDetalles());
        //conversion
        //((Escritor)empleado).getTipoEscritura();
        /*UPCASTING
        se le conoce por asignacion de referencia del objeto de la clase
        padre. Es decir convertir un objeto hijo a un objeto padre
        */
        Escritor escritor = (Escritor)empleado;//Conversion
        escritor.getTipoEscritura();
        
        Empleado empleado2 = escritor;
        System.out.println(empleado2.obtenerDetalles());
    }
}

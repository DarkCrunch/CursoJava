import java.util.Scanner;
//Mi clase en Java
public class HolaMundo {
    public static void main(String args[]) {
        //Primera parte
        int miVariableEntera = 10;
        System.out.println(miVariableEntera);
        //Modificamos el valor de la variable
        miVariableEntera = 5;
        System.out.println(miVariableEntera);

        String miVariableCadena = "Saludos";
        System.out.println(miVariableCadena);

        miVariableCadena = "Adios";
        System.out.println(miVariableCadena);

        //var - Interferencia de tipos en Java
        var miVariableEntera2 = 10;
        System.out.println(miVariableEntera2);

        var miVariableCadena2 = "Nueva Cadena";
        System.out.println("miVariableCadena2 = " + miVariableCadena2);

        var miVariable = 1;
        var _miVariable = 2;
        var $miVariable = 3;
        //var áVariable = 10; No se recomienda utilizar
        //var #miVariable = 2; no se permite utilizar caracteres especiales

        //Segunda Parte
        var usuario = "Aaron";
        var titulo = "Ingeniero";
        var union = titulo + " " + usuario;
        System.out.println("union = " + union);

        var i = 3;
        var j = 4;

        System.out.println(i + j);//se realiza la suma de numeros
        System.out.println(i + j + usuario); //Evaluacion de izquierda a derecha
        System.out.println(usuario + i + j); //contexto cadena, todo es una cadena
        System.out.println(usuario + (i + j));//uso de parentesis modifican la prioridad en la evaluacion

        //Tercera Parte
        var nombre = "Merle";
        System.out.println("Nueva linea: \n" + nombre);
        System.out.println("Tabulador: \t" + nombre);
        System.out.println("Retroceso: \b" + nombre);
        System.out.println("Comilla simple: \'" + nombre + "\'");
        System.out.println("Comilla doble: \"" + nombre + "\"");

        //Cuarta Parte
        System.out.println("\nEscribe tu nombre:");
        Scanner consola = new Scanner(System.in);
        var usuarioNuevo = consola.nextLine();
        System.out.println("usuarioNuevo = " + usuarioNuevo);
        System.out.println("Escribe tu titulo profesional:");
        var tituloNuevo = consola.nextLine();
        System.out.println("tituloNuevo = " + tituloNuevo);
        System.out.println("\nResultado: " + tituloNuevo + " " + usuarioNuevo);
    }
}

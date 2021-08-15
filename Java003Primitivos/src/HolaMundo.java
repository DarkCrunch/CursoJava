
import java.util.Scanner;

//Mi clase en Java
public class HolaMundo {

    public static void main(String args[]) {
        //Primera Parte
        //Primitivos de tipo entero: byte, short, int, long
        byte numeroByte = (byte) 129;
        System.out.println("numeroByte = " + numeroByte);
        System.out.println("valor minimo byte: " + Byte.MIN_VALUE);
        System.out.println("valor maximo byte: " + Byte.MAX_VALUE);

        short numeroShort = (short) 32768;
        System.out.println("numeroShort = " + numeroShort);
        System.out.println("valor minimo short: " + Short.MIN_VALUE);
        System.out.println("valor maximo short: " + Short.MAX_VALUE);

        int numeroInt = (int) 2147483648L;
        System.out.println("numeroInt = " + numeroInt);
        System.out.println("valor minimo int: " + Integer.MIN_VALUE);
        System.out.println("valor maximo int: " + Integer.MAX_VALUE);

        long numeroLong = (long) 9223372036854775808F;
        System.out.println("numeroLong = " + numeroLong);
        System.out.println("valor minimo long: " + Long.MIN_VALUE);
        System.out.println("valor maximo long: " + Long.MAX_VALUE);

        //Segunda parte
        //Primitivos de tipo flotante:float y double
        float numeroFloat = (float) 3.4028236E38D;
        System.out.println("numeroFloat = " + numeroFloat);
        System.out.println("valor minimo float: " + Float.MIN_VALUE);
        System.out.println("valor maximo float: " + Float.MAX_VALUE);

        double numeroDouble = 1.7976931348623157E308D;
        System.out.println("numeroDouble = " + numeroDouble);
        System.out.println("valor minimo double: " + Double.MIN_VALUE);
        System.out.println("valor maximo double: " + Double.MAX_VALUE);

        //Tercera parte
        var numeroEntero = 10;
        System.out.println("numeroEntero = " + numeroEntero);

        var numeroDouBle = 10.0;
        System.out.println("numeroDouble = " + numeroDouble);

        var numeroFLoat = 10.0F;
        System.out.println("numeroFLoat = " + numeroFLoat);

        //Cuarta parte
        char miCaracter = 'a';
        System.out.println("miCaracter = " + miCaracter);

        char varChar = '\u0021';
        System.out.println("varChar = " + varChar);

        char varCharDecimal = 33;
        System.out.println("varCharDecimal = " + varCharDecimal);

        char varCharSimbolo = '!';
        System.out.println("varCharSimbolo = " + varCharSimbolo);

        var varChar1 = '\u0021';
        System.out.println("varChar1 = " + varChar1);

        var varCharDecimaL = (char) 33;
        System.out.println("varCharDecimaL = " + varCharDecimaL);

        var varCharSimbolo1 = '!';
        System.out.println("varCharSimbolo1 = " + varCharSimbolo1);

        int variableEnteraSimbolo = '!';
        System.out.println("variableEnteraSimbolo = " + variableEnteraSimbolo);

        int letra = 'a';
        System.out.println("letra = " + letra);

        //Quinta parte
        boolean varBoolean = true;
        System.out.println("varBoolean = " + varBoolean);

        if (varBoolean) {
            System.out.println("La bandera es verdadera");
        } else {
            System.out.println("La bandera es falsa");
        }

        var edad = 30;
        var esAdulto = edad >= 18;
        if (esAdulto) {
            System.out.println("Eres mayor de edad");
        } else {
            System.out.println("Eres menor de edad");
        }

        //Sexta Parte
        //Convertir tipo string a un tipo int
        var edad2 = Integer.parseInt("20");
        System.out.println("edad2 = " + (edad2 + 1));

        var valorPi = Double.parseDouble("3.1416");
        System.out.println("valorPi = " + valorPi);

        //Pedir un valor
        var consola = new Scanner(System.in);
        System.out.println("Proporciona tu edad:");
        edad = Integer.parseInt(consola.nextLine());
        System.out.println("edad = " + edad);
        
        var edadTexto = String.valueOf(10);
        System.out.println("edadTexto = " + edadTexto);
        
        var caracter = "hola".charAt(1);
        System.out.println("caracter = " + caracter);
        
        System.out.println("Ingrese un caracter:");
        caracter = consola.nextLine().charAt(0);
        System.out.println("caracter = " + caracter);
    }
}

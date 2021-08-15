package test;

public class TestBoxing {

    public static void main(String[] args) {
        //Clases envolventes o Wrapper de tipos primitivos
        /*
        int - Integer
        long - Long
        float - Float
        double - Double
        boolean - Boolean
        byte - Byte
        char - Character
        Short - Short
         */

        //AutoBoxing (de primitivo a Object)
        //variable
        int numero=10;
        //Objetos
        Integer entero = numero;
        //literal entera para hacer calculos
        System.out.println("entero = " + entero);
        //literal entera como cadena de texto
        System.out.println("entero = " + entero.toString());
        //conversion a double
        System.out.println("entero double = " + entero.doubleValue());

        //UnBoxing(de Object a primitivo)
        
        //Variables
        int entero2 = entero;
        System.out.println("entero2 = " + entero2);
    }
}

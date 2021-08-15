package test;

import static aritmetica.Aritmetica.divisionOE;
import excepciones.OperacionExcepcion;

public class TestExcepciones {

    /*
    La clase raiz es throwable
    La clase padre es Exception
    Clase hija: RuntimeException, SQLException
    Clase nieta: NullPointerException extends RuntimeException
     */
    public static void main(String[] args) {
        int resultado = 0;
        try {
            resultado = divisionOE(10, 0);
        }catch (OperacionExcepcion e) {
            System.out.println("Ocurrio un error de tipo OE: " + e.getMessage());
//            e.printStackTrace(System.out);
        } catch (Exception e) {
            System.out.println("Ocurrio un error de tipo E: " + e.getMessage());
//            e.printStackTrace(System.out);
        } finally {
            System.out.println("Se reviso la division entre 0");
        }
        System.out.println("resultado = " + resultado);
    }
}

package aritmetica;

import excepciones.*;

public class Aritmetica {
    public static int divisionOE(int numerador,int denominador) 
            throws OperacionExcepcion{//es obligatorio q vaya throws
        if(denominador==0){
           throw new OperacionExcepcion("Division entre 0");
        }
        return numerador / denominador;
    }
    
    public static int divisionORE(int numerador,int denominador){//como opcional tambien puede ir throws
        if(denominador==0){
           throw new OperacionRuntimeExcepcion("Division entre 0");
        }
        return numerador / denominador;
    }
}

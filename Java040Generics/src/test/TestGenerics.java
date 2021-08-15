/*
        Tipos genericos que se pueden utilizar
        Nombre Tipo Generico    Significado del tipo generico
                  E             Element (utilizado generalmente por el framework
                                de colecciones de java)
                  K             Key(Llave, utilizado en mapas)
                  N             Number(utilizado para numeros)
                  T             Type(representa un tipo, es decir, una clase)
                  V             Value(representa un valor, tambien se usa en 
                                mapas)
              S,U,V etc.        Usado para representar otros tipos
 */
package test;

import genericos.*;

public class TestGenerics {

    public static void main(String[] args) {
        ClaseGenerica<Integer> objetoInt = new ClaseGenerica(15);
        objetoInt.obtenerTipo();
        ClaseGenerica<String> objetoString = new ClaseGenerica("Juan");
        objetoString.obtenerTipo();
    }

}

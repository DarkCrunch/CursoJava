package test;

import java.util.*;

public class TestApiCollection {
    
    public static void main(String[] args) {
        /*
        java.util
        clases padre (interfaces): Collection, Map
        clases hijas (interfaces): Set y List extends Collection
        clases que lo implementan: HashSet implements Set, 
        ArrayList y Vector implements List y HashMap implements Map.
         */
        List miLista = new ArrayList();
        miLista.add("Lunes");
        miLista.add("Martes");
        miLista.add("Miercoles");
        miLista.add("Jueves");
        miLista.add("Viernes");
        miLista.add("Viernes");
        imprimir(miLista);
        
        Set miSet = new HashSet();
        miSet.add("Lunes");
        miSet.add("Martes");
        miSet.add("Miercoles");
        miSet.add("Jueves");
        miSet.add("Viernes");
        miSet.add("Viernes");        
        imprimir(miSet);
        
        Map miMapa = new HashMap();
        miMapa.put("valor1", "Juan");
        miMapa.put("valor2", "Karla");
        miMapa.put("valor3", "Rosario");
        
        String elemento = (String) miMapa.get("valor1");
//        System.out.println("elemento = " + elemento);
        imprimir(miMapa.keySet());
        imprimir(miMapa.values());
    }

    private static void imprimir(Collection objeto) {
//        for(Object elemento: objeto){
//            System.out.println("elemento = " + elemento);
//        }
        //for each en modo funcion lambda ->
        System.out.println("****************************");
        objeto.forEach(elemento -> {
            System.out.println("elemento = " + elemento);
        });
        System.out.println("****************************");
    }
}

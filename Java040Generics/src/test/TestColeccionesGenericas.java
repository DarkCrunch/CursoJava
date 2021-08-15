package test;

import java.util.*;

public class TestColeccionesGenericas {

    public static void main(String[] args) {
        // <> ese simbolo se conoce como anotacion de diamante
        List<String> miLista = new ArrayList<>();
        miLista.add("Lunes");
        miLista.add("Martes");
        miLista.add("Miercoles");
        miLista.add("Jueves");
        miLista.add("Viernes");
        miLista.add("Viernes");
        imprimir(miLista);

        Set<String> miSet = new HashSet<>();
        miSet.add("Lunes");
        miSet.add("Martes");
        miSet.add("Miercoles");
        miSet.add("Jueves");
        miSet.add("Viernes");
        miSet.add("Viernes");
        imprimir(miSet);

        Map<String, String> miMapa = new HashMap<>();
        miMapa.put("valor1", "Juan");
        miMapa.put("valor2", "Karla");
        miMapa.put("valor3", "Rosario");
        miMapa.put("valor3", "Carlos");

        imprimir(miMapa.keySet());
        imprimir(miMapa.values());
    }

    private static void imprimir(Collection<String> objeto) {

        System.out.println("****************************");
        objeto.forEach(elemento -> {
            System.out.println("elemento = " + elemento);
        });
        System.out.println("****************************");
    }
}
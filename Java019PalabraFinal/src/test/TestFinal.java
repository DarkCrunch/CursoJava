package test;

import domain.Persona;

public class TestFinal {

    public static void main(String[] args) {
        //una ez asignado el valor no dejara modificar
        final int miVariable = 10;
        System.out.println("miVariable = " + miVariable);

        System.out.println("Constante = " + Persona.MI_CONSTANTE);

        //objeto no se puede asignar una nueva referencia
        final Persona persona1 = new Persona();
        persona1.setNombre("Juan");
        System.out.println("persona1: " + persona1.getNombre());
        persona1.setNombre("Carlos");
        System.out.println("persona1: " + persona1.getNombre());
    }
}

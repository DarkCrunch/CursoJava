package test;

import domain.Persona;

public class TestJaveBeans {

    public static void main(String[] args) {
        Persona persona = new Persona();
        persona.setNombre("Juan");
        persona.setApellido("Perez");
        
        System.out.println("persona = " + persona);
        
        System.out.println("persona Nombre: " + persona.getNombre());
        System.out.println("persona Apellido: " + persona.getApellido());
    }

}

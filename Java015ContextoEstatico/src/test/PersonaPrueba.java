package test;

import domain.Persona;

public class PersonaPrueba {

    private int contador;

    public static void main(String[] args) {
        //Objetos
        Persona persona1 = new Persona("Juan");
        Persona persona2 = new Persona("Karla");

        imprimir(persona1);
        imprimir(persona2);
    }

    //recuerda q los metodos asociados con la clase deben ser estaticos
    public static void imprimir(Persona persona) {
        System.out.println("persona = " + persona);
    }
    
    public int getContador(){
        imprimir(new Persona("Carlos"));
        return this.contador;
    }
}

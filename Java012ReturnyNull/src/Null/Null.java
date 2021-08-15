/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Null;

import clases.Persona;

/**
 *
 * @author DARKCRUNCH
 */
public class Null {

    public static void main(String[] args) {
        //Objeto
        Persona persona1 = new Persona(),
                persona2 = new Persona();

        persona1.nombre = "Juan";
        persona1.apellido = "Perez";
        persona1.desplegarInformacion();

        persona2 = cambiarValor(persona2);
    }

    public static Persona cambiarValor(Persona persona) {
        if (persona.equals(null)) {
            System.out.println("valor de persona invalido: null");
            return null;
        } else {
            persona.nombre = "Karla";
            persona.apellido = "Lara";
            persona.desplegarInformacion();
            return persona;
        }
    }
}

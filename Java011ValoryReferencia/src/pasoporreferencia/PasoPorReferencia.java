package pasoporreferencia;

import clases.*;

public class PasoPorReferencia {

    public static void main(String[] args) {
        Persona persona1 = new Persona();
        persona1.nombre = "Juan";
        persona1.apellido = "Perez";
        persona1.desplegarInformacion();
        cambiarValor(persona1);
        persona1.desplegarInformacion();
    }

    public static void cambiarValor(Persona persona) {
        persona.nombre = "Karla";
        persona.apellido = "Lara";
    }
}

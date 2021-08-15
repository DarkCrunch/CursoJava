package Return;

import clases.Persona;

public class Return {

    public static void main(String[] args) {
        //Objeto
        Persona persona1 = new Persona();
        Persona persona2 = new Persona();
        
        persona1.nombre="Juan";
        persona1.apellido="Perez";
        persona1.desplegarInformacion();
        
        persona2=cambiarValor(persona2);
    }
    
    public static Persona cambiarValor(Persona persona){
        persona.nombre="Karla";
        persona.apellido="Lara";
        persona.desplegarInformacion();
        return persona;
    }
    
}

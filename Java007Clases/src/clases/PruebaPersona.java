package clases;

public class PruebaPersona {

    //atajo psvm
    public static void main(String[] args) {
        //Objetos o instancias de la clase
        Persona persona1 = new Persona();
        Persona persona2 = new Persona();
        
        //Asignacion de valores a los atributos del objeto
        persona1.nombre = "Juan";
        persona1.apellido = "Perez";
        persona1.desplegarInformacion();
        
        persona2.nombre="Karla";
        persona2.apellido="Lara";
        persona2.desplegarInformacion();
        
        //Ubicacion en la memoria RAM de los objetos
        System.out.println("persona1 = " + persona1);
        System.out.println("persona2 = " + persona2);
    }
}
